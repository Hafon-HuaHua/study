package com.study.main.mapper;

import com.study.main.domain.Uoimauth;
import java.util.List;

public interface UoimauthMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Uoimauth record);

    Uoimauth selectByPrimaryKey(Long id);

    List<Uoimauth> selectAll();

    int updateByPrimaryKey(Uoimauth record);
}