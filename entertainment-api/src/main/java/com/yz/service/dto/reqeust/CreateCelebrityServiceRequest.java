package com.yz.service.dto.reqeust;

import lombok.Builder;

@Builder
public record CreateCelebrityServiceRequest(
        String name,
        Long subscriberCount,
        Long movieCount
) { }
