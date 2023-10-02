package com.classroom.demo.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroom.demo.entities.UserEntity;
import com.classroom.demo.repositories.UserRepository;
import com.classroom.demo.services.UserService;
import com.classroom.demo.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
	
  @Autowired	
  UserRepository userRepository ;
	@Override
	public UserDto creatUser(UserDto user) {
		UserEntity userEntity =new UserEntity();
	BeanUtils.copyProperties(user, userEntity);
	userEntity.setEncryptedpassword("test Password");
	userEntity.setUserId("test user id ");
	UserEntity newUser =userRepository.save(userEntity);
	UserDto userDto=new UserDto();
	BeanUtils.copyProperties(newUser, userDto);
		return userDto ;
	}

}
