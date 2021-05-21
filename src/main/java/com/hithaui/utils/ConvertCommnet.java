package com.hithaui.utils;

import com.hithaui.dao.CommentDAO;
import com.hithaui.dto.CommentDTO;

public class ConvertCommnet {
	public static CommentDAO fromDAO(CommentDTO commentDTO)
	{
		CommentDAO commentDAO = new CommentDAO();
		commentDAO.setContent(commentDTO.getContent());
		commentDAO.setName(commentDTO.getName());
		return commentDAO;
	}
}
