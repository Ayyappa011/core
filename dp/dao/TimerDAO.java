package com.ayyappa.dp.dao;

import com.ayyappa.dto.TimerDTO;

public class TimerDAO {

	private TimerDTO[] timerdto = new TimerDTO[10];

	private int count = 0;

	public void savetimer(TimerDTO dto) {
		System.out.println("timer working is god");
		if (dto != null && count < timerdto.length) {
			this.timerdto[count++] = dto;
			System.out.println("invoked :".concat(dto.getBrand()));
		} else {
			System.err.println("Saved.......");

		}
	}

	public void savertimer(TimerDTO dto, int index) {
		System.out.println("Timer working is god");
		if (index < this.timerdto.length && dto != null) {
			this.timerdto[index] = dto;
			System.out.println("Timer overloading method :".concat(String.valueOf(index)));
		} else {
			System.err.println("timer overloading is null");
		}
	}

	public void occupied(String brand) {
		
		System.err.println("Index occupied......");
		System.out.println("index :".concat(String.valueOf(brand)));
	}
	
	public   TimerDTO[] getDTO() {
		return timerdto;
	}

}
