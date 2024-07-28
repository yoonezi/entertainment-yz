package com.yz.web.dto.reqeust;

import com.yz.service.dto.reqeust.CreateCelebrityServiceRequest;
import lombok.Builder;

@Builder
public record CreateCelebrityRequest (
        String name,
        Long subscriberCount,
        Long movieCount
) {
    public CreateCelebrityServiceRequest toServiceDto()
    {
        return CreateCelebrityServiceRequest.builder()
                .name(this.name)
                .subscriberCount(this.subscriberCount)
                .movieCount(this.movieCount)
                .build();
    }
}
