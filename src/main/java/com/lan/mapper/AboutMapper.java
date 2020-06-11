package com.lan.mapper;

import com.lan.pojo.About;
import com.lan.pojo.AboutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AboutMapper {
    int countByExample(AboutExample example);

    int deleteByExample(AboutExample example);

    int deleteByPrimaryKey(Integer aboutId);

    int insert(About record);

    int insertSelective(About record);

    List<About> selectByExampleWithBLOBs(AboutExample example);

    List<About> selectByExample(AboutExample example);

    About selectByPrimaryKey(Integer aboutId);

    int updateByExampleSelective(@Param("record") About record, @Param("example") AboutExample example);

    int updateByExampleWithBLOBs(@Param("record") About record, @Param("example") AboutExample example);

    int updateByExample(@Param("record") About record, @Param("example") AboutExample example);

    int updateByPrimaryKeySelective(About record);

    int updateByPrimaryKeyWithBLOBs(About record);
}