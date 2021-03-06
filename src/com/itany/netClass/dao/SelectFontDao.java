package com.itany.netClass.dao;

import java.util.List;

import com.itany.netClass.entity.Course;
import com.itany.netClass.entity.CourseType;

public interface SelectFontDao {
	public List<CourseType> selectFirst();
	public List<CourseType> selectThird(String firstName);
	public List<Course> selectAll(Integer id,String searchName);
	public List<Course> selectQuanBu(String searchContext);
}
