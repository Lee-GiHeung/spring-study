package controllers.member;

import models.member.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MemberController {

    //@GetMapping("/member/join")
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST},
    path="/member/join")
    public String join(Model model) {

        String[] addCss = {"member/style1", "member/style2"};
        List<String> addScript = Arrays.asList("member/script1", "member/script2");

        model.addAttribute("addCss", addCss);
        model.addAttribute("addScript", addScript);
        model.addAttribute("pageTitle", "회원가입");
        
        return "member/join";
    }

    /*
    @PostMapping("/member/join")
    public String joinPs(RequestJoin form) {
        System.out.println(form);
        return "member/join";
    }
    */

    @GetMapping("/member/login")
    public String login() {

        return "member/login";
    }

    @PostMapping("/member/login")
    public String loginPs(RequsetLogin form) {
        System.out.println(form);
        return "member/login";
    }

    @GetMapping("/member/list")
    public String members(Model model) {

        List<Member> members = new ArrayList<>();
        for(int i=1; i<=10 ; i++) {
            Member member = Member.builder()
                    .userNo(Long.valueOf(i))
                    .userPw("1234")
                    .userId("user" + i)
                    .userNm("사용자01" + i)
                    .email("user" + "@test.org")
                    .regDt(LocalDateTime.now())
                    .build();
            members.add(member);
        }
        model.addAttribute("members", members);

        return "member/list";
    }
}