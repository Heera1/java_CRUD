//package webserver2.newproject.board.dto;
//
//import jakarta.validation.constraints.NotEmpty;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import webserver2.newproject.board.entity.Reply;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class ReplyResponseDto {
//    private Long commentId;
//    private String reContent;
//    private Boolean isDeleted = false;
//    private Long parentId;
//
//    public static ReplyResponseDto FindFromReply(Reply reply){
//        return new ReplyResponseDto(
//                reply.getCommentId(),
//                reply.getReContent(),
//                reply.getIsDeleted(),
//                reply.getBoard().getBoardId()
//        );
//    }
//}
