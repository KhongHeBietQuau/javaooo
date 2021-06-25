package com.hithaui.dto;

public class BookDTO {
	
	private String nameBook;

	
	private String linkBook;

	
	private String author;
	
	//2 cái thuộc tính username và password có thể không cần truyền nếu chỉ là user còn nếu là admin thì phải truyền cho nó xác nhận
	private String username;
	private String password;
	//
	private String publishingCompany;
	
	
	private String language;
	
	
	private Integer numberOfPages;

	private String status;
	
	
	private Integer view;
	
	private Integer like;
	
	
	private String content;
	
	
	private String describe;
	
	
	private Integer price;


	public String getNameBook() {
		return nameBook;
	}


	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}


	public String getLinkBook() {
		return linkBook;
	}


	public void setLinkBook(String linkBook) {
		this.linkBook = linkBook;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPublishingCompany() {
		return publishingCompany;
	}


	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public Integer getNumberOfPages() {
		return numberOfPages;
	}


	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Integer getView() {
		return view;
	}


	public void setView(Integer view) {
		this.view = view;
	}


	public Integer getLike() {
		return like;
	}


	public void setLike(Integer like) {
		this.like = like;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getDescribe() {
		return describe;
	}


	public void setDescribe(String describe) {
		this.describe = describe;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public BookDTO(String nameBook, String linkBook, String author, String username, String password,
			String publishingCompany, String language, Integer numberOfPages, String status, Integer view, Integer like,
			String content, String describe, Integer price) {
		super();
		this.nameBook = nameBook;
		this.linkBook = linkBook;
		this.author = author;
		this.username = username;
		this.password = password;
		this.publishingCompany = publishingCompany;
		this.language = language;
		this.numberOfPages = numberOfPages;
		this.status = status;
		this.view = view;
		this.like = like;
		this.content = content;
		this.describe = describe;
		this.price = price;
	}


	public BookDTO() {
		super();
	}


	
	
	
}
