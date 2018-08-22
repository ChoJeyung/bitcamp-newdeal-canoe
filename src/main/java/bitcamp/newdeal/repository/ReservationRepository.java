package bitcamp.newdeal.repository;

import java.util.List;

import bitcamp.newdeal.domain.Reservation;

public interface ReservationRepository {

	List<Reservation> selectList();

}
