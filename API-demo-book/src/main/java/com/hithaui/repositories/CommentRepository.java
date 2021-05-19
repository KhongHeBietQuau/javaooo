package com.hithaui.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hithaui.dao.CommentDAO;

@Repository
public interface CommentRepository extends JpaRepository<CommentDAO, Integer>{

}
