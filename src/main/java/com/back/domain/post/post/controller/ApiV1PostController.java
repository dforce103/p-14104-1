package com.back.domain.post.post.controller;

import com.back.domain.post.post.entity.Post;
import com.back.domain.post.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@RequiredArgsConstructor
@Controller
public class ApiV1PostController {
    private final PostService postService;

    @GetMapping("/api/v1/posts")
    @ResponseBody // 이 어노테이션이 있어야 JSON으로 응답한다.
    public List<Post> getItems() {
        List<Post> items = postService.findAll();

        return items;
    }
}
