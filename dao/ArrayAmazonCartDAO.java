package com.ayyappa.cart.dao;

import com.ayyappa.cart.dto.CartDTO;

public class ArrayAmazonCartDAO implements AmazonCartDAO {

	private CartDTO[] dtos = new CartDTO[2];
	int counter = 0;

	@Override
	public boolean save(CartDTO cartDTO) {
		System.out.println("invoked save method");
		if (cartDTO != null && counter < dtos.length) {
			dtos[counter++] = cartDTO;
			return true;
		}
		return false;
	}

	@Override
	public CartDTO findByName(String name) {
		System.out.println("invoked findByName");
		if (name != null) {
			for (int k = 0; k < dtos.length; k++) {
				CartDTO dtoRef = dtos[k];
				if (dtoRef != null) {

					String ref = dtoRef.getName();

					if (name.equalsIgnoreCase(ref)) {
						return dtoRef;
					}

				} else {
					System.out.println("null reference at index ".concat(String.valueOf(k)));
				}
			}
		}
		return null;
	}

	@Override
	public void displayAllCartDeatils() {
		System.out.println("invoked displayAllCartDetails method");

		for (int k = 0; k < dtos.length; k++) {
			CartDTO dtoRef = dtos[k];
			if (dtoRef != null) {
				System.out.println(dtoRef.getName());
				System.out.println(dtoRef.getQuantity());
				System.out.println(dtoRef.getItem());
				System.out.println(dtoRef.getPrice());
			} else {
				System.out.println("null at the index ".concat(String.valueOf(k)));
			}
		}

	}

}