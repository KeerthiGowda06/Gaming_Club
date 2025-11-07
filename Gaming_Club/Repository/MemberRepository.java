package com.kgl.Gaming_Club.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgl.Gaming_Club.entiity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member,Integer>{
	Member findByPhone(String phone);
}
