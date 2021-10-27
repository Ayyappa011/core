package com.ayyappa.dp;

import com.ayyappa.dp.dao.MilkcanDAO;
import com.ayyappa.dto.MilkcanDTO;

public class MilkcanTester {

	public static void main(String[] args) {
		
		
		MilkcanDTO milkdto = new MilkcanDTO(20,"tank","GOD",30);
		MilkcanDTO milkdto1 = new MilkcanDTO(20,"tank","bad",30); 
		MilkcanDTO milkdto2 = new MilkcanDTO(20,"tank","GOD",30);
		MilkcanDTO milkdto3 = new MilkcanDTO(20,"tank","bad",30);
		
		MilkcanDAO milkdao = new MilkcanDAO();
		milkdao.savemilkcan(milkdto3);
		milkdao.savemilkcan(milkdto1);
		milkdao.savemilkcan(milkdto2);
		
		milkdao.save(milkdto3, 1);
		milkdao.save(milkdto1, 0);
		
		milkdao.holding("bad");
		
		
		MilkcanDTO[] ref=milkdao.getDTO();
		for (int i = 0; i < ref.length; i++) {
			MilkcanDTO fig = ref[i];
			System.out.println("'''''''''''''''''''''");
			if (fig != null) {
				System.out.println(fig.getQuantity());
				System.out.println(fig.getShape());
				System.out.println(fig.getPrice());
				System.out.println(fig.getQuantity());
				
			}

		}
	}
	

}
