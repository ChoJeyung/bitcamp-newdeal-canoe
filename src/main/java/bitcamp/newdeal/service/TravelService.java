package bitcamp.newdeal.service;

import java.util.List;

import bitcamp.newdeal.domain.Travel;

public interface TravelService {

	List<Travel> list();

	Travel get(int no);

	List<Travel> showReservations(int no);

}
