package com.example.springboot;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.text.StringSubstitutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public @interface RequestMapping {
	@Controller
	public class RjBlogController {
		@GetMapping("/index")
			public String index(){
			return "index";
		}
		@GetMapping("/about")
		public String about(){
			return "about";
		}
		@GetMapping("/404")
		public String render404(Model model) {
			return "error/404";
		}
		// @GetMapping("/greeting")
		// public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		// 	model.addAttribute("name", name);
		// 	return ("greeting");
		// }

	}
}






//@GetMapping("/vuln")
//// public String handleScript(@RequestParam(defaultValue = "You are running java.version ${java.version} and os.name = ${os.name}") String text) {
//    public String handleScript(@RequestParam(defaultValue = "World") String name) {
//    return interpolate("Hello " + name);
//}




