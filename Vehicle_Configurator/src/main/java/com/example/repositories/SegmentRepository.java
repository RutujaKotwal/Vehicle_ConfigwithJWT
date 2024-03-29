package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Segment_master;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface SegmentRepository  extends JpaRepository<Segment_master,Integer>{
	
}