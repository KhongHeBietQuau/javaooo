package com.hithaui.utils;

import com.hithaui.dao.BookDAO;
import com.hithaui.dto.BookDTO;

public class Convert {
	public static BookDAO fromDAO(BookDTO bookDTO)
	{
		BookDAO bookDAO = new BookDAO();
		bookDAO.setAuthor(bookDTO.getAuthor());
		bookDAO.setLanguage(bookDTO.getLanguage());
		bookDAO.setLinkBook(bookDTO.getLinkBook());
		bookDAO.setNameBook(bookDTO.getNameBook());
		bookDAO.setNumberOfPages(bookDTO.getNumberOfPages());
		bookDAO.setPublishingCompany(bookDTO.getPublishingCompany());
		bookDAO.setStatus(bookDTO.getStatus());
		bookDAO.setView(bookDTO.getView());
		bookDAO.setLike(bookDTO.getLike());
		bookDAO.setPrice(bookDTO.getPrice());
		bookDAO.setContent(bookDTO.getContent());
		bookDAO.setDescribe(bookDTO.getDescribe());
		return bookDAO;
	}
}
