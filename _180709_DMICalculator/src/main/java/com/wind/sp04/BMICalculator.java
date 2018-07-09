package com.wind.sp04;

public class BMICalculator {
	
	private double over_weight;
	private double low_weight;
	private double normal;
	private double obesity;	
	
	public double getOver_weight() {
		return over_weight;
	}
	public void setOver_weight(double over_weight) {
		this.over_weight = over_weight;
	}
	public double getLow_weight() {
		return low_weight;
	}
	public void setLow_weight(double low_weight) {
		this.low_weight = low_weight;
	}
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}

	public void bmi_calculator(double weight, double height) {
		double h = height * 0.01;
		double result = weight / (h*h);
		
		System.out.println("BMI지수 : " + (double)result);
		
		if(result>obesity) {
			System.out.println("비만... 10일 금식");
		}else if(result>over_weight) {
			System.out.println("과체중... 주의,3일 금식");
		}else if(result>normal) {
			System.out.println("정상... 잘 관리 하셨군요.");
		}else {
			System.out.println("저체중... 많이 드세요.");
		}
	}	
}
