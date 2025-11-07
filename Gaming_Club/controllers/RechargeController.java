package com.kgl.Gaming_Club.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgl.Gaming_Club.Dto.DoRechargeDto;
import com.kgl.Gaming_Club.entiity.Recharge;
import com.kgl.Gaming_Club.services.RechargeService;

@RestController
@RequestMapping("/recharges")
public class RechargeController {
	@Autowired
	private RechargeService rechargeService;
	
	@PostMapping()
	public Recharge doRecharge(@RequestBody DoRechargeDto recharge) {
		return rechargeService.doRecharge(recharge);	
	}
}
