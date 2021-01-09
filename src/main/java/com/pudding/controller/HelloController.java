package com.pudding.controller;

import com.pudding.pojo.Person;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.UUID;

/**
 * @author jiefeng
 * @version 1.0
 * @className HelloController
 * @description TODO
 * @date 2021/1/9 11:05
 */
@Controller("/hello")
public class HelloController {
    @Get
    public Person index() {
        return Person.builder()
                .id(UUID.randomUUID().toString())
                .name("hello")
                .build();
    }
}
