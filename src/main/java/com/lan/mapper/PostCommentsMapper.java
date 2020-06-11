package com.lan.mapper;

import com.lan.pojo.PostComments;
import com.lan.pojo.PostCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostCommentsMapper {
    int countByExample(PostCommentsExample example);

    int deleteByExample(PostCommentsExample example);

    int deleteByPrimaryKey(Integer postCommentsId);

    int insert(PostComments record);

    int insertSelective(PostComments record);

    List<PostComments> selectByExampleWithBLOBs(PostCommentsExample example);

    List<PostComments> selectByExample(PostCommentsExample example);

    PostComments selectByPrimaryKey(Integer postCommentsId);

    int updateByExampleSelective(@Param("record") PostComments record, @Param("example") PostCommentsExample example);

    int updateByExampleWithBLOBs(@Param("record") PostComments record, @Param("example") PostCommentsExample example);

    int updateByExample(@Param("record") PostComments record, @Param("example") PostCommentsExample example);

    int updateByPrimaryKeySelective(PostComments record);

    int updateByPrimaryKeyWithBLOBs(PostComments record);

    int updateByPrimaryKey(PostComments record);
}