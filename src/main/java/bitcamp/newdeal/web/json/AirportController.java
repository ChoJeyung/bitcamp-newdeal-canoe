package bitcamp.newdeal.web.json;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.newdeal.domain.Airport;
import bitcamp.newdeal.service.AirportService;

@RestController
@RequestMapping("/airport")

public class AirportController {
	AirportService airportService;

	public AirportController(AirportService airportService) {
		// TODO Auto-generated constructor stub
		this.airportService = airportService;
	}

	@GetMapping("list")
	public Object list() {
		List<Airport> list = airportService.list();
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", list);
		return result;
	}

	@GetMapping("{no}")
	public Object select(@PathVariable int no) {
		System.out.println(no);
		Airport airport = airportService.get(no);
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("airport", airport);
		return result;
	}
	   
    @GetMapping("sapSearch")
    public Object sapSearch(String word) {
        System.out.println(word);
        HashMap<String, Object> result = new HashMap<>();
        List<Airport> list = airportService.sapSearch(word);
        result.put("status", "success");
        result.put("list", list);
        return result;
    }

}
