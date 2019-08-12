package com.cap.mp.restapi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class PaymentRespone {
	
	String status;
	
	LocalDate creationDate;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public PaymentRespone(String status, LocalDate creationDate) {
		super();
		this.status = status;
		this.creationDate = creationDate;
	}

	public PaymentRespone() {
		super();
	}
	
	

}
