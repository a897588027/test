package com.prj.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prj.biz.IClassTableBiz;
import com.prj.po.Classtable;

@Controller
public class ClassTableController {
	@Resource
	private IClassTableBiz biz;

	// ����
	@RequestMapping(value = "/save_Class")
	public String save_Class(Classtable cs) {
		biz.save(cs);
		return "redirect:findAll_Classtable";
	}

	// ��ѯ
	@RequestMapping(value = "/findAll_Classtable")
	public String findAll(HttpServletRequest request) {
		List<Classtable> lsct = biz.findAll();
		request.setAttribute("lsct", lsct);
		return "class";
	}

	// ɾ��
	@RequestMapping(value = "/delct")
	public String delct(int index) {
		biz.delById(index);
		return "redirect:findAll_Classtable";
	}

	// ����id��ѯ
	/**
	 * @param cid
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/findByCidInStudnet")
	public String findByCidInStudnet(int cid, HttpServletRequest request) {
		Classtable ctt = biz.findByCidInStudnet(cid);
		request.getSession().setAttribute("ctt", ctt);
		return "class";
	}
}
