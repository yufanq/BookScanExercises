package com.bse.Idao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bse.entity.Paper;
import com.bse.entity.Question;

public interface PaperMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(Paper record);

    int insertSelective(Paper record);

    Paper selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);
    //获取所有试卷
    List<Paper> selectAllPapers();
    
    //根据名字获取各种类别的试卷
    List<Paper> selectAllPapersByName(@Param("name")String name);
    
    //根据页码获取试卷
    List<Paper> selectAllPapersByPages(int startRow,int pageSize);
    
    //根据试卷名字分页查询
    List<Paper> selectAllPapersByNameAndPage(@Param("name")String name,@Param("startRow")Integer startRow,@Param("pageSize")Integer pageSize);
    
    //根据试卷id更改试卷名字
    void updatePaperById(@Param("paperName")String name,@Param("id")Integer  id);
    
    //根据试卷id去题库里查找试题
    List<Question> selectQuestions(Integer id);
}