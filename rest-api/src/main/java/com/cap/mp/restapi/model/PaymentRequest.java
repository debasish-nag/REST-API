package com.cap.mp.restapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class PaymentRequest {
	
	@Id
	@GeneratedValue
	Long paymentID;
	
	@NotNull
	String marchenCode;
	
	@NotNull
	String payementType;
	
	@NotNull
	String paymentMethod;
	
	@NotNull
	Long transcationAmount;

	public Long getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(Long paymentID) {
		this.paymentID = paymentID;
	}

	public String getMarchenCode() {
		return marchenCode;
	}

	public void setMarchenCode(String marchenCode) {
		this.marchenCode = marchenCode;
	}

	public String getPayementType() {
		return payementType;
	}

	public void setPayementType(String payementType) {
		this.payementType = payementType;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Long getTranscationAmount() {
		return transcationAmount;
	}

	public void setTranscationAmount(Long transcationAmount) {
		this.transcationAmount = transcationAmount;
	}
	
	


}
