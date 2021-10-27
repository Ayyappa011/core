package com.ayyappa.dp;


import com.ayyappa.dp.dao.ClubDAO;
import com.ayyappa.dto.ClubDTO;

public class ClubOperation {

	public static void main(String[] args) {
		ClubDTO clubdto = new ClubDTO();
		clubdto.setNoOfPeople("pink");
		clubdto.setNoOfBottel(782);
		clubdto.setEntryPrice(859);
		clubdto.setRating(4);

		ClubDTO clubdto1 = new ClubDTO("RED",78,3,799);
		ClubDTO clubdto2 = new ClubDTO("RED",78,3,799);
		ClubDTO clubdto3 = new ClubDTO("RED",78,3,799);

		ClubDAO bucketdao = new ClubDAO();
		bucketdao.saveClub(clubdto3);
		bucketdao.saveClub(clubdto2);

		bucketdao.deleteClub(2);
		bucketdao.updateClub(2, clubdto1);

		ClubDTO[] ref = bucketdao.getDto();
		for (int i = 0; i < ref.length; i++) {
			ClubDTO gg = ref[i];
			System.out.println(gg.getNoOfPeople());
			System.out.println(gg.getNoOfBottel());
			System.out.println(gg.getEntryPrice());
			System.out.println(gg.getRating());
			System.out.println("___________________________________________");
		}


	}

}
