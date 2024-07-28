package com.yz.web.dto.response;

import com.yz.core.domain.celebrity.Celebrity;

public record CelebrityResponse(
        Long celebrityId,
        String name,
        Long subscriberCount,
        Long movieCount
) {
    public static CelebrityResponse of(Celebrity celebrity)
    {
        return new CelebrityResponse(
                celebrity.getCelebrityId(),
                celebrity.getName(),
                celebrity.getSubscriberCount(),
                celebrity.getMovieCount()
        );
    }
}
