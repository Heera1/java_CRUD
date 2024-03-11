package webserver2.newproject.board.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberPostDto {
    @NotEmpty @Email
    private String email;
    @NotEmpty
    private String password;
    @NotEmpty
    private String nickname;
}
