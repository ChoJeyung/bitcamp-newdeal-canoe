package bitcamp.newdeal.service;

import java.util.List;

import bitcamp.newdeal.domain.Airport;

public interface AirportService {

	List<Airport> list();

	Airport get(int no);

}
