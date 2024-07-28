package com.yz.service;

import com.yz.feign.KakaoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class KakaoService {

    private final KakaoClient kakaoClient;

    public String searchVideo(String query, String accessToken) {
        String authorizationHeader = "KakaoAK " + accessToken;
        return kakaoClient.searchVideo(authorizationHeader, query);
    }
}