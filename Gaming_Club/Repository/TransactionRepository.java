package com.kgl.Gaming_Club.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgl.Gaming_Club.entiity.Member;
import com.kgl.Gaming_Club.entiity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer>{
	List<Transaction> findByMember(Member member_id);

}
