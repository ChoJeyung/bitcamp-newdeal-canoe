package bitcamp.newdeal.service.impl;

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

}
