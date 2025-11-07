package com.kgl.Gaming_Club.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgl.Gaming_Club.Dto.MembershipDto;
import com.kgl.Gaming_Club.entiity.Member;
import com.kgl.Gaming_Club.services.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {
	@Autowired
	private MemberService memberRepo;
	
	@PostMapping("/save")
	public Member create(@RequestBody MembershipDto member) {
		return memberRepo.createMembership(member);
	}
	
	@GetMapping("/get")
	public List<Member> getMembers(){
		return memberRepo.getMembers();
	}

	@GetMapping("/search/{phone}")
	public Map<String, Object> search(@PathVariable String phone){
		return memberRepo.searchMember(phone);
	}
}
