package com.ayyappa.bird.dao;

import com.ayyappa.bird.BirdDTO;

public class BridDAOImplimentation implements BirdDAO {

	BirdDTO[] refdto = new BirdDTO[4];
	int adder = 0;

	@Override
	public BirdDTO saveID(BirdDTO dto) {
		System.out.println("invoked method saveBird Id's");
		if (dto != null) {
			refdto[adder++] = dto;
			if (dto instanceof BirdDTO) {
				BirdDTO refdto1 = (BirdDTO) dto;
				System.out.println("Get saved bird id's :".concat(String.valueOf(refdto1.getId())));

			} else {
				System.out.println("Did't save any bird id's here");
			}

		} else {
			System.out.println("ref pointing to the null");
		}
		return dto;

	}

	@Override
	public BirdDTO findAge(int age) {
		System.out.println("invoked method finding the age");
		if (refdto != null) {
			for (int i = 0; i < refdto.length; i++) {
				BirdDTO refdto1 = refdto[i];
				if (refdto1 != null) {
					int birdage = refdto1.getAge();
					System.out.println("Get the age of the bird :".concat(String.valueOf(birdage)));

					if (birdage == age) {
						System.out.println("Both birds age are equal");
					} else {
						System.out.println("birds age are not equal");
					}

				}
			}

		}
		return null;

	}

	@Override
	public void displayBridData() {
   if(refdto!=null) {
	   for (int k = 0; k < refdto.length; k++) {
		    BirdDTO dtos=refdto[k];
		    if(dtos!=null) {
		    	System.out.println("Bird id :".concat(dtos.getId()));
		    	System.out.println("Bird age :"+dtos.getAge());
		    	System.out.println("Bird Breed:".concat(dtos.getBreed()));
		    	System.out.println("Bird origin :".concat(dtos.getOrigin()));
		    	System.out.println("Bird fly :"+dtos.isCanFly());
		    }
	}
   }

	}

}
