package com.prj.dao;

import java.util.List;

import com.prj.po.Classtable;
import com.prj.po.Student;

public interface ClassTableDaoMapper {
	public void save(Classtable ct);

	public void delById(int id);

	public List<Classtable> findAll();

	public Classtable findByCidInStudnet(int cid);

}
