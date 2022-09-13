package com.kathmandu.nep.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kathmandu.nep.entity.Student;


@RestController
@RequestMapping(path = "/student")
public class StudentController {

	@RequestMapping(path = "/test", method = RequestMethod.GET, produces = "application/json")
	public Student test() {
		/*
		 * Student st = new Student(); st.setFirstName("Hari"); st.setLastName("om");
		 * st.setAddress("Ligma"); st.setDob(new Date("21/02/01"));
		 * st.setEmail("ligma@gmail.com"); //st.setClassroom(new Classroom("1",))
		 * st.setGender("male"); st.setLocalGurdian("asdfkj");
		 * st.setLocalGurdianNumber("98117854"); st.setFatherName("sjfnkasj");
		 * st.setMotherName("asfsa"); Branch b = new Branch(1,"Physics"); Section sec =
		 * new Section(1,"PA",b); //st.setClassroom(new Classroom(1,sec, null, "sdf"));
		 */
		/* System.out.println(st.toString()); */
		return null;
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
