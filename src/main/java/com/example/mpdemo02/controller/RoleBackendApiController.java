package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.RoleBackendApi;
import com.example.mpdemo02.service.RoleBackendApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/RoleBackendApi")
public class RoleBackendApiController {
    @Autowired
    private RoleBackendApiService roleBackendApiService;
    @GetMapping("/{id}")
    public RoleBackendApi one(@PathVariable Integer id){
        return roleBackendApiService.getById(id);
    }
    @GetMapping("/all")
    public List<RoleBackendApi> all(){
        return roleBackendApiService.list();
    }
    @PostMapping("/add")
    public boolean add(RoleBackendApi roleBackend){
        return roleBackendApiService.save(roleBackend);
    }
    @PostMapping("/update")
    public boolean update(RoleBackendApi roleBackend){
        return roleBackendApiService.updateById(roleBackend);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return roleBackendApiService.removeById(id);
    }
}
