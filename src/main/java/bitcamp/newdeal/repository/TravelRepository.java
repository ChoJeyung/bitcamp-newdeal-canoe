package bitcamp.newdeal.repository;

import java.util.List;

import bitcamp.newdeal.domain.Travel;

public interface TravelRepository {

	List<Travel> selectList();

	Travel get(int no);

	List<Travel> showReservations(int no);

}
