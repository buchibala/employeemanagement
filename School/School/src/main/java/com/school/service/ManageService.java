package com.school.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.school.Exception.SchoolException;
import com.school.model.Message;
import com.school.model.Payment;
import com.school.model.Progress;
import com.school.model.Subject;

@Service
public class ManageService {

	public Payment addPayment(Payment payment) {
		// TODO Auto-generated method stub
		Message msg=new Message();
		msg.setMsgcode("001");
		msg.setMessage("Total Due for the student is "+payment.getDues());
		payment.setMsg(msg);
		return payment;
	}

	public Progress addProgress(Progress progress) {
		// TODO Auto-generated method stub
		List<Subject> subs=progress.getSubjects();
		int countGrd=0;
		for(Subject sub:subs) {
			if(sub.getGrade().equals("A")){
				countGrd++;
			}
		}
		if(countGrd >=3) {
			progress.setOverAllGrade("A");
		}else {
			progress.setOverAllGrade("B");
		}
		return progress;
	}

	public Payment getStudentPayment(Payment payment) {
		// TODO Auto-generated method stub
		
		Date date=payment.getDueDate(); 
		int dueDate=date.getDate()+30;
		date.setDate(dueDate);
		
		if(date.compareTo(new Date()) <= 0) {
			/*
			 * Message msg=new Message(); msg.setMsgcode("787");
			 * msg.setMessage("Payment Pending"); payment.setMsg(msg);
			 */
			try {
				throw new SchoolException("Payment Pending");
			}
			catch(Exception e) {
				Message msg=new Message(); msg.setMsgcode("787");
				msg.setMessage("Payment Pending"); payment.setMsg(msg);
				 
			}
		}
		System.out.println(payment.getFeesAmount());
		return payment;
	}
}
