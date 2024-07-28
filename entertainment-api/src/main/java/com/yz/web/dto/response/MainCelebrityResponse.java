package com.yz.web.dto.response;

import com.yz.core.domain.celebrity.Celebrity;
import lombok.Builder;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.stream.Collectors;

@Builder
public record MainCelebrityResponse (
        int page,
        int size,
        long totalCount,
        List<CelebrityResponseList> celebrityResponseLists
) {
    public static MainCelebrityResponse of(Page<Celebrity> celebrities)
    {
        List<CelebrityResponseList> celebrityResponseList = celebrities.getContent().stream()
                .map(celebrity -> new CelebrityResponseList(
                        celebrity.getCelebrityId(),
                        celebrity.getName(),
                        celebrity.getSubscriberCount(),
                        celebrity.getMovieCount()
                ))
                .collect(Collectors.toList());

        return MainCelebrityResponse.builder()
                .page(celebrities.getPageable().getPageNumber())
                .size(celebrities.getSize())
                .totalCount(celebrities.getTotalElements())
                .celebrityResponseLists(celebrityResponseList)
                .build();
    }


    public record CelebrityResponseList(
            Long celebrityId,
            String name,
            Long subscriberCount,
            Long movieCount
    ) {}
}
