package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BakeryRepository;
import com.example.demo.model.BakeryModel;

@Service
public class BakeryService {
	@Autowired
	BakeryRepository bkRepository;
	public List<BakeryModel> getAll()
	{
		List<BakeryModel> bkList=bkRepository.findAll();
		return bkList;
	}
	public BakeryModel save(BakeryModel s)
	{
		BakeryModel obj=bkRepository.save(s);
		return obj;
		
	}
	public BakeryModel update(BakeryModel s)
	{
		BakeryModel obj=bkRepository.save(s);
		return obj;
		//return studRepository.save(s);
	}
	public void delete(int id)
	{
		bkRepository.deleteById(id);
	}
	public BakeryModel get(int id)
	{
		BakeryModel s=bkRepository.findById(id).get();
		return s;
	}
}
