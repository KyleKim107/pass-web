package com.fitness.pass.passweb.service.pass;


import com.fitness.pass.passweb.controller.admin.BulkPassRequest;
import com.fitness.pass.passweb.repository.pass.BulkPassEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

import static org.mapstruct.factory.Mappers.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BulkPassModelMapper {
    BulkPassModelMapper INSTANCE = getMapper(BulkPassModelMapper.class);

    List<BulkPass> map(List<BulkPassEntity> passEntities);

    BulkPassEntity map(BulkPassRequest bulkPassRequest);

}
