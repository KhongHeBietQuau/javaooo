package com.hithaui.dao;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "comments")
public class CommentDAO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_id")
	private Integer id;

	@Column(name = "book_id_last")
	private Integer book_id_last;

	@Column(name = "user_id")
	private Integer user_id;

	
	@Nationalized
	@Column(name = "name", nullable = false,length = 1000)
	private String name;
	
	@Nationalized
	@Column(name = "content", nullable = false,length = 3000)
	private String content; 
	
	@ManyToOne
	@JoinColumn(name = "book_id")
	@JsonIgnore
	private BookDAO bookDAO;

	@CreationTimestamp
	private Timestamp createAt;

	@UpdateTimestamp
	private Timestamp updateAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBook_id_last() {
		return book_id_last;
	}

	public void setBook_id_last(Integer book_id_last) {
		this.book_id_last = book_id_last;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public BookDAO getBookDAO() {
		return bookDAO;
	}

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
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

	public CommentDAO(Integer id, Integer book_id_last, Integer user_id, String name, String content, BookDAO bookDAO,
			Timestamp createAt, Timestamp updateAt) {
		super();
		this.id = id;
		this.book_id_last = book_id_last;
		this.user_id = user_id;
		this.name = name;
		this.content = content;
		this.bookDAO = bookDAO;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public CommentDAO() {
		super();
	}

	
	
}
