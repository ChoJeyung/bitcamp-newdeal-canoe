package bitcamp.newdeal.web.json;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.newdeal.domain.Member;
import bitcamp.newdeal.service.MemberService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired MemberService memberService;
    
    @GetMapping("sessionCheck")
    public Object sessionCheck(HttpSession session) {
        HashMap<String, Object> result = new HashMap<>();
        Member loginUser = (Member)session.getAttribute("loginUser");
        if(loginUser != null) {
            loginUser.setMemberPwd("");
            result.put("loginUser", loginUser);
        } else {
            result.put("loginUser", null);
        }
        return result;
    }
    
    
    @PostMapping("logIn")
    public Object logIn(String id, String password, HttpSession session) {
        HashMap<String, Object> result = new HashMap<>();
        System.out.println(id+" : "+password);
        try {
            Member loginUser = memberService.getMember(id, password);
            System.out.println(loginUser);
            if (loginUser == null) {
                throw new Exception("로그인 실패!");
            }
            loginUser.setMemberPwd("");
            session.setAttribute("loginUser", loginUser);
            result.put("status", "success");
            result.put("loginUser", loginUser);
        } catch (Exception e) {
            result.put("status", "fail");
            result.put("message", e.getMessage());
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    @PostMapping("gLogIn")
    public Object gLogIn(String id, HttpSession session) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            Member loginUser = memberService.checkGId(id);
            System.out.println(loginUser);
            if (loginUser == null) {
                throw new Exception("로그인 실패!");
            }
            loginUser.setMemberPwd("");
            session.setAttribute("loginUser", loginUser);
            result.put("status", "success");
            result.put("loginUser", loginUser);
        } catch (Exception e) {
            result.put("status", "fail");
            result.put("message", e.getMessage());
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    @GetMapping("logOut")
    public void logOut(HttpSession session) {
        session.removeAttribute("loginUser");
    }
}
