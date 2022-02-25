package com.example.SpringbootPractice.service.posts;


import com.example.SpringbootPractice.domain.posts.PostRepository;
import com.example.SpringbootPractice.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostRepository postRepository;

    @Transactional
    public static Long save(PostsSaveRequestDto requestDto){
        return postRepository.save(requestDto.toEntity()).
                getId();
    }
}
