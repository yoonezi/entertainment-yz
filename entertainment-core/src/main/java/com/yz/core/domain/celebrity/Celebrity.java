package com.yz.core.domain.celebrity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@Setter
public class Celebrity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long celebrityId;
    private String name;
    private Long subscriberCount;
    private Long movieCount;

    public void update(
            Long celebrityId,
            String name,
            Long subscriberCount,
            Long movieCount
    ) {
        this.celebrityId = celebrityId;
        this.name = name;
        this.subscriberCount = subscriberCount;
        this.movieCount = movieCount;
    }
}
