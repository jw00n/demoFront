package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/index")
public class WebIndecController {

	@GetMapping("/signup") // 회원가입
	public String index() throws IOException {
		return "/index.html";
	}
	
	@GetMapping("/login") // 로그인
	public String login() throws IOException {
		return "login";
	}
	
	@GetMapping("/test") // 로그인
	public String test() throws IOException {
		return "test";
	}
	
	@GetMapping("/test/{nickname}") // 로그인
	public String test(@PathVariable @Nullable String nickname,Model model) throws IOException {
		model.addAttribute("nickname",nickname );
		return "test";
	}
	
	//에러페이지 ㅎㅎ..
	@GetMapping("/home")
	public String errorPage() throws IOException{
		return "home";
	}
	
	@GetMapping("/logout")
	public String logout() throws IOException{
		return "/index/test";
	}
}
