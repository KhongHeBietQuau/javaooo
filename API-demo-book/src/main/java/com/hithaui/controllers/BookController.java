package com.hithaui.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hithaui.dao.BookDAO;
import com.hithaui.dao.CommentDAO;
import com.hithaui.dto.BookDTO;
import com.hithaui.exceptions.NotFoundException;
import com.hithaui.repositories.BookRepository;
import com.hithaui.utils.Convert;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.DELETE })
public class BookController {
	@Autowired
	private BookRepository bookRepository;

	@GetMapping
	public ResponseEntity<?> findAllBooks()
	{
		List<BookDAO> list = bookRepository.findAll();
		if (list.size() == 0) {
			throw new NotFoundException("No content");
		}
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	/*
	@GetMapping("/{bookID}")
	public ResponseEntity<?> getBookById(@PathVariable("bookID") Integer bookID)
	{
		Optional<BookDAO> optional = bookRepository.findById(bookID);
		if(!optional.isPresent())
		{
			throw new NotFoundException("Not found student by studentId " + bookID);
		}
		return ResponseEntity.status(HttpStatus.OK).body(optional.get());
	}
	
	@GetMapping("/{bookID}/comments")
	public ResponseEntity<?> getCommentByBook(@PathVariable("bookID") Integer bookID)
	{
		Optional<BookDAO> optional = bookRepository.findById(bookID);
		BookDAO bookDAO = optional.get();
		List<CommentDAO> list = bookDAO.getListCommentDAOs();
		return ResponseEntity.status(200).body(list);
	}
	
	
	@PostMapping
	public ResponseEntity<?> createNewBook(@RequestBody BookDTO bookDTO)
	{
		BookDAO bookDAO = Convert.fromDAO(bookDTO);
		BookDAO newBookDAO = bookRepository.save(bookDAO);
		return ResponseEntity.status(HttpStatus.CREATED).body(newBookDAO);
	}
	
	@PostMapping("/data")
	public ResponseEntity<?> createBookByFormData(
			@RequestParam("nameBook") String nameBook,
			@RequestParam ("linkBook") MultipartFile linkBook,
			@RequestParam("author") String author,
			@RequestParam("publishingCompany") String publishingCompany ,
			@RequestParam("language") String language,
			@RequestParam("numberOfPages") Integer numberOfPages,
			@RequestParam("status") String status,
			@RequestParam("view" )Integer view,
			@RequestParam("like") Integer like,
			@RequestParam("content")String content,
			@RequestParam("describe") String describe,
			@RequestParam("price") Integer 
			)
	throws IOException
	{
		Map<?, ?> map = cloudinary.uploader().upload(linkBook.getBytes(), ObjectUtils.emptyMap());
	}
	
	
	@PatchMapping("/{bookID}")
	public ResponseEntity<?> editBookById(@PathVariable("bookID") Integer bookID,
			@RequestBody BookDTO bookDTO)
	{
		Optional<BookDAO> optional = bookRepository.findById(bookID);
		if (!optional.isPresent()) {
			throw new NotFoundException("Not found student by studentId " + bookID);
		}
		
		BookDAO bookDAO = optional.get();
		
		if(bookDTO.getAuthor()!=null)
		{
			bookDAO.setAuthor(bookDTO.getAuthor());
		}
		
		if(bookDTO.getLanguage()!=null)
		{
			bookDAO.setLanguage(bookDTO.getLanguage());
		}
		
		if(bookDTO.getLinkBook()!=null)
		{
			bookDAO.setLinkBook(bookDTO.getLinkBook());
		}
		
		if(bookDTO.getNameBook()!=null)
		{
			bookDAO.setNameBook(bookDTO.getNameBook());
		}
		
		if(bookDTO.getNumberOfPages()!=null)
		{
			bookDAO.setNumberOfPages(bookDTO.getNumberOfPages());
		}
		
		if(bookDTO.getPublishingCompany()!=null)
		{
			bookDAO.setPublishingCompany(bookDTO.getPublishingCompany());
		}
		
		BookDAO newBookDAO = bookRepository.save(bookDAO);
		return ResponseEntity.status(HttpStatus.OK).body(newBookDAO);
	}
	*/
	@DeleteMapping("/{bookID}")
	public ResponseEntity<?> deleteBookById(@PathVariable("bookID") Integer bookID)
	{
		Optional<BookDAO> optional = bookRepository.findById(bookID);
		if(!optional.isPresent())
		{
			throw new NotFoundException("Not found student by studentId " + bookID);
		}
		bookRepository.deleteById(bookID);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
