package service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;
import me.dio.santander_dev_week_2024.User;
import repository.UserRepository;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository=userRepository;
		 
	}

	@Override
	public User findById(Long id) {
		
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if (userToCreate.getId()!=null && userRepository.existsById(userToCreate.getId())) {
			throw new IllegalArgumentException("This  User ID alredy exists");
		}
		
		return userRepository.save(userToCreate);
	}

}
