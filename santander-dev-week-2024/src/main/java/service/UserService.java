package service;

import me.dio.santander_dev_week_2024.User;

public interface UserService {
	User findById(Long id);
	
	User create(User useToCreate);
	

}
