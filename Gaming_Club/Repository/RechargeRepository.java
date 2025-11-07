package com.kgl.Gaming_Club.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgl.Gaming_Club.entiity.Member;
import com.kgl.Gaming_Club.entiity.Recharge;

@Repository
public interface RechargeRepository extends JpaRepository<Recharge,Integer> {
	List<Recharge> findByMember(Member member_id);
}
