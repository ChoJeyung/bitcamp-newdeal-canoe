package bitcamp.newdeal.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.newdeal.domain.Airport;
import bitcamp.newdeal.domain.Grade;
import bitcamp.newdeal.repository.AirportRepository;
import bitcamp.newdeal.repository.GradeRepository;
import bitcamp.newdeal.service.AirportService;
import bitcamp.newdeal.service.GradeService;

@Service
public class GradeServiceImpl implements GradeService {
	GradeRepository gradeRepository;
	public GradeServiceImpl(GradeRepository gradeRepository) {
		// TODO Auto-generated constructor stub
		this.gradeRepository = gradeRepository;
	}

	@Override
	public List<Grade> list() {
		// TODO Auto-generated method stub
		return gradeRepository.selectList();
	}

	@Override
	public List<Grade> listByTrvlNo(int trvlNo) {
		// TODO Auto-generated method stub
		return gradeRepository.findByTrvlNo(trvlNo);
	}
}
