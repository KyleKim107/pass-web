package com.fitness.pass.passweb.repository.packaze;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PackageRepository extends JpaRepository<PackageEntity, Integer> {
    List<PackageEntity> findAllByOrderByPackageName();

}
