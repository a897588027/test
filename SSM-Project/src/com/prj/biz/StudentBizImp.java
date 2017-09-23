package com.prj.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.prj.dao.StudentDaoMapper;
import com.prj.po.Student;

@Service
public class StudentBizImp implements IStudentBiz {
	@Resource
	private StudentDaoMapper dao;

	@Override
	public void save(Student stu) {
		dao.save(stu);

	}

	@Override
	public void delBySid(int sid) {
		dao.delBySid(sid);

	}

	@Override
	public void delByCid(int cid) {
		
		dao.delByCid(cid);

	}

	@Override
	public void update(Student stu) {
		dao.update(stu);

	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}
}
