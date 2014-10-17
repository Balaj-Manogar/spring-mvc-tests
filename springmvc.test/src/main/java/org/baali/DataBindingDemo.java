package org.baali;

import javax.validation.Valid;

import org.baali.Model.AnnotationValidation;
import org.baali.Model.SubscriptionBinding;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/book/*")
public class DataBindingDemo
{
	@RequestMapping(value="data-binding", method=RequestMethod.POST)
	public String databinding(@ModelAttribute("subscription") SubscriptionBinding sub)
	{
		return "data-binding";
	}
	
	
	@RequestMapping(value="annotation-validation", method=RequestMethod.POST)
	public String annotationValidation(@ModelAttribute("annotationValidation") @Valid AnnotationValidation annotationValidation, BindingResult br)
	{
		if(br.hasErrors())
		{
			return "validator-form";
		}
		return "annotation-validation";
	}
	
	@RequestMapping(value="annotation-validation", method=RequestMethod.GET)
	public String annotationValidationGet(@ModelAttribute("annotationValidation") AnnotationValidation annotationValidation, BindingResult br)
	{
		
		return "validator-form";
	}

}
