package com.ascorp.com.ascorp.productcatalog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ascorp.com.ascorp.productcatalog.model.UserRecord;
import com.ascorp.com.ascorp.productcatalog.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<UserRecord> getAllUsers() {
		List<UserRecord> userRecords = new ArrayList<>();
		userRepository.findAll().forEach(userRecords::add);
		return userRecords;
	}

	public Optional<UserRecord> getUser(String id) {
		return userRepository.findById(id);
	}

	public void addUser(UserRecord userRecord) {
		userRepository.save(userRecord);
	}

	public void delete(String id) {
		userRepository.deleteById(id);
	}

	public void save(ArrayList<UserRecord> UserList) {
		userRepository.saveAll(UserList);

	}
}