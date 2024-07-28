package com.yz.web.dto.reqeust;

import com.yz.service.dto.reqeust.UpdateCelebrityServiceRequest;
import lombok.Builder;

@Builder
public record UpdateCelebrityRequest (
        Long celebrityId,
        String name,
        Long subscriberCount,
        Long movieCount
) {
    public UpdateCelebrityServiceRequest toServiceDto(Long celebrityId)
    {
        return UpdateCelebrityServiceRequest.builder()
                .celebrityId(celebrityId)
                .name(this.name)
                .subscriberCount(this.subscriberCount)
                .movieCount(this.movieCount)
                .build();
    }
}