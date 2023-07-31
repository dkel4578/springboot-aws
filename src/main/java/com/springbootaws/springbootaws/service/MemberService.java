package com.springbootaws.springbootaws.service;

import com.springbootaws.springbootaws.model.Member;
import com.springbootaws.springbootaws.model.dto.MemberRequestDto;
import com.springbootaws.springbootaws.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public Long signup(MemberRequestDto requestDto){
        if(memberRepository.existsByEmail(requestDto.getEmail())){
            throw new IllegalArgumentException("이미 존재하는 이메일입니다.");
        }
        Member member = requestDto.toMember(passwordEncoder);
        member = memberRepository.save(member);
        return member.getId();
    }

}
