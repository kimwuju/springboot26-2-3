package com.dgsw.ex06.controller;

import com.dgsw.ex06.dto.MemberRequestDto;
import com.dgsw.ex06.entity.Member;
import com.dgsw.ex06.service.MemberService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
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

    @PostMapping()
    public Member save(@RequestBody @Valid MemberRequestDto memberRequestDto) {
        return memberService.save(memberRequestDto);
    }

    @PutMapping("/{id}")
    public Member update(
            @PathVariable Long id,
            @RequestBody Member member) throws Exception {
        return memberService.update(id, member);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "회원을 삭제합니다", description = "삭제하고 싶은 id 입력하세다")
    public boolean deleteMember(@PathVariable Long id) throws Exception {
        return memberService.deleteMember(id);
    }
}
