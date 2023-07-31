package com.springbootaws.springbootaws.model.dto;

import com.springbootaws.springbootaws.model.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberRequestDto {
    private String email;
    private String password;

    public Member toMember(PasswordEncoder passwordEncoder){
        return Member.builder()
                .email(email)
                .password(passwordEncoder.encode(password))
                .build();
    }

    public MemberResponseDto toMemberResponseDto(MemberRequestDto memberRequestDto) {
        return MemberResponseDto.builder()
                .email("이미 존재하는 이메일 입니다.")
                .build();
    }
}
