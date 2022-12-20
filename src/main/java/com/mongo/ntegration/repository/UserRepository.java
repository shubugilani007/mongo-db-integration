package com.mongo.ntegration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mongo.ntegration.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	@Query("{userId:'?0'}")
	User findOne(String userId);

}
