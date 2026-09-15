package com.dgsw.ex06.controller;

import com.dgsw.ex06.entity.Member;
import com.dgsw.ex06.repository.MemberRepository;
import com.dgsw.ex06.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("members")
@RequiredArgsConstructor
@CrossOrigin
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public List<Member> getMembers() {
        return memberService.getMembers();
    }

    @GetMapping("/{id}")
    public Member getMember(@PathVariable Long id) {
        return memberService.getMember(id);
    }
}
