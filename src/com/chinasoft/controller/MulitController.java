package com.chinasoft.controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.chinasoft.service.StudentService;
import com.chinasofti.ssm.model.Student;
@RequestMapping
public class MulitController extends MultiActionController {

	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("login");
	}
	public ModelAndView registr(HttpServletRequest request, HttpServletResponse response) {
		
		return new ModelAndView("registr");
	}

	public ModelAndView loginto(HttpServletRequest request, HttpServletResponse response) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Student student = (Student) context.getBean("Student");
		student.setUsername(username);
		student.setPassword(password);
		StudentService service = (StudentService) context.getBean("StudentService");
		Student student2 = service.selectByUP(student);
		ModelAndView modelAndView = null;
		if (student2 != null) {
			modelAndView = new ModelAndView("welcome");
			modelAndView.addObject("student2", student2);
		} else {
			modelAndView = new ModelAndView("login");
			modelAndView.addObject("message", "登陆失败");
		}
		
		return modelAndView;
	}
	public ModelAndView registrto(HttpServletRequest request, HttpServletResponse response) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		String classids=request.getParameter("classid");
		Integer classid=Integer.parseInt(classids);
		
		Student student = (Student) context.getBean("Student");
		student.setUsername(username);
		student.setPassword(password);
		student.setClassid(classid);
		StudentService service = (StudentService) context.getBean("StudentService");
		int i= service.insert(student);
		ModelAndView modelAndView = null;
		if (i >0) {
			Student student2=service.selectByUP(student);
			modelAndView = new ModelAndView("welcome");
			modelAndView.addObject("student2", student2);
		} else {
			modelAndView = new ModelAndView("registr");
			modelAndView.addObject("message", "注册失败");
		}
		return modelAndView;
	}
	// 用于返回已加密的字符串
		public String jiami(String str) throws UnsupportedEncodingException {
			String password = null;
			MessageDigest md;
			try {
				// 固定加密算法
				md = MessageDigest.getInstance("MD5");
				// 获取加密后的数组
				byte[] b = md.digest(str.getBytes("utf-8"));
				// 进行BASE64编码
				sun.misc.BASE64Encoder base64Encoder = new sun.misc.BASE64Encoder();
				// 将加密后的数组进行base64编码，转换成对应的字符串
				password = base64Encoder.encode(b);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			return password;
		}

	
}
