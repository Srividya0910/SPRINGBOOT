package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BakeryModel;
import com.example.demo.service.BakeryService;

@RestController
public class BakeryController {
	@Autowired
	BakeryService bkService;
	
	@GetMapping(value="fetch")
	public List<BakeryModel> getAll()
	{
		List<BakeryModel> bkList=bkService.getAll();
		return bkList;
	}
	@PostMapping(value="/saves")
	public BakeryModel save(@RequestBody BakeryModel s)
	{
		return bkService.save(s); 
	}
	
	@PutMapping(value="/update")
	public BakeryModel update(@RequestBody BakeryModel s)
	{
		return bkService.save(s); 
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void delete(@PathVariable("id") int id)
	{
		bkService.get(id);
	}
	@GetMapping(value="/get/{id}")
	public BakeryModel get(@PathVariable("id") int id)
	{
		return bkService.get(id);
	}
}
