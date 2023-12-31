package hello.service.controller;

import hello.service.dto.MemberDTO;
import hello.service.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
public class MemberController {
    // 생성자 주입
    private final MemberService memberService;

    // 회원가입 페이지 출력 요청
    @GetMapping("/member/signup")
    public String signupForm() {
        return "signup";
    }

    @PostMapping("/member/signup")
    public String signup(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.signup");
        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);
        return null;
    }
}
