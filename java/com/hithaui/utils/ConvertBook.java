package com.hithaui.utils;

import com.hithaui.dao.BookDAO;
import com.hithaui.dto.BookDTO;

public class ConvertBook {
	public static BookDAO fromDAO(BookDTO bookDTO)
	{
		BookDAO bookDAO = new BookDAO();
		bookDAO.setAuthor(bookDTO.getAuthor());
		bookDAO.setLanguage(bookDTO.getLanguage());
		bookDAO.setLinkBook(bookDTO.getLinkBook());
		bookDAO.setNameBook(bookDTO.getNameBook());
		if(bookDTO.getNumberOfPages()!=null)
		bookDAO.setNumberOfPages(bookDTO.getNumberOfPages());
		else {
			bookDAO.setNumberOfPages(0);
		}
		bookDAO.setPublishingCompany(bookDTO.getPublishingCompany());
		bookDAO.setStatusBook(bookDTO.getStatus());
		bookDAO.setViewBook(0);
		bookDAO.setLikeBook(0);
		bookDAO.setPriceBook(bookDTO.getPrice());
		bookDAO.setContentBook(bookDTO.getContent());
		bookDAO.setDescribeBook(bookDTO.getDescribe());
		return bookDAO;
	}
}
