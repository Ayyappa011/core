package com.ayyappa.bird.dao;

import com.ayyappa.bird.BirdDTO;

public interface BirdDAO {

	BirdDTO saveID(BirdDTO dto);

	BirdDTO findAge(int age);

	void displayBridData();

	

}
