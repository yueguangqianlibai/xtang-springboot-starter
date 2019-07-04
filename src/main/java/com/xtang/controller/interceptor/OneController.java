package com.xtang.controller.interceptor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xtang.pojo.Users;

@Controller
@RequestMapping("one")
public class OneController {

	@RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "imooc22");
        return "thymeleaf/index";
    }
	
	@RequestMapping("center")
    public String center() {
        return "thymeleaf/center/center";
    }

	@RequestMapping("test")
    public String test(ModelMap map) {
		
		Users user = new Users();
		user.setId("19070411001");
		user.setUsername("xiaotang");
		user.setPassword("123456");
		user.setCreateTime(new Date());
		
		map.addAttribute("user", user);


		Users u1 = new Users();
		u1.setId("19070411002");
		u1.setUsername("xiaozhu");
		u1.setPassword("123456");
		u1.setCreateTime(new Date());

		Users u2 = new Users();
		u2.setId("19070411003");
		u2.setUsername("xiaoniu");
		u2.setPassword("123456");
		u2.setCreateTime(new Date());
		
		List<Users> userList = new ArrayList<>();
		userList.add(user);
		userList.add(u1);
		userList.add(u2);
		
		map.addAttribute("userList", userList);
		
        return "thymeleaf/test";
    }
	
	@PostMapping("postform")
    public String postform(Users user) {
		System.out.println(user.getUsername());
        return "redirect:/th/test";
    }
}