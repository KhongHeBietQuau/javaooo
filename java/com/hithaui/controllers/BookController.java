package com.hithaui.controllers;
import java.io.IOException;
import java.util.List;
import java.util.Map;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.hithaui.dao.BookDAO;
import com.hithaui.dao.CommentDAO;
import com.hithaui.dto.BookDTO;
import com.hithaui.exceptions.NotFoundException;
import com.hithaui.repositories.BookRepository;
import com.hithaui.utils.ConvertBook;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.DELETE })
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private Cloudinary  cloudinary;
	
	@GetMapping
	public ResponseEntity<?> findAllBooks()
	{
		List<BookDAO> list = bookRepository.findAll();
		if (list.size() == 0) {
			throw new NotFoundException("No content");
		}
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@GetMapping("/{bookID}")
	public ResponseEntity<?> getBookById(@PathVariable("bookID") Integer bookID)
	{
		Optional<BookDAO> optional = bookRepository.findById(bookID);
		if(!optional.isPresent())
		{
			throw new NotFoundException("Not found book by BookId " + bookID);
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
		String username ="adminTTC", passwordString ="DaXong@1";
		if(bookDTO.getUsername().equals(username)  && bookDTO.getPassword().equals(passwordString)) {
		BookDAO bookDAO = ConvertBook.fromDAO(bookDTO);
		BookDAO newBookDAO = bookRepository.save(bookDAO);
		return ResponseEntity.status(HttpStatus.CREATED).body(newBookDAO);
		}
		else {
			return ResponseEntity.status(404).build();
		}
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
			@RequestParam("content")String content,
			@RequestParam("describe") String describe,
			@RequestParam("price") Integer price
			)
	throws IOException
	{
		
		Map<?, ?> map = cloudinary.uploader().upload(linkBook.getBytes(), ObjectUtils.emptyMap());
		BookDAO bookDAO = new BookDAO();
		bookDAO.setNameBook(nameBook);
		bookDAO.setLinkBook(map.get("secure_url").toString());
		bookDAO.setAuthor(author);
		bookDAO.setPublishingCompany(publishingCompany);
		bookDAO.setLanguage(language);
		bookDAO.setNumberOfPages(numberOfPages);
		bookDAO.setStatusBook(status);
		bookDAO.setContentBook(content);
		bookDAO.setDescribeBook(describe);
		bookDAO.setPriceBook(price);
		bookDAO.setLikeBook(0);
		bookDAO.setViewBook(0);
		BookDAO newBookDAO = bookRepository.save(bookDAO);
		return ResponseEntity.status(201).body(newBookDAO);
	}
	
	
	@PatchMapping("/{bookID}")
	public ResponseEntity<?> editBookById(@PathVariable("bookID") Integer bookID,
			@RequestBody BookDTO bookDTO)
	{
		if(bookDTO.getUsername() == "adminTTC" && bookDTO.getPassword() == "DaXong@1") {
		Optional<BookDAO> optional = bookRepository.findById(bookID);
		if (!optional.isPresent()) {
			throw new NotFoundException("Not found book by BooId " + bookID);
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
		
		if(bookDTO.getContent() != null)
		{
			bookDAO.setContentBook(bookDTO.getContent());
		}
		if(bookDTO.getDescribe()!=null)
		{
			bookDAO.setDescribeBook(bookDTO.getDescribe());
		}
		if(bookDTO.getLike()!=null)
		{
			bookDAO.setLikeBook(bookDTO.getLike());
		}
		
		if(bookDTO.getPrice() != null)
		{
			bookDAO.setPriceBook(bookDTO.getPrice());
		}
		if(bookDTO.getStatus()!=null)
		{
			bookDAO.setStatusBook(bookDTO.getStatus());
		}
		if(bookDTO.getView() !=null)
		{
			bookDAO.setViewBook(bookDTO.getView());
		}
		BookDAO newBookDAO = bookRepository.save(bookDAO);
		return ResponseEntity.status(HttpStatus.OK).body(newBookDAO);
		}
		else {
			return ResponseEntity.status(404).build();
		}
	}
	
	@PatchMapping("/{bookID}/edit/image")
	public ResponseEntity<?> editImageBook(@PathVariable("bookID") Integer bookID,
			@RequestParam ("linkBook") MultipartFile linkBook)
					throws IOException
	{
		Optional<BookDAO> optional = bookRepository.findById(bookID);
		if (!optional.isPresent()) {
			throw new NotFoundException("Not found book by BooId " + bookID);
		}
		
		BookDAO bookDAO = optional.get();
		Map<?, ?> map = cloudinary.uploader().upload(linkBook.getBytes(), ObjectUtils.emptyMap());
		bookDAO.setLinkBook(map.get("secure_url").toString());
		BookDAO newBookDAO = bookRepository.save(bookDAO);
		return ResponseEntity.status(HttpStatus.OK).body(newBookDAO);
	}
	// bookID = commentID
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
