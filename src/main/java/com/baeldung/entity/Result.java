package com.baeldung.entity;

import java.util.Date;

public class Result {

    private int rollNumber;
    private int numbers;
    private Date date;

    public Result() {
    }
    
    

	public Result(int rollNumber, int numbers, Date date) {
		super();
		this.rollNumber = rollNumber;
		this.numbers = numbers;
		this.date = date;
	}



	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}