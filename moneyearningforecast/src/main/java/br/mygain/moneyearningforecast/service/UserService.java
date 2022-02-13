package br.mygain.moneyearningforecast.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.mygain.moneyearningforecast.model.User;
import br.mygain.moneyearningforecast.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	private static UserService userService;
	public static synchronized UserService getInstance() {
		if(Objects.isNull(userService)) {
			userService = new UserService();
		}
		return userService;
	}
	public void create(User user) {
		userRepository.save(user);
	}
}
