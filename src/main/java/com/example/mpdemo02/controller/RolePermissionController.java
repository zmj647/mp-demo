package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.RolePermission;
import com.example.mpdemo02.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/RolePermission")
public class RolePermissionController {
    @Autowired
    private RolePermissionService rolePermissionService;
    @GetMapping("/{id}")
    public RolePermission one(@PathVariable Integer id){
        return rolePermissionService.getById(id);
    }
    @GetMapping("/all")
    public List<RolePermission> all(){
        return rolePermissionService.list();
    }
    @PostMapping("/add")
    public boolean add(RolePermission role){
        return rolePermissionService.save(role);
    }
    @PostMapping("/update")
    public boolean update(RolePermission role){
        return rolePermissionService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return rolePermissionService.removeById(id);
    }
}
