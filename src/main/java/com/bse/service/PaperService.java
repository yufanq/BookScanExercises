/**
 * 
 */
package com.bse.service;

import java.util.List;

import com.bse.entity.Paper;
import com.bse.entity.Question;

/**
*  <p>Title: PaperService</p>
*  <p>Description: </p>
*  <p>Company: </p>
*  @author BOY
*  @date 2018年5月25日 下午7:18:58
*/
public interface PaperService {
	//获取所有试卷列表
	List<Paper> selectAllPapers();
	
	//根据试卷的名字获取试卷
	List<Paper> selectAllPapersByName(String  name);	
	
	//根据试卷的名字获取试卷并分页
	List<Paper> selectAllPapersByNameAndPage(String name,Integer startRow,Integer pageSize);
	
	//根据id更新试卷名字
	void updatePaperById(String name,Integer id);
	
	//根据id删除试卷
	void deletePaperById(Integer id);
	
	//根据试卷id生成一套试卷
	List<Question> getPaper(Integer id);
	
	//分页查找试卷
	List<Paper> getPapersByPage(int startRow,int pageSize);
	
	//增加期末试卷
	void addFinalPaper();
	
	//增加期中试卷
	
	
	
	//增加单元测试卷
	
	
	
	//增加知识点测试卷
	
	
	
	//增加自定义试卷
	
	
}
