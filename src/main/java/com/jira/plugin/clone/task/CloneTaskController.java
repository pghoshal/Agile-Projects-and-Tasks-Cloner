package com.jira.plugin.clone.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.atlassian.connect.spring.IgnoreJwt;

@Controller
@IgnoreJwt
public class CloneTaskController
{
	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public ModelAndView helloWorld(@RequestParam String username) {
	    ModelAndView model = new ModelAndView();
	    model.setViewName("test");
	    model.addObject("userName", username);
	    return model;
	}
}
