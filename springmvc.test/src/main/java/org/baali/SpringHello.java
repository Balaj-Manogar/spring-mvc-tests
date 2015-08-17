package org.baali;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("attrib")
	public ModelAndView attributeVsBody(@ModelAttribute("m") Book m)
	{
		ModelAndView mv = new ModelAndView();
		System.out.println("Model Attribute: " + m.getAuthor());
		mv.setViewName("attribute");
		return mv;
	}
	
	@RequestMapping("request")
	public ModelAndView requestBodyhandler(@RequestBody Book book)
	{
		ModelAndView mv = new ModelAndView();
		System.out.println("RequestBody: " + book);
		mv.setViewName("request");
		return mv;
	}
}
