package com.ayyappa.dp;

import com.ayyappa.dp.dao.BucketDAO;
import com.ayyappa.dto.BucketDTO;

public class BucketOperation {

	public static void main(String[] args) {

		BucketDTO bucketdto = new BucketDTO();
		bucketdto.setColor("pink");
		bucketdto.setCompany("CM");
		bucketdto.setPrice(200f);
		bucketdto.setSize(52);

		BucketDTO bucketdto1 = new BucketDTO("red", 50, 45.2F, "CMR");
		BucketDTO bucketdto2 = new BucketDTO("block", 50, 45.2F, "CMR");
		BucketDTO bucketdto3 = new BucketDTO("blue", 50, 45.2F, "CMR");

		BucketDAO bucketdao = new BucketDAO();
		bucketdao.saveBucket(bucketdto3);
		bucketdao.saveBucket(bucketdto2);

		bucketdao.deleteBucket(2);
		bucketdao.updateBucket(2, bucketdto1);

		BucketDTO[] ref = bucketdao.getDto();
		for (int i = 0; i < ref.length; i++) {
			BucketDTO gg = ref[i];
			System.out.println(gg.getColor());
			System.out.println(gg.getCompany());
			System.out.println(gg.getPrice());
			System.out.println(gg.getSize());
			System.out.println("___________________________________________");
		}

	}

}
