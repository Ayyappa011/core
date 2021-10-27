package com.ayyappa.dp.dao;

import com.ayyappa.dto.MilkcanDTO;

public class MilkcanDAO {

	private MilkcanDTO[] milkdto = new MilkcanDTO[6];
	private int count = 0;

	public void savemilkcan(MilkcanDTO dto) {
		System.out.println("Here milkcan is saved");
		if (dto != null && count < milkdto.length) {
			this.milkdto[count++] = dto;
			System.out.println("invokod :".concat(dto.getShape()));
		} else {
			System.err.println("milkcan  is not found");

		}

	}

	public void save(MilkcanDTO dto, int index) {
		if (index < this.milkdto.length && dto != null) {
			this.milkdto[index] = dto;
			System.out.println("milkcan is overloding methed :".concat(String.valueOf(index)));
		} else {
			System.out.println("milkcan are pointing to the null");
		}
	}

	public void holding(String name) {
		System.out.println("milkcan index:".concat(String.valueOf(name)));
	}

	public MilkcanDTO[] getDTO() {
		return milkdto;

	}

}
