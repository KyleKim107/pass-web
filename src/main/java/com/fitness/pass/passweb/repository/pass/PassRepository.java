package com.fitness.pass.passweb.repository.pass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PassRepository extends JpaRepository<PassEntity, Integer> {
    // if endedAt date has null value, it means that the pass will not be expired.
    // endedAt 'null first' means that display null valued endedDate in the front.
    @Query(value = "select p from PassEntity p " +
            "join fetch p.packageEntity " +
            "where p.userId = :userId " +
            "order by p.endedAt desc nulls first ")
    List<PassEntity> findByUserId(String userId);
}
