package com.yz.web;

import com.yz.service.KakaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/kakao")
public class KaKaoController {
    private final KakaoService kakaoService;

    @GetMapping("/search")
    public String search(@RequestParam(name = "query") String query) {
        String accessToken = "7723d8be4e65f5e0a2eb34e87f0ba091";
        System.out.println("hi");
        return kakaoService.searchVideo(query, accessToken);
    }
}
