package com.dgsw.ex06.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import javax.xml.transform.Result;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
class MemberControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getMembers() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/members"));

        resultActions.andDo(print())
                .andExpect(jsonPath("$[0].name").value("홍길동"));
    }

    @Test
    void getMember() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/memeber/2"));
        resultActions.andDo(print())
                .andExpect(jsonPath("$.name").value("종길동"))
                .andExpect(jsonPath("$.email").value("bb@gmail.com"));
    }

    @Test
    void save() throws Exception {
        ResultActions resultActions = mockMvc.perform(post("/members"));

        resultActions.andDo(print());
    }

    @Test
    void update() {
    }

    @Test
    void deleteMember() {
    }
}