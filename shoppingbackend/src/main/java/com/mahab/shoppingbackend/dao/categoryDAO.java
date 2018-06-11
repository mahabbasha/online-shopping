package com.mahab.shoppingbackend.dao;

import java.util.List;

import com.mahab.shoppingbackend.dto.Category;

public interface categoryDAO {
	
	
	List<Category> list();
	Category get(int id);

}