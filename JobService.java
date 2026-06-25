package com.example.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JobApp.Repo.JobRepo;
import com.example.JobApp.model.JobPost;

@Service
public class JobService {
	@Autowired
	public JobRepo repo;
	
	public void addJob(JobPost jobPost) {
		repo.addJob(jobPost);
	}
	
	public List<JobPost> getAllJobs(){
		return repo.getAllJobs();
	}
}
