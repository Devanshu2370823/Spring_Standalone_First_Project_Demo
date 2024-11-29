package in.sp.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// Instead of giving @Controller and @Response body, we can give @RestController annotation, I did some change
public class MyController {
	@GetMapping("/")
	@ResponseBody
	public String printHello() {
		return "Hello Devanshu This is your first controller.";
	}
}
