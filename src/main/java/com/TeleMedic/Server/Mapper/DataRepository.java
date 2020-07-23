package com.TeleMedic.Server.Mapper;

import com.TeleMedic.Server.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DataRepository extends MongoRepository<User, String> {

    List<User> findByUsername(String username);

}
