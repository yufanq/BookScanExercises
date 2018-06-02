/**
 * 
 */
package com.bse.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bse.Idao.PaperMapper;
import com.bse.entity.Paper;
import com.bse.entity.Question;
import com.bse.service.PaperService;

/**
*  <p>Title: PaperServiceImpl</p>
*  <p>Description: </p>
*  <p>Company: </p>
*  @author BOY
*  @date 2018年5月26日 上午10:23:56
*/
@Service
public class PaperServiceImpl implements PaperService {
	@Autowired
	private PaperMapper paperDao;

	@Override
	public List<Paper> selectAllPapers() {
		return paperDao.selectAllPapers();
	}

	/**
	 * 根据试卷名字获取试卷
	 */
	@Override
	public List<Paper> selectAllPapersByName(String name) {
		if(name!=null){
		return paperDao.selectAllPapersByName(name);
		}else {
			return null;
		}
	
	}

	/**
	 * 根据试卷id更新试卷名字
	 */
	@Override
	public void updatePaperById(String name, Integer id) {
		if(name!=null&&id!=null)
		{
			paperDao.updatePaperById(name, id);
		}
	}

	
	@Override
	/**
	 * 根据试卷Id删除试卷
	 */
	public void deletePaperById(Integer id) {
		if(id!=null){
			paperDao.deleteByPrimaryKey(id);
		}
	}
	
	@Override
	public List<Question> getPaper(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Paper> getPapersByPage(int startRow, int pageSize) {
		if(startRow<0||pageSize<0)
			return null;
		else {
			return paperDao.selectAllPapersByPages(startRow, pageSize);
		}
	
	}

	@Override
	public void addFinalPaper() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * 根据试卷名称查询并分页
	 */
	@Override
	public List<Paper> selectAllPapersByNameAndPage(String name, Integer startRow, Integer pageSize) {
		if(name!=null&&startRow!=null&&pageSize!=null){
	         return paperDao.selectAllPapersByNameAndPage(name, startRow, pageSize);
		}else {
			return null;
		}
		
	}

}
