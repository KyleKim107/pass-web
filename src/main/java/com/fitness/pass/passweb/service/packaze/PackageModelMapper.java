package com.fitness.pass.passweb.service.packaze;


import com.fitness.pass.passweb.repository.packaze.PackageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

import static org.mapstruct.factory.Mappers.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PackageModelMapper
{

    PackageModelMapper INSTANCE = getMapper(PackageModelMapper.class);

    List<Package> map(List<PackageEntity> packageEntities);

}
