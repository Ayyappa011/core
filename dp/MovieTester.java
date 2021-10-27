package com.ayyappa.dp;

import com.ayyappa.dp.dao.MovieDAO;

import com.ayyappa.dto.MovieDTO;


public class MovieTester {

	public static void main(String[] args) {

		MovieDTO moviedto = new MovieDTO("TRUE LOVE END", "VANDU", "RAKESH", 4, "MALLI");
		MovieDTO moviedto1 = new MovieDTO("KICK", "VANDU", "RAKESH", 4, "MALLI");
		MovieDTO moviedto2 = new MovieDTO("SOFTWARE DEVELPOER", "VANDU", "RAKESH", 4, "MALLI");

		MovieDAO moviedao = new MovieDAO();
		moviedao.savemovie(moviedto2);
		moviedao.savemovie(moviedto1);
		moviedao.savemovie(moviedto);

		moviedao.save(moviedto2, 0);
		moviedao.save(moviedto1, 2);

		MovieDTO[] ref = moviedao.getDTO();
		for (int i = 0; i < ref.length; i++) {
			MovieDTO fig = ref[i];
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			if (fig != null) {
				System.out.println(fig.getName());
				System.out.println(fig.getDirector());
				System.out.println(fig.getActor());
				System.out.println(fig.getRatings());
				System.out.println(fig.getProducer());
			}

		}

	}

}
