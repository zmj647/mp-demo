package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.ClassRoom;
import com.example.mpdemo02.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ClassRoom")
public class ClassRoomController {
    @Autowired
    private ClassRoomService classRoomService;

    @GetMapping("/one")
    public ClassRoom one(Integer id){
        return classRoomService.getById(id);
    }
    @GetMapping("/all")
    public List<ClassRoom> list(){
        return classRoomService.list();
    }
    @PostMapping("/add")
    public boolean add(ClassRoom classRoom){
        return classRoomService.save(classRoom);
    }
    @PostMapping("/update")
    public boolean upadte(ClassRoom classRoom){
        return classRoomService.updateById(classRoom);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return classRoomService.removeById(id);
    }
}
