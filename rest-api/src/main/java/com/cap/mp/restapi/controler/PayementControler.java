package com.cap.mp.restapi.controler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cap.mp.restapi.exception.NoSuchResourceFoundException;
import com.cap.mp.restapi.model.PaymentRequest;
import com.cap.mp.restapi.model.PaymentRespone;
import com.cap.mp.restapi.service.IPaymentService;

@RestController
public class PayementControler {

	@Autowired
	IPaymentService service;

	@RequestMapping(value = "/payment", method = RequestMethod.POST, consumes="application/json")
	public ResponseEntity<PaymentRespone> createEmployee(@RequestBody @Valid PaymentRequest payment) {

		ResponseEntity<PaymentRespone> rsp = null;

		PaymentRespone pres = null;

		PaymentRequest pr = service.savePayement(payment);

		if (pr != null && pr.getPaymentID() != null) {

			pres = new PaymentRespone("Success", LocalDate.now());
		} else {

			pres = new PaymentRespone("Failure", LocalDate.now());

		}

		rsp = new ResponseEntity<PaymentRespone>(pres, HttpStatus.OK);

		return rsp;
	}

	@RequestMapping(value = "/payment/{paymentID}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public PaymentRequest getPaymentByempId(@PathVariable Long paymentID) {

		PaymentRequest payment = service.getPaymentByID(paymentID);

		if (payment == null) {

			throw new NoSuchResourceFoundException("Resoursce not found");
		}

		return payment;
	}

	@RequestMapping(value = "/payment/{paymentID}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteEmployeeByEmpid(@PathVariable Long paymentID) {

		Long st = service.deletePayementByempID(paymentID);

		if (st == 0) {

			throw new NoSuchResourceFoundException("Resoursce not found to delete");
		}
	}

	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ArrayList<PaymentRequest> getAllEmployes() {

		List<PaymentRequest> lisEmp = service.getAllpayment();

		if (lisEmp == null) {

			throw new NoSuchResourceFoundException("Employee list is empty");
		}

		return (ArrayList<PaymentRequest>) lisEmp;
	}

	@RequestMapping(value = "/payment", method = RequestMethod.PUT, consumes="application/json")
	public ResponseEntity<PaymentRespone> updateEmployee(@RequestBody @Valid PaymentRequest payment) {

		ResponseEntity<PaymentRespone> rsp = null;
		PaymentRespone pres = null;

		PaymentRequest pr = service.savePayement(payment);

		if (pr != null && pr.getPaymentID() != null) {

			pres = new PaymentRespone("Success", LocalDate.now());
		} else {

			pres = new PaymentRespone("Failure", LocalDate.now());

		}

		rsp = new ResponseEntity<PaymentRespone>(pres, HttpStatus.OK);

		return rsp;
	}

}
