//package webserver2.newproject.board.controller;
//
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//import webserver2.newproject.board.dto.BoardPatchDto;
//import webserver2.newproject.board.dto.BoardPostDto;
//import webserver2.newproject.board.dto.BoardResponseDto;
//import webserver2.newproject.board.entity.Member;
//import webserver2.newproject.board.service.BoardService;
//
//import org.springframework.data.domain.Pageable;
//
//
//@Getter @Setter
//@RestController
//@RequestMapping("/api/boards")
//@RequiredArgsConstructor
//public class BoardController {
//    private final BoardService boardService;
//
//    @PostMapping("")
//    public ResponseEntity postBoard(@RequestBody @Validated BoardPostDto boardPostDto){
//        Long boardId = boardService.createBoard(boardPostDto);
//        return ResponseEntity.status(HttpStatus.CREATED).body(boardId);
//    }
//
//    @PatchMapping("/{boardId}")
//    public ResponseEntity patchBoard(@RequestBody @Validated BoardPatchDto boardPatchDto, @PathVariable("boardId")Long boardId, @RequestBody @Validated Member email){
//        boardService.updateBoard(boardPatchDto, boardId, String.valueOf(email));
//        return ResponseEntity.status(HttpStatus.OK).body(boardId);
//    }
//
//    @DeleteMapping("/{boardId}")
//    public ResponseEntity deleteBoard(@PathVariable("boardId") Long boardId){
//        boardService.deleteBoard(boardId);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }
//
//    @GetMapping("/{boardId}")
//    public ResponseEntity getBoard(@PathVariable("boardId") Long boardId){
//        BoardResponseDto boardResponseDto = boardService.findByBoardId(boardId);
//        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
//    }
//
//    @GetMapping
//    public ResponseEntity<Page<BoardResponseDto>> getAllBoards(
//            @RequestParam(value = "page", defaultValue = "1")int page,
//            @RequestParam(value = "size", defaultValue = "5")int size){
//
//        Pageable pageable = (Pageable) PageRequest.of(page - 1, size);
//        Page<BoardResponseDto> boards = boardService.findAllBoards(pageable);
//        return ResponseEntity.status(HttpStatus.OK).body(boards);
//    }
//
//}
