package com.example.mpdemo02;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

import java.util.Collections;
import java.util.function.Consumer;

/**
 * 代码生成器
 */
public class MyAutoGenerator {
    public static void main(String[] args) {

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/store?", "root", "zmj")
                .globalConfig(builder -> {
                    builder.author("zmj") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .commentDate("yyyy-MM-dd hh:mm:ss")   //注释日期
                            .dateType(DateType.ONLY_DATE)
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(System.getProperty("user.dir")+"\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example") // 设置父包名
                            .moduleName("mpdemo02") // 设置父包模块名
                            .entity("entity")
                            .mapper("mapper")
                            .serviceImpl("service.impl")
                            .service("service")
                            .controller("controller")
                            .xml("mapper")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml,System.getProperty("user.dir")+"\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("store") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_") // 设置过滤表前缀
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .entityBuilder()
                            .versionColumnName("Version")
                            .enableLombok()
                            .logicDeleteColumnName("delete")
                            .logicDeletePropertyName("delete")
                            .enableTableFieldAnnotation()
                            .controllerBuilder()
                            .enableRestStyle()
                            .mapperBuilder()
                            .superClass(BaseMapper.class)
                            .formatMapperFileName("%sMapper")
                            .enableMapperAnnotation()
                            .formatXmlFileName("%sMapper");
                })
                .templateConfig(builder -> {
                    // 实体类使用我们自定义模板
                    //builder.entity("templates/myentity.java");
                    builder.controller("templates/controller.java");
                })
                .templateEngine(new VelocityTemplateEngine())// 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
