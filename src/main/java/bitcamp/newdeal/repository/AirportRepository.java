package bitcamp.newdeal.repository;

import java.util.List;

import bitcamp.newdeal.domain.Airport;

public interface AirportRepository {

	List<Airport> selectList();

	Airport selectOne(int no);
	
	List<Airport> findByWord(String word);
}
