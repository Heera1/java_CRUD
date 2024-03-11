//package webserver2.newproject.board.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import java.util.List;
//import java.util.ArrayList;
//@Entity
//@Getter @Setter
//@NoArgsConstructor //기본 생성자를 만들어준다
//public class Board {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키 지정 //DB 식별에 쓰이는 대표요소
//    private Long boardId;
//    private String title;
//    private String content;
//    private Long member;
//    private Long boardCount;
//
//    @OneToMany(mappedBy = "board", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    private List<Reply> reply = new ArrayList<>();
//
//}
