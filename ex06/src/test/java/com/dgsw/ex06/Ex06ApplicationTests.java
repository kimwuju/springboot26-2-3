package com.dgsw.ex06;

import com.dgsw.ex06.controller.MemberController;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ex06ApplicationTests {

    @Autowired
    MemberController memberController;

    @BeforeAll
    static void beforeAll() {
        System.out.println("전체 테스트 시작");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("전체 테스트 종료");
    }

    @BeforeEach
    void setUp() {
        System.out.println("테스트 시작");
    }

    @AfterEach
    void tearDown() {
        System.out.println("테스트 종료");
    }

    @Test
    @DisplayName("컨텍스트 로드 테스트")
    void contextLoads() {
        System.out.println("잘되나");
    }

    @Test
    @DisplayName("테스트 메서드")
    void testMethod() {
        System.out.println("테스트 메서드");
    }

    @Test
    void doA() {
        int a = 10;
        int b = 20;

        Assertions.assertEquals(30, a + b);
    }

}
