package com.yz.core.domain.celebrity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CelebrityRepository extends JpaRepository<Celebrity, Long> {
    Optional<Celebrity> findByName(String name);
}
