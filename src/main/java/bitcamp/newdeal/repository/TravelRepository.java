package bitcamp.newdeal.repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import bitcamp.newdeal.domain.Travel;

public interface TravelRepository {

	List<Travel> selectList();

	Travel get(int no);

	List<Travel> showReservations(int no);

	List<Travel> findByStartArriveAPNoStartDate(HashMap<String, Object> params);

	List<Travel> showFutureReservation(int no);

	List<Travel> findByStartAP(int no);
}
