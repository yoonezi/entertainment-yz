package com.yz.service.dto.reqeust;

import lombok.Builder;

@Builder
public record UpdateCelebrityServiceRequest (
        Long celebrityId,
        String name,
        Long subscriberCount,
        Long movieCount
) {}