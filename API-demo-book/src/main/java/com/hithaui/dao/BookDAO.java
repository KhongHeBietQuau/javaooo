package com.hithaui.dao;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "books")
public class BookDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private Integer id;

	@Nationalized
	@Column(name = "name_book", nullable = false)
	private String nameBook;

	@Column(name = "link_book", nullable = false, unique = true)
	private String linkBook;

	@Nationalized
	@Column(name = "author", nullable = false)
	private String author;
	
	@Nationalized
	@Column(name = "publishing_company", nullable = false)
	private String publishingCompany;
	
	@Column(name = "language", nullable = false)
	private String language;
	
	@OneToMany(mappedBy = "bookDAO", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<CommentDAO> listCommentDAOs;

	@CreationTimestamp
	private Timestamp createAt ;
	
	@UpdateTimestamp
	private Timestamp updateAt;
	
	@Column(name = "number_of_pages", nullable = false)
	private Integer numberOfPages;

	@Column(name = "status_book", nullable = false)
	private String statusBook;
	
	@Column(name = "view_book", nullable = false)
	private Integer viewBook;
	
	@Column(name = "like_book", nullable = false)
	private Integer likeBook;
	
	@Nationalized
	@Column(name = "content_book", nullable = false)
	private String contentBook;
	
	@Nationalized
	@Column(name = "describe_book", nullable = false)
	private String describeBook;
	
	@Column(name = "price_book", nullable = false)
	private Integer	 priceBook;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public List<CommentDAO> getListCommentDAOs() {
		return listCommentDAOs;
	}

	public void setListCommentDAOs(List<CommentDAO> listCommentDAOs) {
		this.listCommentDAOs = listCommentDAOs;
	}

	public Timestamp getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}

	public Timestamp getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getStatusBook() {
		return statusBook;
	}

	public void setStatusBook(String statusBook) {
		this.statusBook = statusBook;
	}

	public Integer getViewBook() {
		return viewBook;
	}

	public void setViewBook(Integer viewBook) {
		this.viewBook = viewBook;
	}

	public Integer getLikeBook() {
		return likeBook;
	}

	public void setLikeBook(Integer likeBook) {
		this.likeBook = likeBook;
	}

	public String getContentBook() {
		return contentBook;
	}

	public void setContentBook(String contentBook) {
		this.contentBook = contentBook;
	}

	public String getDescribeBook() {
		return describeBook;
	}

	public void setDescribeBook(String describeBook) {
		this.describeBook = describeBook;
	}

	public Integer getPriceBook() {
		return priceBook;
	}

	public void setPriceBook(Integer priceBook) {
		this.priceBook = priceBook;
	}

	public BookDAO(Integer id, String nameBook, String linkBook, String author, String publishingCompany,
			String language, List<CommentDAO> listCommentDAOs, Timestamp createAt, Timestamp updateAt,
			Integer numberOfPages, String statusBook, Integer viewBook, Integer likeBook, String contentBook,
			String describeBook, Integer priceBook) {
		super();
		this.id = id;
		this.nameBook = nameBook;
		this.linkBook = linkBook;
		this.author = author;
		this.publishingCompany = publishingCompany;
		this.language = language;
		this.listCommentDAOs = listCommentDAOs;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.numberOfPages = numberOfPages;
		this.statusBook = statusBook;
		this.viewBook = viewBook;
		this.likeBook = likeBook;
		this.contentBook = contentBook;
		this.describeBook = describeBook;
		this.priceBook = priceBook;
	}

	public BookDAO() {
		super();
	}

	
	
}
