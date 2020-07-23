package com.TeleMedic.Server.Service;

import com.TeleMedic.Server.Mapper.DataRepository;
import com.TeleMedic.Server.Model.User;
import com.mongodb.client.DistinctIterable;
import com.mongodb.client.MongoCursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {

    @Autowired
    DataRepository dataRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    public void saveData(User user){
        dataRepository.save(user);
    }

    public List<User> getData(String username){
        return dataRepository.findByUsername(username);
    }

    public List<String> getAllUser(){
        DistinctIterable<String> iterable = mongoTemplate.getCollection("user").distinct("username",String.class);
        MongoCursor<String> cursor = iterable.iterator();
        List<String> list = new ArrayList<>();
        while (cursor.hasNext()) {
            list.add(cursor.next());
        }
        System.out.println(list);
        return list;
    }

}
