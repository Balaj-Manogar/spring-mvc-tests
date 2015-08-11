package org.baali;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mobile/*")
public class SpringHello
{
	@Resource(name="injectBean")
	private InjectBean injectBean;
	
	@Autowired
	private InjectBeanAutoWiring autoInject;
	
	
	@RequestMapping("hello")
	public String hello(Model m)
	{
		m.addAttribute("greeting", "Hello Spring");
		m.addAttribute("name", injectBean.getMessage());
		System.out.println(injectBean.getMessage());
		System.out.println(autoInject.getMessage());
		return "hello";
	}
}
