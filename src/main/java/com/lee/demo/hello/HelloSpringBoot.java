package com.lee.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pi on 2019/4/17.
 */
@RestController
public class HelloSpringBoot {
    @RequestMapping(path = {"/helloSpringBoot"})
    public String HelloSpring() {
        System.out.println("hello spring boot");
        return "hello spring boot";
    }
}
