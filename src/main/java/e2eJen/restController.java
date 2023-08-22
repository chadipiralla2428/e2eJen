package e2eJen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Jen") 
public class restController {
	@GetMapping()
	public String JenDemo() {
		return "Welcome to e2e Jenkins";
	}

}
