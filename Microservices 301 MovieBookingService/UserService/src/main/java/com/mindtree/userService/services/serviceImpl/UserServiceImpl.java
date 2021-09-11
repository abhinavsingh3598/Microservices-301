package com.mindtree.userService.services.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.userService.configs.ExternalAdminService;
import com.mindtree.userService.configs.ExternalSearchService;
import com.mindtree.userService.dtos.PreferenceRequestDto;
import com.mindtree.userService.dtos.PreferenceResponseDTO;
import com.mindtree.userService.dtos.ReviewRequestDto;
import com.mindtree.userService.dtos.ReviewResponseDto;
import com.mindtree.userService.dtos.UserRequestDto;
import com.mindtree.userService.dtos.UserResponseDto;
import com.mindtree.userService.exceptions.GenreIDInvalid;
import com.mindtree.userService.exceptions.MovieIDInvalid;
import com.mindtree.userService.exceptions.PreferenceIDInvalid;
import com.mindtree.userService.exceptions.ServiceException;
import com.mindtree.userService.exceptions.UserIDInvalid;
import com.mindtree.userService.models.Preference;
import com.mindtree.userService.models.Review;
import com.mindtree.userService.models.User;
import com.mindtree.userService.repositories.PreferenceRepository;
import com.mindtree.userService.repositories.ReviewRepository;
import com.mindtree.userService.repositories.UserRepository;
import com.mindtree.userService.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	ModelMapper modelMapper = new ModelMapper();

	@Autowired
	UserRepository userRepository;

	@Autowired
	PreferenceRepository preferenceRepository;

	@Autowired
	ReviewRepository reviewRepository;

	@Autowired
	ExternalAdminService externalAdminService;

	@Autowired
	ExternalSearchService externalSearchService;

	@Override
	public UserResponseDto addUserToDB(UserRequestDto userRequestDto) {
		return convert(userRepository.save(convert(userRequestDto, new User())), new UserResponseDto());
	}

	@Override
	public PreferenceResponseDTO addPreferenceToDB(PreferenceRequestDto preferenceRequestDto) throws ServiceException {

		if (!externalAdminService.validateGenreInDB(preferenceRequestDto.getGenreId()).getBody().getBody()) {
			throw new GenreIDInvalid("Please Check the Genre Id Entered");
		}

		Preference preference=new Preference();
		preference.setGenreId(preferenceRequestDto.getGenreId());
		preference.setLanguage(preferenceRequestDto.getLanguage());
		
		return convert(preferenceRepository.save(preference),
				new PreferenceResponseDTO());
	}

	@Override
	public ReviewResponseDto addReviewToDB(ReviewRequestDto reviewRequestDto, int userId) throws ServiceException {
		User user = userRepository.findById(userId).orElseThrow(() -> new UserIDInvalid("user id invalid"));

		if (!externalSearchService.validateMovieIdFromDB(reviewRequestDto.getMovieId()).getBody().getBody()) {
			throw new MovieIDInvalid("Movie Id Is Not Valid");
		}

		Review review = new Review(reviewRequestDto.getRating(), reviewRequestDto.getReviewDescription(), user,
				reviewRequestDto.getMovieId());
		Review savedReview = reviewRepository.save(review);
		user.getReview().add(savedReview);
		return convert(savedReview, new ReviewResponseDto());
	}

	@Override
	public String assignPreferenceToUser(int userId, int preferenceId) throws ServiceException {
		User user = userRepository.findById(userId).orElseThrow(() -> new UserIDInvalid("user id invalid"));
		Preference preference = preferenceRepository.findById(preferenceId)
				.orElseThrow(() -> new PreferenceIDInvalid("Preference Id is not valid"));

		preference.getUsers().add(user);
		user.setPreference(preference);
		preferenceRepository.saveAndFlush(preference);
		userRepository.saveAndFlush(user);
		return "assigned preference for user";
	}

	@Override
	public UserResponseDto updateUserDetailsToDB(UserRequestDto userRequestDto, int userId) throws ServiceException {

		User user = userRepository.findById(userId).orElseThrow(() -> new UserIDInvalid("user id invalid"));
		if (userRequestDto.getEmail() != null && !user.getEmail().equals(userRequestDto.getEmail())) {
			user.setEmail(userRequestDto.getEmail());
		}
		if (userRequestDto.getUserName() != null && !user.getUserName().equals(userRequestDto.getUserName())) {
			user.setUserName(userRequestDto.getUserName());
		}
		if (userRequestDto.getUserType() != null && !user.getUserType().equals(userRequestDto.getUserType())) {
			user.setUserType(userRequestDto.getUserType());
		}

		return convert(userRepository.saveAndFlush(user), new UserResponseDto());
	}

	@Override
	public List<UserResponseDto> getAllUsersFromDB() {
		return userRepository.findAll().stream().map(u -> convert(u, new UserResponseDto()))
				.collect(Collectors.toList());
	}

	@SuppressWarnings("unchecked")
	public <U, T> U convert(T obj1, U obj2) {
		return (U) modelMapper.map(obj1, obj2.getClass());
	}

	@Override
	public PreferenceResponseDTO getPreferenceByIDFromDB(int preferenceId) throws ServiceException {
		return convert(preferenceRepository.findById(preferenceId).
				orElseThrow(()->new PreferenceIDInvalid("Preference Id is not valid")),new PreferenceResponseDTO());
		
	}

}