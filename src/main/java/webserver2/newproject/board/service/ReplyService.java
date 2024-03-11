//package webserver2.newproject.board.service;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import webserver2.newproject.board.dto.CommentPostDto;
//import webserver2.newproject.board.dto.ReplyResponseDto;
//import webserver2.newproject.board.entity.Board;
//import webserver2.newproject.board.entity.Reply;
//import webserver2.newproject.board.repository.ReplyRepository;
//
//@Service
//@RequiredArgsConstructor
//public class ReplyService {
//    private final ReplyRepository replyRepository;
//    private final BoardService boardService;
//
//    @Transactional
//    public Long createReply(Long boardId, CommentPostDto commentPostDto) {
//        Board board = boardService.findBoardId(boardId);
//        Reply reply = new Reply();
//        reply.setReContent(commentPostDto.getContent());
//        reply.setBoard(board);
//
//        // 대댓글인 경우
//        if (commentPostDto.getParentId() != null) {
//            Reply parentReply = replyRepository.findById(commentPostDto.getParentId())
//                    .orElseThrow(() -> new IllegalArgumentException("Parent reply not found"));
//            reply.setParent(parentReply);
//        }
//
//        return replyRepository.save(reply).getCommentId();
//    }
//
//    public Page<ReplyResponseDto> findAllReply(Pageable pageable, Long boardId) {
//        Board board = boardService.findBoardId(boardId);
//        Page<Reply> replies = replyRepository.findByBoard(board, pageable);
//        return replies.map(ReplyResponseDto::FindFromReply);
//    }
//}
