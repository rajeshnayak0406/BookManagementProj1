package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;

@Service
public class BookServive {
	@Autowired
	private BookRepository br;
	
	public void save(Book b) {
		br.save(b);
		
	}
	public List<Book> getAllBook(){
		return br.findAll();
	}
	
	public Book getBookById(int id) {
		return br.findById(id).get();
		
	}
	public void deleteById(int id) {
		br.deleteById(id);
	}
	

}
