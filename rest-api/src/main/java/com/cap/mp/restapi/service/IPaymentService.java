package com.cap.mp.restapi.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.mp.restapi.model.PaymentRequest;

@Component
public interface IPaymentService {
	
	
	PaymentRequest savePayement(PaymentRequest st);
	
	PaymentRequest getPaymentByID(Long paymentID);
	
	Long deletePayementByempID(Long id);
	
	List<PaymentRequest> getAllpayment();

}
