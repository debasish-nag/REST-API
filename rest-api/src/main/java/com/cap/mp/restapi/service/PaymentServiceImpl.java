package com.cap.mp.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cap.mp.restapi.model.PaymentRequest;
import com.cap.mp.restapi.repositary.PaymentRepository;


@Component
public class PaymentServiceImpl implements IPaymentService {
	
	
	@Autowired
	private PaymentRepository pRepo;

	@Override
	public PaymentRequest savePayement(PaymentRequest st) {
		// TODO Auto-generated method stub
		return pRepo.save(st);
	}

	@Override
	public PaymentRequest getPaymentByID(Long paymentID) {
		// TODO Auto-generated method stub
		Optional<PaymentRequest> optional = pRepo.findById(paymentID);

		return optional.isPresent() ? optional.get() : null;
	}

	@Override
	public Long deletePayementByempID(Long id) {
		// TODO Auto-generated method stub
		return pRepo.deleteBypaymentID(id);
	}

	@Override
	public List<PaymentRequest> getAllpayment() {
		// TODO Auto-generated method stub
		return pRepo.findAll();
	}

}
