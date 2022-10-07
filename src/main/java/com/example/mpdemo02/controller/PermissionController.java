package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Permission;
import com.example.mpdemo02.service.PermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;
    @GetMapping("/{id}")
    public Permission one(@PathVariable Integer id){
        return permissionService.getById(id);
    }
    @GetMapping("/all")
    public List<Permission> all(){
        return permissionService.list();
    }
    @PostMapping("/add")
    public boolean add(Permission permission){
        return permissionService.save(permission);
    }
    @PostMapping("/update")
    public boolean update(Permission permission){
        return permissionService.updateById(permission);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return permissionService.removeById(id);
    }
}
