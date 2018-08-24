package bitcamp.newdeal.service;

import java.util.List;

import bitcamp.newdeal.domain.Member;

public interface MemberService {

	List<Member> list();

    Member getMember(String id, String password);

}
