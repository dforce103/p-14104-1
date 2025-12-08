package com.back.domain.post.postComment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@ActiveProfiles("test") // application-test.yml 을 활성화
@SpringBootTest
 // MockMvc 를 빈으로 등록
public class ApiV1PostCommentControllerTest {
    @Autowired
    private MockMvc mvc;
}