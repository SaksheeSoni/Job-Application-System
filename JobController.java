package com.example.JobApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.service.JobService;

@Controller
public class JobController {
	@Autowired
	public JobService service;
	
	@GetMapping({"/", "home"})
	public String home() {
		System.out.println("home called");
		return "home";
	}
	
	@GetMapping("addjob")
	public String addJob() {
		return "addjob";
	}
	
	@PostMapping("handleForm")
	public String handleForm(JobPost jobPost) {
		service.addJob(jobPost);
		return "success";
	}
	
	@GetMapping("viewalljobs")
	public String viewJobs(Model m) {
		List<JobPost> jobs = service.getAllJobs();
		m.addAttribute("jobPosts", jobs);
		return "viewalljobs";
		
	}
}





