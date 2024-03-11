package webserver2.newproject.board.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webserver2.newproject.board.entity.Member;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberResponseDto {
    private Long id;
    private String email;
    private String password;
    private String nickname;

    public static MemberResponseDto FindFromMember(Member member){
        return new MemberResponseDto(
                member.getId(),
                member.getEmail(),
                member.getPassword(),
                member.getNickname()
        );
    }
}
