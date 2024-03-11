package webserver2.newproject.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import webserver2.newproject.board.dto.MemberPostDto;
import webserver2.newproject.board.entity.Member;
import webserver2.newproject.board.repository.MemberRepository;

@Service
public class MemberServiceImp1 implements MemberService{
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void signUp(MemberPostDto memberPostDto){
        Member member = new Member();
        member.setNickname(memberPostDto.getNickname());
        member.setEmail(memberPostDto.getEmail());
        member.setPassword(passwordEncoder.encode(memberPostDto.getPassword()));
        memberRepository.save(member);
    }

    @Override
    public boolean signIn(MemberPostDto memberPostDto){
        Member member = memberRepository.findByEmail(memberPostDto.getEmail());
        if(member != null && passwordEncoder.matches(memberPostDto.getPassword(), member.getPassword())){
            return true;
        }
        return false;
    }
}
