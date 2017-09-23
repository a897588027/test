package com.prj.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.prj.dao.ClassTableDaoMapper;
import com.prj.dao.StudentDaoMapper;
import com.prj.po.Classtable;
import com.prj.po.Student;

@Service
public class ClassTableBizImp implements IClassTableBiz {

	@Resource
	private ClassTableDaoMapper ctdao;
	@Resource
	private StudentDaoMapper studao;

	@Override
	public void save(Classtable ct) {
		ctdao.save(ct);

	}

	@Override
	public void delById(int id) {
		studao.delByCid(id);// 删除班级下的所有学生
		ctdao.delById(id);// 删除班级

	}

	@Override
	public List<Classtable> findAll() {
		// TODO Auto-generated method stub
		return ctdao.findAll();
	}

	@Override
	public Classtable findByCidInStudnet(int cid) {
		// TODO Auto-generated method stub
		return ctdao.findByCidInStudnet(cid);
	}

}
