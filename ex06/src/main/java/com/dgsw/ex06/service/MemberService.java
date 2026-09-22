package com.dgsw.ex06.service;

import com.dgsw.ex06.entity.Member;
import com.dgsw.ex06.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

    public Member getMember(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    public Member save(Member member) {
        return memberRepository.save(member);
    }

    public Member update(Long id, Member member) throws Exception {
        Optional<Member> memberOptional = memberRepository.findById(id);
        if (memberOptional.isPresent()) {
            Member temp = memberOptional.get();
            temp.setName(member.getName());
            temp.setEmail(member.getEmail());
            return memberRepository.save(temp);
        } else {
            throw new Exception("해당하는 id: " + id + "이(가) 없어서 수정할 내용이 없습니다.");
        }
    }

    public boolean deleteMember(Long id) throws Exception {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new Exception("해당하는 id: " + id + "이(가) 없어서 삭제할 내용이 없습니다."));
        memberRepository.delete(member);
        return true;
    }
}
