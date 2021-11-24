package com.ayyappa.bird.dao;

import com.ayyappa.bird.BirdDTO;

public class BirdAssociation {
	BirdDAO dao;

	public BirdAssociation(BirdDAO dao) {
		super();
		this.dao = dao;

	}

	public void canFly(BirdDTO dto) {
		if (dto != null) {
			BirdDTO dtos = dao.saveID(dto);

			System.out.println("if bird age more than one month it can fly :".concat(String.valueOf(dtos.getAge())));
		} else {
			System.err.println("if bird age not more than one month it can't fly");
		}

	}

	public void displayallDetails() {
		if (dao != null) {
			dao.displayBridData();
		}
	}
}
