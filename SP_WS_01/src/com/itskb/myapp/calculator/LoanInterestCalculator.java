package com.itskb.myapp.calculator;

import org.springframework.stereotype.Component;

@Component("loanCalcator")
public class LoanInterestCalculator implements InterestCalculator { // 대출 이자 계산
	
	private static final double RATE = 0.0525;
	
	@Override
	public double calculate(int amount) {
		System.out.println("LoanInterestCalculator - calculate()");
		return amount * RATE;
	}
}
