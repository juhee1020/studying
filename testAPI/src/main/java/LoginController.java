import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;


@RestController
public class LoginController {
    KakaoAPI kakaoAPIPI=new KakaoAPI();

    @RequestMapping
    public ModelAndView login(@RequestParam("code") String code, HttpSession session){
        ModelAndView mav=new ModelAndView();
        // 인증코드 요청 전달
        String access_token=kakaoAPIPI.getAccessToken(code);
        // 인증코드로 토큰 전달
        HashMap<String, Object> userInfo=kakaoAPIPI.getUserInfo(access_token);

        return mav;
    }
}
