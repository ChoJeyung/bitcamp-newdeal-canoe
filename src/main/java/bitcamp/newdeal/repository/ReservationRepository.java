package bitcamp.newdeal.repository;

import java.util.HashMap;
import java.util.List;

import bitcamp.newdeal.domain.Reservation;

public interface ReservationRepository {

	List<Reservation> selectList(int memberNo);

	Reservation get(int no);

	int delete(int no);

	int insert(HashMap<String, Object> params);

}
