package com.ayyappa.card.tester;

import com.ayyappa.cart.dto.CartDTO;

public class CartTester {

	public static void main(String[] args) {

		CartDTO refcart = new CartDTO("AyyappaReddy", 10, 15000, "TV");

		com.ayyappa.cart.dao.ArrayAmazonCartDAO refCartDto = new com.ayyappa.cart.dao.ArrayAmazonCartDAO();

		com.ayyappa.cart.dao.AmazonBusiness refAB = new com.ayyappa.cart.dao.AmazonBusiness(refCartDto);

		refAB.saveCart(refcart);
		refAB.findCartByName(refcart);
		refAB.displayCart();

	}

}
