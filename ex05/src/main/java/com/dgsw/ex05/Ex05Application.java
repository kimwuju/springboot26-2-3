package com.dgsw.ex05;

import com.dgsw.ex05.computer.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootApplication
public class Ex05Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Ex05Application.class, args);
        System.out.println("기본 스프링에 담겨진 객체 갯수: " + context.getBeanDefinitionCount());
//        Computer computer1 = context.getBean(Computer.class);
//        Computer computer2 = context.getBean(Computer.class);
//        Computer computer3 = new Computer(); // 객체를 계속 새로 생성하기 때문에
//                                             // 메모리 낭비가 발생한다
//
//        System.out.println(computer1 == computer2);
//        System.out.println(computer1 == computer3);

//        String [] beanNames = context.getBeanDefinitionNames();
//        Stream.of(beanNames)
//                .forEach(System.out::println);
    }

}
