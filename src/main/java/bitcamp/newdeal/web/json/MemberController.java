package bitcamp.newdeal.web.json;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
}
