package com.ayyappa.dto.tester;

import com.ayyappa.dto.ProductDTO;
import com.ayyappa.dto.dao.ProductDAO;

public class ProductTester {

	public static void main(String[] args) {

		ProductDAO daos = new ProductDAO();
		ProductDTO dtoCompare = new ProductDTO("Clix 26T SS", 21499, "Hero Lectro", "Hero");

		ProductDTO found = daos.find((p1, p2) -> {
			if (p1.getName().equals(p2.getName()) && p1.getPrice() == p2.getPrice()) {
				return p1;
			}
			return null;
		}, dtoCompare);
		System.out.println(found);
	}

}
