package bitcamp.newdeal.web.json;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.newdeal.domain.Member;
import bitcamp.newdeal.service.MemberService;

@RestController
@RequestMapping("/member")

public class MemberController {
	MemberService memberService;

	public MemberController(MemberService memberService) {
		// TODO Auto-generated constructor stub
		this.memberService = memberService;
	}

	@GetMapping("list")
	public Object list() {
		List<Member> list = memberService.list();
		HashMap<String, Object> result = new HashMap<>();
		result.put("status", "success");
		result.put("list", list);
		return result;
	}
	
	@PostMapping("register")
	public Object register(Member member) {
	    System.out.println(member);
	    HashMap<String, Object> result = new HashMap<>();
	    try {
	        memberService.register(member);
	        result.put("status", "success");
        } catch (Exception e) {
            System.out.println("회원가입 실패!");
            System.out.println(e);
        }
	    return result;
	}
	
	@GetMapping("myInfo")
	public Object myInfo(HttpSession session) {
	    System.out.println("현재 로그인 사용자 : " + session.getAttribute("loginUser"));
	    HashMap<String, Object> result = new HashMap<>();
	    try {
	        Member member = memberService.myInfo(((Member)session.getAttribute("loginUser")).getMemberNo());
	        result.put("status", "success");
	        result.put("member", member);
        } catch (Exception e) {
            System.out.println(e);
        }
	    return result;
	}
	
	@PostMapping("myInfoModify")
	public Object myInfoModify(Member member, HttpSession session) {
	    System.out.println("현재 로그인 사용자 : " + session.getAttribute("loginUser"));
	    member.setMemberNo(((Member)session.getAttribute("loginUser")).getMemberNo());
	    HashMap<String, Object> result = new HashMap<>();
	    try {
	        memberService.myInfoModify(member);
	        result.put("status", "success");
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	    return result;
	}
	
	@GetMapping("checkId")
	public Object checkId(String id) {
	    //HashMap<String, Object> result = new HashMap<>();
		System.out.println(id);
	    id = memberService.checkId(id);
	    //result.put("id", id);
	    return id;
	}
	@GetMapping("checkGID")
	public Object checkGID(String id) {
	    HashMap<String, Object> result = new HashMap<>();
		Member gMember = new Member();
		System.out.println(id);
	    gMember = memberService.checkGId(id);
	    result.put("gMember", gMember);
	    return result;
	}
	
	@GetMapping("dropID")
	public Object dropID(HttpSession session) {
	    HashMap<String, Object> result = new HashMap<>();
	    Member logInMember = (Member)session.getAttribute("loginUser");
	    System.out.println(logInMember.getMemberId());
	    memberService.dropID(logInMember.getMemberId());
	    result.put("status", "success");
	    return result;
	}
}
