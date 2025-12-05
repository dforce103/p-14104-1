package com.back.domain.post.post.controller;

import com.back.domain.post.post.entity.Post;
import com.back.domain.post.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1")
@RequiredArgsConstructor
@RestController
public class ApiV1PostController {
    private final PostService postService;

    @GetMapping("/posts")
//    @ResponseBody // 이 어노테이션이 있어야 JSON으로 응답한다. -> @Controller -> @RestController
    public List<Post> getItems() {
        List<Post> items = postService.findAll();

        return items;
    }
}
