package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BakeryModel;


@Repository
public interface BakeryRepository extends JpaRepository<BakeryModel,Integer>
{

}