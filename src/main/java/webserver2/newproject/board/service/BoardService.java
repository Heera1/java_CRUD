//import lombok.Getter;
//
//public class BusinessLogicException extends RuntimeException{
//
//    @Getter
//    private ExceptionCode exceptionCode;
//
//    public BusinessLogicException(ExceptionCode exceptionCode) {
//        super(exceptionCode.getMessage());
//        this.exceptionCode = exceptionCode;
//    }
//}
//
//public enum ExceptionCode {
//    BOARD_NOT_FOUND(400, "board not found"), NO_PERMISSION(407, "email not found"), MEMBER_NOT_FOUND(408, "member not found");
//
//    @Getter
//    private int status;
//    @Getter
//    private String message;
//
//    ExceptionCode(int status, String message) {
//        this.status = status;
//        this.message = message;
//    }
//}