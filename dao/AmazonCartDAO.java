package com.ayyappa.cart.dao;

import com.ayyappa.cart.dto.CartDTO;

public interface AmazonCartDAO {

	boolean save(CartDTO cartDTO);

	CartDTO findByName(String name);

	void displayAllCartDeatils();

}
