package webserver2.newproject.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webserver2.newproject.board.dto.MemberPostDto;
import webserver2.newproject.board.dto.MemberResponseDto;
import webserver2.newproject.board.service.MemberService;

@RestController
@RequestMapping("/api/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody MemberPostDto memberPostDto){
        memberService.signUp(memberPostDto);
        return new ResponseEntity<>("User signed up successfully", HttpStatus.CREATED);
    }

    @PostMapping("/signin")
    public ResponseEntity<String> singIn(@RequestBody MemberPostDto memberPostDto){
        if(memberService.signIn(memberPostDto)){
            return new ResponseEntity<>("user signed in succesfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Invalid email or password", HttpStatus.UNAUTHORIZED);
    }
}
