package webserver2.newproject.board.service;


import webserver2.newproject.board.dto.MemberPostDto;

public interface MemberService {
    void signUp(MemberPostDto memberPostDto);
    boolean signIn(MemberPostDto memberPostDto);
}
