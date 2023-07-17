package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class MemberController {

    private final MemberService memberService;

    // 생성자 injection => 권장
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // setter injection(주입) => Alt+Ins => setter + Autowired
    // 단점: 중간에 잘못 바꾸면 문제가 생김 => 누군가가 사용할 때 public으로 열려있어야 함
//    private MemberService memberService;
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }
}
