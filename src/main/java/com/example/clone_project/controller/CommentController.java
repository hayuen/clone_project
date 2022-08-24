package com.example.clone_project.controller;

import com.example.clone_project.dto.comment.CommentRequestDto;
import com.example.clone_project.dto.comment.CommentResponseDto;
import com.example.clone_project.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class CommentController {
    private final CommentService commentService;


    @PostMapping("/api/comments/{postId}")
    public ResponseEntity<?> createComment(@PathVariable Long postId, @RequestBody CommentRequestDto requestDto){
        return commentService.createComment(postId,requestDto);



    }
    @PutMapping("/api/comments/{commentId}") // 댓글 수정
    public ResponseEntity<String> updateComment(@PathVariable Long commentId,
                                                @RequestBody CommentRequestDto commentRequestDto){
        return commentService.updateComment(commentId, commentRequestDto);
    }

    @DeleteMapping("/api/comments/{commentId}") // 댓글 삭제
    public ResponseEntity<String> deleteComment(@PathVariable Long commentId){
        return commentService.deleteComment(commentId);
    }

}
