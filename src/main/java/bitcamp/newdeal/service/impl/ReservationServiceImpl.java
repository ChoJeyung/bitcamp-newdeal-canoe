package bitcamp.newdeal.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.newdeal.domain.Reservation;
import bitcamp.newdeal.repository.ReservationRepository;
import bitcamp.newdeal.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {
	ReservationRepository reservationRepository;

	public ReservationServiceImpl(ReservationRepository reservationRepository) {
		// TODO Auto-generated constructor stub
		this.reservationRepository = reservationRepository;
	}

	@Override
	public List<Reservation> list(int memberNo) {
		// TODO Auto-generated method stub
		return reservationRepository.selectList(memberNo);
	}

	@Override
	public Reservation get(int no) {
		// TODO Auto-generated method stub
		return reservationRepository.get(no);
	}

	@Override
	public int delete(int no, int travelNo, int seatClass) {
		// TODO Auto-generated method stub
		HashMap<String, Object> params = new HashMap<>();
		params.put("travelNo", travelNo);
		params.put("seatClass", seatClass);
		reservationRepository.incSeat(params);
		return reservationRepository.delete(no);
	}

	@Override
	public int insert(int memberNo, int travelNo, int seatClass) {
		// TODO Auto-generated method stub
		HashMap<String, Object> params = new HashMap<>();
		params.put("memberNo", memberNo);
		params.put("travelNo", travelNo);
		params.put("seatClass", seatClass);
		reservationRepository.decSeat(params);
		return reservationRepository.insert(params);
	}

	@Override
	public List<Reservation> futureList(int memberNo) {
		// TODO Auto-generated method stub
		return reservationRepository.selectFutureList(memberNo);
	}

}
