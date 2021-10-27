package com.ayyappa.dp.dao;

import com.ayyappa.dto.CameraDAO;
import com.ayyappa.dto.CameraDTO;

public class CameraOperation {

	public static void main(String[] args) {
		
		CameraDTO camera= new CameraDTO();
		camera.setCompany("Sony");
		camera.setType("EE");
		camera.setPixle(64.5F);
		camera.setCost(89225);
		camera.setBatterycapacity(5);
		camera.setWeight(2);
		
		CameraDTO cameradto1 = new CameraDTO("Sony","EE",78.2F,53333,50,20);
		CameraDTO cameradto2 = new CameraDTO("Sony","EC",65.4F,7899,78,45);
		
        CameraDAO cameradao = new CameraDAO();
        cameradao.saveCamera(cameradto1);
        cameradao.saveCamera(cameradto2);

        cameradao.deleteCamer(1);
        cameradao.updateCamera(2, cameradto1);

        CameraDTO[] ref = cameradao.getDto();
        for (int C = 0; C < ref.length; C++) {
			CameraDTO fig = ref[C];
			System.out.println(fig.getBatterycapacity());
			System.out.println(fig.getCompany());
			System.out.println(fig.getCost());
			System.out.println(fig.getPixle());
			System.out.println(fig.getType());
			System.out.println(fig.getWeight());
		}
	}

}
