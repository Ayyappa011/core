package com.ayyappa.dto.implementation;

import com.ayyappa.dto.ProductDTO;

@FunctionalInterface
public interface ProductDTOfinder {

	public ProductDTO match(ProductDTO iterator1, ProductDTO dtoCompere);
}
