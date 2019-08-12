package com.cap.mp.restapi.repositary;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.mp.restapi.model.PaymentRequest;

@Repository("paymentRepository")
public interface PaymentRepository extends JpaRepository<PaymentRequest, Long>{
	
	@Transactional
	Long deleteBypaymentID(Long Id);

}
