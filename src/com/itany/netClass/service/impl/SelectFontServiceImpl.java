package com.itany.netClass.service.impl;

import java.util.List;

import com.itany.netClass.dao.ChapterDao;
import com.itany.netClass.dao.SelectFontDao;
import com.itany.netClass.entity.Course;
import com.itany.netClass.entity.CourseType;
import com.itany.netClass.factory.ObjectFactory;
import com.itany.netClass.service.SelectFont;

public class SelectFontServiceImpl  implements SelectFont{

	@Override
	public List<CourseType> selectFirst() {
		SelectFontDao selectFontDao= (SelectFontDao) ObjectFactory.getObject("selectFontDao");
		List<CourseType> fatherNameLists=selectFontDao.selectFirst();
		return fatherNameLists;
	}

	@Override
	public List<CourseType> selectThird(String firstName) {
		SelectFontDao selectFontDao= (SelectFontDao) ObjectFactory.getObject("selectFontDao");
		List<CourseType> ThirdNameLists=selectFontDao.selectThird(firstName);
		return ThirdNameLists;
	}

	@Override
	public List<Course> selectAll(Integer id, String searchContext) {
		SelectFontDao selectFontDao= (SelectFontDao) ObjectFactory.getObject("selectFontDao");
		 List<Course> lists=selectFontDao.selectAll(id, searchContext);
		return lists;
	}

	@Override
	public List<Course> selectQuanBu(String searchContext) {
		SelectFontDao selectFontDao= (SelectFontDao) ObjectFactory.getObject("selectFontDao");
		 List<Course> lists=selectFontDao.selectQuanBu(searchContext);
		return lists;
	}

}
