package bitcamp.newdeal.web.json;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.newdeal.domain.Member;
import bitcamp.newdeal.service.MemberService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired MemberService memberService;
    
    @PostMapping("signIn")
    public Object signIn(String id, String password, boolean saveId, HttpSession session) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            Member loginUser = memberService.getMember(id, password);
            if (loginUser == null) {
                throw new Exception("로그인 실패!");
            }
            session.setAttribute("loginUser", loginUser);
            result.put("status", "success");
        } catch (Exception e) {
            result.put("status", "fail");
            result.put("message", e.getMessage());
            System.out.println(e);
        }
        return result;
    }
}
