package com.itany.netClass.dao;

import java.util.Date;
import java.util.List;

import com.itany.netClass.entity.Course;
import com.itany.netClass.entity.CourseType;
import com.itany.netClass.entity.User;

public interface UserFontDao {
	/**
	 * 注册用户
	 * */
	public void registUser(User user);
	
	/**
	 * 根据用户名来查询用户
	 * */
	public User selectByUsername(String username);
	
	/**
	 * 用户登录
	 * */
	public User login(String username,String password);
	
	/**
	 * 根据用户名和密码来查询用户
	 * */
	public User selectByUsernameAndPwd(String username,String password);
	
	
	public void modifyUserMsg(String username,String password,String nickname,String email);
	
	public void qiandao(String userid,java.util.Date functiondate);
	
	public void insertLoginDate(Integer userid,String logindate);
	
	public    List<CourseType>  selectTypes();
	
	public    List<Course>  findFourCourse();
	
	public    List<Course>  selectCourseByClickNumber();
	
	
}
