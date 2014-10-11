package org.baali;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mobile/*")
public class SpringHello
{
	@RequestMapping("hello")
	public String hello(Model m)
	{
		m.addAttribute("greeting", "Hello Spring");
		return "hello";
	}
}
