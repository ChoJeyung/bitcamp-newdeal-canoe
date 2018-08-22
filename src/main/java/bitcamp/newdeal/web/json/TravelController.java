package bitcamp.newdeal.web.json;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.newdeal.domain.Travel;
import bitcamp.newdeal.service.TravelService;

@RestController
@RequestMapping("/travel")

public class TravelController {
	TravelService travelService;

	public TravelController(TravelService travelService) {
		// TODO Auto-generated constructor stub
		this.travelService = travelService;
	}

	@GetMapping("list")
	public Object list() {
		List<Travel> list = travelService.list();
		HashMap<String, Object> result = new HashMap<>();
		
		result.put("status", "success");
		result.put("list", list);
		result.put("startingP", "서울");
		result.put("endingP", "부산");
		return result;
	}
}
