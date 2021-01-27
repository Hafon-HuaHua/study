package com.study.main.mapper;

import com.study.main.domain.TVehicleSaleRecord;
import java.util.List;

public interface TVehicleSaleRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TVehicleSaleRecord record);

    TVehicleSaleRecord selectByPrimaryKey(Long id);

    List<TVehicleSaleRecord> selectAll();

    int updateByPrimaryKey(TVehicleSaleRecord record);
}