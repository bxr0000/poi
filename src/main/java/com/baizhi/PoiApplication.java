package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PoiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoiApplication.class, args);
        System.out.println();
        System.out.println("this is a good boy");
        System.out.println("你在吗？老板");
        System.out.println("我在，什么事，又要请假吗");
        System.out.println("我是你爸爸");
    }
}
