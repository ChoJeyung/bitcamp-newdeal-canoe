package bitcamp.newdeal.web.json;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.newdeal.domain.Airport;
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
		return result;
	}

	@GetMapping("{no}")
	public Object select(@PathVariable int no) {
		Travel travel = travelService.get(no);
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", travel);
		return result;
	}

	@GetMapping("showReservation/{no}")
	public Object showReservation(@PathVariable int no) {
		List<Travel> travel = travelService.showReservations(no);
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", travel);
		return result;
	}
}
