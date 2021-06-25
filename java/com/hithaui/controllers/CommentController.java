package com.hithaui.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hithaui.dao.BookDAO;
import com.hithaui.dao.CommentDAO;
import com.hithaui.dto.CommentDTO;
import com.hithaui.exceptions.NotFoundException;
import com.hithaui.repositories.BookRepository;
import com.hithaui.repositories.CommentRepository;

@RestController
@RequestMapping("/api/comments")
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.DELETE })
public class CommentController {
		
		
		@Autowired
		private CommentRepository commentRepository;
		
		@Autowired
		private BookRepository bookRepository;
		
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
			Optional<BookDAO> optional = bookRepository.findById(commentDTO.getBookId());
			if(!optional.isPresent())
				throw new NotFoundException("Not found Book by CommnetId " + commentDTO.getBookId());
				CommentDAO commentDAO = new CommentDAO();
				commentDAO.setContent(commentDTO.getContent());
				commentDAO.setName(commentDTO.getName());
				commentDAO.setBookDAO(optional.get());
				
				CommentDAO newcCommentDAO = commentRepository.save(commentDAO);
				return ResponseEntity.status(201).body(newcCommentDAO);
		}
		
		@DeleteMapping("/{CommentID}")
		public ResponseEntity<?> deleteCommentByID(@PathVariable("CommentID") Integer CommentID)
		{
			Optional<CommentDAO> optional = commentRepository.findById(CommentID);
			if(!optional.isPresent())
			{
				throw new NotFoundException("Not found commnet by commentId " + CommentID);
				
			}
			commentRepository.deleteById(CommentID);
			return ResponseEntity.status(200).build();
		}
}
