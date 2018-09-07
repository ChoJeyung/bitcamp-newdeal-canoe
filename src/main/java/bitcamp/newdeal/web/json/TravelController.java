package bitcamp.newdeal.web.json;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.newdeal.domain.Member;
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
	
	@GetMapping("ShowArriveAP/{no}")
	public Object selectAAirport(@PathVariable int no) {
		List<Travel> travel = travelService.selectAAirport(no);
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", travel);
		return result;
	}

	@GetMapping("showReservation")
	public Object showReservation(HttpSession session) {
		Member loginUser = (Member)session.getAttribute("loginUser");
		List<Travel> travel = travelService.showReservations(loginUser.getMemberNo());
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", travel);
		return result;
	}
	
	@GetMapping("ShowSearchResult/{startAPNo}/{arriveAPNo}/{startDate}")
	public Object showSearchResult(@PathVariable int startAPNo, @PathVariable int arriveAPNo, 
									@PathVariable String startDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date sdt = sdf.parse(startDate);
		List<Travel> travel = travelService.showSearchResult(startAPNo, arriveAPNo, sdf.format(sdt));
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", travel);
		return result;
	}
	
	@GetMapping("showFutureReservation")
	public Object showFutureReservation(HttpSession session) {
		Member loginUser = (Member)session.getAttribute("loginUser");
		List<Travel> travel = travelService.showFutureReservation(loginUser.getMemberNo());
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", travel);
		return result;
	}
	@GetMapping("ShowFutureTravels/{apNo}")
	public Object showSearchResult(@PathVariable int apNo) throws ParseException {

		List<Travel> travel = travelService.showFutureTravels(apNo);
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", travel);
		return result;
	}
}
