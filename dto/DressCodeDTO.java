package com.ayyappa.dto;

public class DressCodeDTO {
		private int size;
		private String materail;
		private String color;
		private float price;
		private String gender;
		
		
		public DressCodeDTO() {
			
		}
		public DressCodeDTO(int size, String materail, float price, String color, String gender) {
			
			this.size = size;
			this.materail = materail;
			this.color = color;
			this.price = price;
		   this.gender = gender;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public String getMaterail() {
			return materail;
		}
		public void setMaterail(String materail) {
			this.materail = materail;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public String getgender() {
			return gender;
		}
		public void setgender(String gender) {
			 this.gender = gender;
		}
		
		

	}


