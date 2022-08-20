package com.kathmandu.nep.controller.studentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/student")
public class StudentController {

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String test() {
		return "success";
	}

	@PostMapping(value = "/addStudent")
	public Boolean addStudent() {

		return true;
	}

	@PostMapping(value =  "/editStudent")
    public Boolean editStudent(@RequestParam("id") Integer id) {
    
    	
    	return true;
    }
	
	@PostMapping(value =  "/deleteStudent")
    public Boolean deleteStudent(@RequestParam("id") Integer id) {
    
    	
    	return true;
	}
	
}
