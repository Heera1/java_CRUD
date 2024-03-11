//package webserver2.newproject.board.controller;
//
//import jakarta.validation.Valid;
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import webserver2.newproject.board.dto.CommentPostDto;
//import webserver2.newproject.board.dto.ReplyResponseDto;
//import webserver2.newproject.board.service.ReplyService;
//
//
//@Getter @Setter
//@RestController
//@RequestMapping("/api/replies")
//@RequiredArgsConstructor
//public class ReplyController {
//
//    private final ReplyService replyService;
//
//    @GetMapping("/post-comment/{boardId}")
//    public ResponseEntity<Page<ReplyResponseDto>> getAllReply(
//            @PathVariable("boardId") Long boardId,
//            @RequestParam(value = "page", defaultValue = "1") int page,
//            @RequestParam(value = "size", defaultValue = "5") int size){
//        Pageable pageable = PageRequest.of(page - 1, size);
//        Page<ReplyResponseDto> replies = replyService.findAllReply(pageable, boardId);
//        return ResponseEntity.status(HttpStatus.OK).body(replies);
//    }
//
//    @PostMapping("/post-comment/{boardId}")
//    public ResponseEntity postComment (
//            @PathVariable("boardId") Long boardId,
//            @RequestBody @Valid CommentPostDto commentPostDto){
//        Long commentId = replyService.createReply(boardId, commentPostDto);
//        return ResponseEntity.status(HttpStatus.CREATED).body(commentId);
//    }
//}
