package com.main1team.Login_board.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "coummunity")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private LocalDateTime startdate;

    @Column
    private String content;

    @Column
    private String rank;

    @Column
    private String times;

    @Column
    private String comments;

//    public static CommentEntity toSaveEntity(CommentDTO commentDTO, BoardEntity boardEntity) {
//        CommentEntity commentEntity = new CommentEntity();
//        commentEntity.setCommentWriter(commentDTO.getCommentWriter());
//        commentEntity.setCommentContents(commentDTO.getCommentContents());
//        commentEntity.setBoardEntity(boardEntity);
//        return commentEntity;
//    }
}

