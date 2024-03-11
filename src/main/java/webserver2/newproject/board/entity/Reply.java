//package webserver2.newproject.board.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.hibernate.annotations.ColumnDefault;
//import org.hibernate.annotations.DynamicInsert;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Getter @Setter
//@NoArgsConstructor
//@DynamicInsert
//public class Reply {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "comment_id")
//    private Long commentId;
//
//    @Column(nullable = false, length = 1000)
//    private String reContent;
//
//    @ColumnDefault("false")
//    @Column(nullable = false)
//    private Boolean isDeleted;
//
//
//    @ManyToOne
//    @JoinColumn(name = "board_id")
//    private Board board;
//
//    @ManyToOne
//    @JoinColumn(name = "parent_id")
//    private Reply parent;
//
//    @OneToMany(mappedBy = "parent", orphanRemoval = true)
//    private List<Reply> children = new ArrayList<>();
//}
