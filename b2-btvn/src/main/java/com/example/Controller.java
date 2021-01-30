package com.example;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	
	@GetMapping(value = { "/student", "/student/abc"})
	public ModelAndView btvn() {
		ModelAndView mav = new ModelAndView("Student");
		String str = "Danh Sach";
		mav.addObject("name", str);
		ArrayList<Student> list= new ArrayList<Student>();
		list.add(new Student("1","cuong","abc@gmail.com","Ha Nam"));
		list.add(new Student("2", "tuan","abcd@gmail.com","Ha Nam"));
		list.add(new Student("3", "kim", "abc@gmail.com","Hai Duong"));
		list.add(new Student("4", "nam", "abc@gmail.com","Thai Binh" ));
	
		mav.addObject("list",list);
		return mav;
	}
}
