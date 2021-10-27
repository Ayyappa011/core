package com.ayyappa.dto;

public class CameraDAO<cameraDTO> {
	
	private CameraDTO[] dto=new CameraDTO[5];
	
	private  int joker=0;
	
	public void saveCamera(CameraDTO mak) {
		if (joker<this.dto.length) {
			this.dto[joker++]=mak;
			
			System.out.println("Camera working is god  ");
		} else {
			System.err.println("Camera working is very bad");

		}
	}
	public void deleteCamer(int index) {
		if (index <this.dto.length ) {
			this.dto[index]=null;
			System.out.println("Change the Camera pixle");
		} else {
          System.out.println("No need to change the camera pixle");     
		}
	}
	public void updateCamera(int mad, CameraDTO newone) {
		if (mad<this.dto.length &&this.dto.length>=0) {
			this.dto[mad]=newone;
		}
	}
	
	public void displayCamera() {
		for (int i = 0; i < dto.length; i++) {
			CameraDTO ref =  dto[i];
			if (ref!=null) {
				System.out.println(ref.getBatterycapacity());
				System.out.println(ref.getCompany());
				System.out.println(ref.getCost());
				System.out.println(ref.getPixle());
				System.out.println(ref.getType());
				System.out.println(ref.getWeight());
			}
			else {
				System.err.println("ref is null at index".concat(String.valueOf(i)));
			}
			
		}
	}
	
	public CameraDTO[] getDto() {
		return dto;
		
	}

}
