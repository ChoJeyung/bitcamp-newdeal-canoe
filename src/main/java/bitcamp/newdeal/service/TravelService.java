package bitcamp.newdeal.service;

import java.util.Date;
import java.util.List;

import bitcamp.newdeal.domain.Travel;

public interface TravelService {

	List<Travel> list();

	Travel get(int no);

	List<Travel> showReservations(int no);

	List<Travel> showSearchResult(int startAPNo, int arriveAPNo, String startDate);

	List<Travel> showFutureReservation(int memberNo);

	List<Travel> selectAAirport(int no);

}
