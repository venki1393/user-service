package com.firefly.user.repository;

import com.firefly.user.entity.Usere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsereRepository extends JpaRepository<Usere,Long> {
    Usere findByUsereId(Long userId);
}
