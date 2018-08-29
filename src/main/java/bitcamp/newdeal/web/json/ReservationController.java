package bitcamp.newdeal.web.json;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.newdeal.domain.Reservation;
import bitcamp.newdeal.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	ReservationService reservationService;

	public ReservationController(ReservationService reservationService) {
		// TODO Auto-generated constructor stub
		this.reservationService = reservationService;
	}

	@GetMapping("list/{no}")
	public Object list(@PathVariable int no) {
		List<Reservation> list = reservationService.list(no);
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", list);
		return result;
	}

	@GetMapping("get/{no}")
	public Object get(@PathVariable int no) {
		Reservation reserv = reservationService.get(no);
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("result", reserv);
		return result;
	}

	@GetMapping("CancelReservation/{no}")
	public Object delete(@PathVariable int no) {
		System.out.println(no);
		reservationService.delete(no);
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		return result;
	}
	@GetMapping("MakeReservation/{memberNo}/{travelNo}/{seatClass}")
	public Object insert(@PathVariable("memberNo") int memberNo, @PathVariable("travelNo") int travelNo, @PathVariable("seatClass") int seatClass) {
		
		reservationService.insert(memberNo, travelNo, seatClass);
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		return result;
	}
}
