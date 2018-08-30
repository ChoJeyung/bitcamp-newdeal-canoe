package bitcamp.newdeal.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.newdeal.domain.Travel;
import bitcamp.newdeal.repository.TravelRepository;
import bitcamp.newdeal.service.TravelService;

@Service
public class TravelServiceImpl implements TravelService {
	TravelRepository travelRepository;

	public TravelServiceImpl(TravelRepository travelRepository) {
		// TODO Auto-generated constructor stub
		this.travelRepository = travelRepository;
	}

	@Override
	public List<Travel> list() {
		// TODO Auto-generated method stub
		return travelRepository.selectList();
	}

	@Override
	public Travel get(int no) {
		// TODO Auto-generated method stub
		return travelRepository.get(no);
	}

	@Override
	public List<Travel> showReservations(int no) {
		// TODO Auto-generated method stub
		return travelRepository.showReservations(no);
	}

	@Override
	public List<Travel> showSearchResult(int startAPNo, int arriveAPNo, String startDate) {
		// TODO Auto-generated method stub
		HashMap<String, Object> params = new HashMap<>();
		params.put("startAPNo", startAPNo);
		params.put("arriveAPNo", arriveAPNo);
		params.put("startDate", startDate);
		System.out.println(startDate);
		return travelRepository.findByStartArriveAPNoStartDate(params);
	}

	@Override
	public List<Travel> showFutureReservation(int memberNo) {
		// TODO Auto-generated method stub
		return travelRepository.showFutureReservation(memberNo);
	}

}
