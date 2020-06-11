package com.lan.mapper;

import com.lan.pojo.PostLog;
import com.lan.pojo.PostLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostLogMapper {
    int countByExample(PostLogExample example);

    int deleteByExample(PostLogExample example);

    int deleteByPrimaryKey(Integer postLogId);

    int insert(PostLog record);

    int insertSelective(PostLog record);

    List<PostLog> selectByExample(PostLogExample example);

    PostLog selectByPrimaryKey(Integer postLogId);

    int updateByExampleSelective(@Param("record") PostLog record, @Param("example") PostLogExample example);

    int updateByExample(@Param("record") PostLog record, @Param("example") PostLogExample example);

    int updateByPrimaryKeySelective(PostLog record);

    int updateByPrimaryKey(PostLog record);
}