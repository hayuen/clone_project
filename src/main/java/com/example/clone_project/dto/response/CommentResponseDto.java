package com.example.clone_project.dto.response;

import com.example.clone_project.entity.Comment;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentResponseDto {
    public Long id;
    public String content;
    public String author;
    public LocalDateTime modifiedAt;
    public String profileImg;

    public CommentResponseDto(Long id, String content, String author, LocalDateTime modifiedAt, String profileImg) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.modifiedAt = modifiedAt;
        this.profileImg = profileImg;
    }

    public static CommentResponseDto fromEntity(Comment comment) {
        return new CommentResponseDto(comment.getId(), comment.getContent(), comment.getMember().getNickname(), comment.getModifiedAt(), comment.getMember().getProfileImageUrl());
    }
}
