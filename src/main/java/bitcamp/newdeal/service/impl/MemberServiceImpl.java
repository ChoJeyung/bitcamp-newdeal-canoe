package bitcamp.newdeal.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.newdeal.domain.Member;
import bitcamp.newdeal.repository.MemberRepository;
import bitcamp.newdeal.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	MemberRepository memberRepository;
	public MemberServiceImpl(MemberRepository memberRepository) {
		// TODO Auto-generated constructor stub
		this.memberRepository = memberRepository;
	}
	@Override
	public List<Member> list() {
		// TODO Auto-generated method stub
		return memberRepository.selectList();
	}
    @Override
    public Member getMember(String id, String password) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("id", id);
        params.put("password", password);
        return memberRepository.findByIdAndPassword(params);
    }
    @Override
    public int register(Member member) {
        return memberRepository.insertMember(member);
    }
    @Override
    public Member myInfo(int memberNo) {
        return memberRepository.findByNo(memberNo);
    }
    @Override
    public int myInfoModify(Member member) {
        return memberRepository.updateMember(member);
    }
    @Override
    public String checkId(String id) {
        return memberRepository.findById(id);
    }
	@Override
	public Member checkGId(String id) {
		// TODO Auto-generated method stub
		return memberRepository.findByGId(id);
	}
	@Override
	public Member getGMember(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int dropID(String id) {
		// TODO Auto-generated method stub
		return memberRepository.dropID(id);
	}

}
