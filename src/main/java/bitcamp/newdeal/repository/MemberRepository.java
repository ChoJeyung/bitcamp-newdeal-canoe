package bitcamp.newdeal.repository;

import java.util.List;

import bitcamp.newdeal.domain.Member;

public interface MemberRepository {

	List<Member> selectList();

}
