package io.springSecurity.jwt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springSecurity.jwt.Repository.AllItemsDAO;
import io.springSecurity.jwt.models.ClothModel;

@Service
public class AllItemsService {
	@Autowired
	private AllItemsDAO dao;
	
	public  List<ClothModel> getAllItems(){
		return (List<ClothModel>) dao.findAll();
	}
	public void  deleteItem(int id) {
		dao.deleteById(id);
		
	}
	
}
