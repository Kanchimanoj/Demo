package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller{
	
	@RequestMapping("/hi")
	public String hi() {
		System.out.println("Hi From HomeController");
		return "Hii from Homecontroller";
	}
	@RequestMapping("/hello")
		public String hello() {
		return "Hello From Homecontroller";
		}
	@RequestMapping("/save")
	public User save(@RequestBody User user) {
		return user;
	}
	@RequestMapping("/login")
	public String login(@RequestParam String user,@RequestParam String password) {
		System.out.println(user);
		System.out.println(password);
		return "login Successfull";
	}
	@RequestMapping("/findall")
	public String findAllUsers() {
		return "All Users Found Successfully";
	}
	@RequestMapping("/find")
	public Person findPerson(@RequestBody Person p) {
		return p;
	}

}
