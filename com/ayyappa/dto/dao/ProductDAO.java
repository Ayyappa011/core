package com.ayyappa.dto.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ayyappa.dto.ProductDTO;
import com.ayyappa.dto.implementation.ProductDTOfinder;

public class ProductDAO {

	private List<ProductDTO> dtos = new ArrayList<ProductDTO>();

	public ProductDAO() {

		this.dtos.add(new ProductDTO("50UP7500PTZ", 48999, "LG 126 cm", "LG"));
		this.dtos.add(new ProductDTO("43LM5650PTA", 33499, "LG 108 cm", "LG"));
		this.dtos.add(new ProductDTO("MLL93HN/A", 129900, "APPLEiPhone 13Pro Max", "Iphone"));
		this.dtos.add(new ProductDTO("MLPF3HN/A", 79900, "APPLEiPhone 13", "iPhone"));
		this.dtos.add(new ProductDTO("Clix 26T SS", 21499, "Hero Lectro", "Hero"));
		this.dtos.add(new ProductDTO("Kinza 27.5T SS", 22499, "Hero Lectro", "Hero"));
		this.dtos.add(new ProductDTO("A26- 30-10 Contractor", 656, " Contractor", "ABB"));
		this.dtos.add(new ProductDTO("A16-30-10", 1200, "Contractor", "ABB"));

	}

	public ProductDTO find(ProductDTOfinder finder, ProductDTO dtoCompere) {
		Iterator<ProductDTO> iterator = this.dtos.iterator();
		while (iterator.hasNext()) {
			ProductDTO iterator1 = iterator.next();
			if (finder.match(iterator1, dtoCompere) != null)
				return iterator1;
		}
		return null;

	}

}
