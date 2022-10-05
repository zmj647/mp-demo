package com.example.mpdemo02.controller;


import com.example.mpdemo02.pojo.BackendApi;
import com.example.mpdemo02.service.BackendApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/BackendApi")
public class BackendApiController {
    @Autowired
    private BackendApiService backendApiService;

    @GetMapping("/one")
    public BackendApi selectById(Integer id){
        return backendApiService.getById(id);
    }
    @GetMapping("/all")
    public List<BackendApi> list(){
        return backendApiService.list();
    }
    @PostMapping("/add")
    public boolean add(BackendApi backendApi){
        return backendApiService.save(backendApi);
    }
    @PostMapping("/update")
    public boolean update(BackendApi backendApi){
        return backendApiService.updateById(backendApi);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return backendApiService.removeById(id);
    }
}
