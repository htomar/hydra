package hydra;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping(value = "/test")
	public List<String> Test() {
		List<String> details = new ArrayList<String>();
		details.add("This");
		details.add(" is");
		details.add(" test");
		return details;
	}
}
