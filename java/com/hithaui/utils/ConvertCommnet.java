package com.hithaui.utils;

import com.hithaui.dao.CommentDAO;
import com.hithaui.dto.CommentDTO;

public class ConvertCommnet {
	public static CommentDAO fromDAO(CommentDTO commentDTO)
	{
		CommentDAO commentDAO = new CommentDAO();
		commentDAO.setContent(commentDTO.getContent());
		commentDAO.setName(commentDTO.getName());
		commentDAO.setBook_id_last(commentDTO.getBookId());
		commentDAO.setUser_id(commentDTO.getUserId());
		return commentDAO;
	}
}
