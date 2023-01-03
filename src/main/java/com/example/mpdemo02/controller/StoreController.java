package com.example.mpdemo02.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mpdemo02.Result.Result;
import com.example.mpdemo02.Result.ResultCode;
import com.example.mpdemo02.exception.MyException;
import com.example.mpdemo02.mapper.StoreMapper;
import com.example.mpdemo02.pojo.Store;
import com.example.mpdemo02.service.StoreService;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * <p>
 *  Controller
 * </p>
 *
 * @author Administrator
 * @author zmj
 * @since 2022-12-31 04:18:40
 */
@CrossOrigin
/**
 * 解决跨域问题
 */
@RestController
@RequestMapping("/store")
public class StoreController {

@Resource
private StoreService storeService;


/**
* 新增
* @param store
* @return
*/
@PostMapping("/save")
public Result save(@RequestBody Store store){
    boolean flag = storeService.saveOrUpdate(store);
    if (flag){
        return Result.ok();
    }else {
        return Result.error();
    }

}

 /**
* 删除单个
* @param id
* @return
*/
            @DeleteMapping("/delete/{id}")
public Result delete(@PathVariable Integer id){
            boolean flag = storeService.removeById(id);
            if (flag){
                return Result.ok();
            }else {
                return Result.error(ResultCode.NODATA);
            }

        }

/**
* 删除多个
* @param ids
* @return
*/
        @PostMapping("/del/batch")
public boolean deleteBatch(@RequestBody List<Integer> ids){
        return storeService.removeByIds(ids);
        }

/**
* 分页查询全部
* @return
*/
        @GetMapping("/all")
public Result<Page> findAll(Integer pageNum, Integer pageSize, String name){
            //分页构造器
            Page<Store> pageInfo = new Page<>(pageNum,pageSize);
            //条件构造器
            LambdaQueryWrapper<Store> queryWrapper = new LambdaQueryWrapper<>();
            //添加过滤条件
            if (name != null) {
                queryWrapper.like(Store::getName,name);
            }
            //排序条件
            queryWrapper.orderByAsc(Store::getCreateTime);
            //执行查询
            storeService.page(pageInfo,queryWrapper);
            Map<String, Object> storeMap = new HashMap<>(11);
            storeMap.put("store",pageInfo);
            return Result.ok(storeMap);
        }

/**
* 根据ID查询
* @param id
* @return
*/
        @GetMapping("/{id}")
public Result findOne(@PathVariable Integer id){
            if (id == null){
                throw new MyException(ResultCode.NOID);
            }
            Store store = storeService.getById(id);
            if (store == null){
                return Result.error(ResultCode.NODATA);
            }
            Map<String,Object> map = new HashMap<>();
            map.put("department",store);
            return Result.ok(map);
        }

/**
* 修改
* @param store
* @return
*/
        @PutMapping("/update")
public Result update(@RequestBody Store store){
            boolean flag = storeService.updateById(store);
            if (flag){
                return Result.ok();
            }
            return Result.error();
        }

}
