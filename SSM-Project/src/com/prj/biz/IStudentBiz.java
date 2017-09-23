package com.prj.biz;

import java.util.List;

import com.prj.po.Student;

public interface IStudentBiz {

	public void save(Student stu);

	public void delBySid(int sid);

	public void delByCid(int cid);

	public void update(Student stu);

	public List<Student> findAll();

	public Student findById(int id);

}
