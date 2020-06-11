package com.lan.mapper;

import com.lan.pojo.BlogConfig;
import com.lan.pojo.BlogConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogConfigMapper {
    int countByExample(BlogConfigExample example);

    int deleteByExample(BlogConfigExample example);

    int deleteByPrimaryKey(Integer configId);

    int insert(BlogConfig record);

    int insertSelective(BlogConfig record);

    List<BlogConfig> selectByExample(BlogConfigExample example);

    BlogConfig selectByPrimaryKey(Integer configId);

    int updateByExampleSelective(@Param("record") BlogConfig record, @Param("example") BlogConfigExample example);

    int updateByExample(@Param("record") BlogConfig record, @Param("example") BlogConfigExample example);

    int updateByPrimaryKeySelective(BlogConfig record);

    int updateByPrimaryKey(BlogConfig record);
}