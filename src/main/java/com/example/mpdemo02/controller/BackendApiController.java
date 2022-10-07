package com.example.mpdemo02.controller;


import com.example.mpdemo02.pojo.BackendApi;
import com.example.mpdemo02.service.BackendApiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "用户")
@RestController
@RequestMapping("/BackendApi")
public class BackendApiController {
    @Autowired
    private BackendApiService backendApiService;
    @ApiOperation("查找单个")
    @GetMapping("/one")
    public BackendApi selectById(Integer id){
        return backendApiService.getById(id);
    }
    @ApiOperation("查询全部")
    @GetMapping("/all")
    public List<BackendApi> list(){
        return backendApiService.list();
    }
    @ApiOperation("添加")
    @PostMapping("/add")
    public boolean add(BackendApi backendApi){
        return backendApiService.save(backendApi);
    }
    @ApiOperation("更新")
    @PostMapping("/update")
    public boolean update(BackendApi backendApi){
        return backendApiService.updateById(backendApi);
    }
    @ApiOperation("删除")
    @PostMapping("/del")
    public boolean del(Integer id){
        return backendApiService.removeById(id);
    }
}
