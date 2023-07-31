package com.springbootaws.springbootaws.repository;

import com.springbootaws.springbootaws.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
        boolean existsByEmail(String email);
}
