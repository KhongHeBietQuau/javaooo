package com.hithaui.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hithaui.dao.CommentDAO;
import com.hithaui.dto.CommentDTO;
import com.hithaui.exceptions.NotFoundException;
import com.hithaui.repositories.CommentRepository;

@RestController
@RequestMapping("/api/comments")
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.DELETE })
public class CommentController {
		
		
		@Autowired
		private CommentRepository commentRepository;
		
		@GetMapping
		public ResponseEntity<?> findAllComments(){
			List<CommentDAO> list = commentRepository.findAll();
			if (list.size() == 0) {
				throw new NotFoundException("No content");
			}
			return ResponseEntity.status(HttpStatus.OK).body(list);
		}
		
		@PostMapping
		public ResponseEntity<?> createComment(@RequestBody CommentDTO commentDTO)
		{
			CommentDAO commentDAO = new CommentDAO();
			commentDAO.setContent(commentDTO.getContent());
			commentDAO.setName(commentDTO.getName());
			
			CommentDAO newCommentDAO = commentRepository.save(commentDAO);
			return ResponseEntity.status(HttpStatus.CREATED).body(newCommentDAO);
		}
}
