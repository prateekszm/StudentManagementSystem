package com.kathmandu.nep.studentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/student")
public class StudentController {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test(){
        return "success";
    }
}
