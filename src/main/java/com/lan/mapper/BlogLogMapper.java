package com.lan.mapper;

import com.lan.pojo.BlogLog;
import com.lan.pojo.BlogLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogLogMapper {
    int countByExample(BlogLogExample example);

    int deleteByExample(BlogLogExample example);

    int deleteByPrimaryKey(Integer blogLogId);

    int insert(BlogLog record);

    int insertSelective(BlogLog record);

    List<BlogLog> selectByExampleWithBLOBs(BlogLogExample example);

    List<BlogLog> selectByExample(BlogLogExample example);

    BlogLog selectByPrimaryKey(Integer blogLogId);

    int updateByExampleSelective(@Param("record") BlogLog record, @Param("example") BlogLogExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogLog record, @Param("example") BlogLogExample example);

    int updateByExample(@Param("record") BlogLog record, @Param("example") BlogLogExample example);

    int updateByPrimaryKeySelective(BlogLog record);

    int updateByPrimaryKeyWithBLOBs(BlogLog record);

    int updateByPrimaryKey(BlogLog record);
}