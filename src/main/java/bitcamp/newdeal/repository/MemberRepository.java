package bitcamp.newdeal.repository;

import java.util.List;
import java.util.Map;

import bitcamp.newdeal.domain.Member;

public interface MemberRepository {

	List<Member> selectList();

    Member findByIdAndPassword(Map<String, Object> params);

    int insertMember(Member member);

    Member findByNo(int memberNo);

    int updateMember(Member member);

    String findById(String id);

	Member findByGId(String id);

	int dropID(String id);

}
