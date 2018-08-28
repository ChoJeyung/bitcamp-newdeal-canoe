package bitcamp.newdeal.repository;

import java.util.List;

import bitcamp.newdeal.domain.Grade;

public interface GradeRepository {

	List<Grade> selectList();

	List<Grade> findByTrvlNo(int trvlNo);

}
