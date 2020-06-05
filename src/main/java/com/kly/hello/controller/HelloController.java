package com.kly.hello.controller;

import com.kly.hello.config.ApiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/16 18:34
 */
@RestController
public class HelloController {
//    @Value("${hello.name}")
//    private String name;
    @Autowired
    ApiConfig apiConfig;
    @RequestMapping("/hello")
    public String index() {
        return "hello world:"+ apiConfig.name + "," + apiConfig.value + ":" + apiConfig.bigNumber
                + ":" + apiConfig.test1;
    }


    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        condition.await();
        condition.signal();

    }



}
