package com.puntosingular.base.repository;

import org.springframework.data.repository.CrudRepository;

import com.puntosingular.base.models.User;

public interface UserRepository extends CrudRepository<User,Long>{

}
