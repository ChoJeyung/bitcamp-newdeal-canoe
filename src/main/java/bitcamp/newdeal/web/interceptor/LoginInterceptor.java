package bitcamp.newdeal.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        HttpSession session = request.getSession();
        handler = session.getAttribute("loginUser");
//        if (handler == null) {
//            System.out.println("로그인 필요함!");
//            return false;
//        }
        return true;
    }

}
