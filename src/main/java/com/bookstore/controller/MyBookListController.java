package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.service.MYBookListServ;

@Controller
public class MyBookListController {
  @Autowired
	 private MYBookListServ ser;
	
	@RequestMapping("deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
	  ser.deleteById(id);
	  
		return "redirect:/my_books";
	
	
	}
	
}
