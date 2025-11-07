package com.kgl.Gaming_Club.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgl.Gaming_Club.Dto.DoRechargeDto;
import com.kgl.Gaming_Club.Repository.CollectionRepository;
import com.kgl.Gaming_Club.Repository.MemberRepository;
import com.kgl.Gaming_Club.Repository.RechargeRepository;
import com.kgl.Gaming_Club.entiity.Collection;
import com.kgl.Gaming_Club.entiity.Member;
import com.kgl.Gaming_Club.entiity.Recharge;

@Service
public class RechargeService {
	@Autowired private RechargeRepository rechargeRepo;
	@Autowired private MemberRepository memberRepo;
	@Autowired private CollectionRepository collectionRepo;
	
	public Recharge doRecharge(DoRechargeDto rechargeDto) {
		Member member = memberRepo.findById(rechargeDto.getMember_id()).get();
		
		member.setBalance(member.getBalance() + rechargeDto.getAmount());
		memberRepo.save(member);
		
		Recharge recharge = new Recharge();
		recharge.setDate_time(LocalDateTime.now());
		recharge.setMember(member);
		recharge.setAmount(rechargeDto.getAmount());
		rechargeRepo.save(recharge);
		
		Optional<Collection> optional = collectionRepo.findByDate(LocalDate.now());
		if(optional.isPresent()) {
			Collection collection = optional.get();
			collection.setAmount(collection.getAmount() + rechargeDto.getAmount());
			collectionRepo.save(collection);
		}else {
			Collection collection = new Collection();
			collection.setDate(LocalDate.now());
			collection.setAmount(rechargeDto.getAmount());
			collectionRepo.save(collection);
		}
		return recharge;
	}
}
