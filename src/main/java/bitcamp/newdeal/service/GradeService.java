package bitcamp.newdeal.service;

import java.util.List;

import bitcamp.newdeal.domain.Grade;

public interface GradeService {

	List<Grade> list();

	List<Grade> listByTrvlNo(int trvlNo);

}
