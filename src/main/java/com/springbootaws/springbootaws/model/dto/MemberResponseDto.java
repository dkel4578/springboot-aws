package com.springbootaws.springbootaws.model.dto;

import com.springbootaws.springbootaws.model.Member;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponseDto {
    private String email;

    public static MemberResponseDto of(Member member){
        return MemberResponseDto.builder().
                email(member.getEmail())
                .build();
    }
}
