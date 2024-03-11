package webserver2.newproject.board.service;

import lombok.Getter;

public enum ExceptionCode {
    BOARD_NOT_FOUND(400, "board not found"), NO_PERMISSION(407, "email not found"), MEMBER_NOT_FOUND(408, "member not found");

    @Getter
    private int status;
    @Getter
    private String message;

    ExceptionCode(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
