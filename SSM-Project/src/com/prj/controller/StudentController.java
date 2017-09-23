package com.prj.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prj.biz.IClassTableBiz;
import com.prj.biz.IStudentBiz;
import com.prj.po.Classtable;
import com.prj.po.Student;

@Controller
public class StudentController {
	@Resource
	private IStudentBiz sbiz;
	@Resource
	private IClassTableBiz cbiz;

	// ��ʼ��
	@RequestMapping(value = "/doinit")
	public String doinit(HttpServletRequest request) {
		List<Student> lsst = sbiz.findAll();
		List<Classtable> lsct = cbiz.findAll();
		request.setAttribute("lsct", lsct);
		request.setAttribute("lsst", lsst);
		return "student";
	}

	// ����
	@RequestMapping(value = "/save_Student")
	public String save_Student(Student stu) {
		sbiz.save(stu);
		return "redirect:findAll_Student";
	}

	// ��ѯ
	@RequestMapping(value = "/findAll_Student")
	public String findAll_Student(HttpServletRequest request) {
		List<Student> lsst = sbiz.findAll();
		request.setAttribute("lsst", lsst);
		return "student";
	}

	// ɾ��
	@RequestMapping(value = "/del_ById")
	public String del_ById(int index) {
		sbiz.delBySid(index);
		return "redirect:findAll_Student";
	}

	// ����ID��ѯ
	@RequestMapping(value = "/findById")
	public String findById(int index, HttpServletRequest request) {
		Student stu = sbiz.findById(index);
		request.getSession().setAttribute("oldStu", stu);
		return "student";
	}

	// �޸�
	@RequestMapping(value = "/update")
	public String update(Student stu) {
		sbiz.update(stu);
		return "redirect:findAll_Student";
	}

}
