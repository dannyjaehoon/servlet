package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


// 스프링이 @Controller때문에 자동으로 스프링 빈으로 등록한다.
// 스프링 mvc에서 애노테이션 기반 컨트롤러 인식한다.
@Controller
public class SpringMemberFormControllerV1 {

    // 요청정보를 매핑해서 해당 url이 호출되면 이 메서드가 호출된다. ㅇ
    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
