package com.programmingknowledge;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Page {
	public ModelAndView home() {
		return new ModelAndView("index");

	}

}
