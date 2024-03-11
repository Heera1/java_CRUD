package webserver2.newproject.board.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberPatchDto {
    @NotEmpty
    private String email;
    private String password;
    private String nickname;
}
