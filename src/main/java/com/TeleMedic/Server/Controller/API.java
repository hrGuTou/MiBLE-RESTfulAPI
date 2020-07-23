package com.TeleMedic.Server.Controller;


import com.TeleMedic.Server.Model.User;
import com.TeleMedic.Server.Service.DataService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class API {

    @Autowired
    DataService dataService;

    @PostMapping("/save")
    public Object save(@RequestBody User user){
        dataService.saveData(user);
        JSONObject res = new JSONObject();
        res.put("status","OK");
        return res;
    }

    @GetMapping("/get")
    public Object get(@RequestBody User user){
        JSONObject res = new JSONObject();
        List<User> u;
        u = dataService.getData(user.getUsername());
        if(u==null){
            res.put("Error","No such user");
            return res;
        }
        return u;
    }

    @GetMapping("/allUser")
    public Object allUser(){
        JSONObject res = new JSONObject();
        List<String> users;
        users = dataService.getAllUser();
        if(users==null){
            res.put("Error", "No users");
        }

        return users;
    }



}
