package bitcamp.newdeal.service.impl;

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
	public List<Reservation> list() {
		// TODO Auto-generated method stub
		return reservationRepository.selectList();
	}

}
