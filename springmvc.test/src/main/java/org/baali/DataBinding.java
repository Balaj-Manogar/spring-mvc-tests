package org.baali;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DataBinding
{
	@RequestMapping(value="/book/search", method=RequestMethod.GET)
	public String list(Model m )
	{
		return "book";
	}

}
