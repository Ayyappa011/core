package com.ayyappa.dp.dao;

import com.ayyappa.dto.MovieDTO;

public class MovieDAO {
	
	private MovieDTO[] moviedto = new MovieDTO[7];
	
	
	private int count=0;
	
	public void savemovie(MovieDTO dto) {
		System.out.println("Here Movie is saved");
		if (dto!=null && count<moviedto.length) {
			this.moviedto[count++]=dto;
			System.out.println("invokod :".concat(dto.getName()));
		} else {
			System.err.println("Movie name is not found");

		}
	
	}
	public void save(MovieDTO dto,int index) {
		if(index<this.moviedto.length && dto!=null) {
			this.moviedto[index]=dto;
			System.out.println("Movie names overloding methed :".concat(String.valueOf(index)));
		}else {
			System.out.println("Movie names are pointing to the null");
		}
	}
	public void holding(String name) {
		System.out.println("Movie name index:".concat(String.valueOf(name)));
	}
	public MovieDTO[] getDTO() {
		retrun
	}
}
