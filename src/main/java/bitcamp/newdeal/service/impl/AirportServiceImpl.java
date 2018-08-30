package bitcamp.newdeal.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.newdeal.domain.Airport;
import bitcamp.newdeal.repository.AirportRepository;
import bitcamp.newdeal.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService {
	AirportRepository airportRepository;
	public AirportServiceImpl(AirportRepository airportRepository) {
		// TODO Auto-generated constructor stub
		this.airportRepository = airportRepository;
	}

	@Override
	public List<Airport> list() {
		// TODO Auto-generated method stub
		return airportRepository.selectList();
	}

	@Override
	public Airport get(int no) {
		// TODO Auto-generated method stub
		return airportRepository.selectOne(no);
	}

    @Override
    public List<Airport> sapSearch(String word) {
        // TODO Auto-generated method stub
        return airportRepository.findByWord(word);
    }


}
