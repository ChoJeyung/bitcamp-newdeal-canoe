package bitcamp.newdeal.web.json;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.newdeal.domain.Grade;
import bitcamp.newdeal.domain.Reservation;
import bitcamp.newdeal.service.GradeService;
import bitcamp.newdeal.service.ReservationService;

@RestController
@RequestMapping("/grade")
public class GradeController {
	GradeService gradeService;

	public GradeController(GradeService gradeService) {
		// TODO Auto-generated constructor stub
		this.gradeService = gradeService;
	}

	@GetMapping("list")
	public Object list() {
		List<Grade> list = gradeService.list();
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", list);
		return result;
	}
	@GetMapping("{no}")
	public Object listByPrice(@PathVariable int no) {
		
		List<Grade> list = gradeService.listByTrvlNo(no);
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", list);
		return result;
	}
}
