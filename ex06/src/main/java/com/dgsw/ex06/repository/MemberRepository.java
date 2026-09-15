package com.dgsw.ex06.repository;

import com.dgsw.ex06.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
