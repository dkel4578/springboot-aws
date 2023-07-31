package com.springbootaws.springbootaws.controller;

import com.springbootaws.springbootaws.model.dto.MemberRequestDto;
import com.springbootaws.springbootaws.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/signup")
    public String signup(@RequestBody MemberRequestDto memberRequestDto){
            memberService.signup(memberRequestDto);
            return "redirect:/login";

    }



}
