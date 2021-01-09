package com.pudding.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jiefeng
 * @version 1.0
 * @className Person
 * @description TODO
 * @date 2021/1/9 11:06
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String id;
    private String name;
}
