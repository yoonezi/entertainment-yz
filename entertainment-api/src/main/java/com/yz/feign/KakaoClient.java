package com.yz.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "kakaoClient", url = "https://dapi.kakao.com/v2/search/vclip")
public interface KakaoClient {

    @GetMapping
    String searchVideo(@RequestHeader("Authorization") String authorization,
                       @RequestParam("query") String query);
}