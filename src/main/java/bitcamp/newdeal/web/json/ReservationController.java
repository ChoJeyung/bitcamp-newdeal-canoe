package bitcamp.newdeal.web.json;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@GetMapping("list")
	public Object list() {
		List<Reservation> list = reservationService.list();
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", list);
		return result;
	}
}
