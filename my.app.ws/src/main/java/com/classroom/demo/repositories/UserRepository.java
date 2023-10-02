package com.classroom.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.classroom.demo.entities.UserEntity;


@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
