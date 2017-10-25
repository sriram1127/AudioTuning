package com.uniphore.tunningtool.gui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MasterReference {
	@RequestMapping("")
	public ModelAndView start() {
		try {
			return new ModelAndView("hello");

		} catch (Exception ex) {
			return new ModelAndView("hello");
		}

	}
}
