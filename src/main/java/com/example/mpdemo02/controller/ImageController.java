package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Image;
import com.example.mpdemo02.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Image")
public class ImageController {
    @Autowired
    private ImageService imageService;
    @GetMapping("/one")
    public Image one(Integer id){
        return imageService.getById(id);
    }
    @GetMapping("/all")
    public List<Image> list(){
        return imageService.list();
    }
    @PostMapping("/add")
    public boolean add(Image image){
        return imageService.save(image);
    }
    @PostMapping("/update")
    public boolean update(Image image){
        return imageService.updateById(image);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return imageService.removeById(id);
    }
}
