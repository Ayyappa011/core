package com.ayyappa.dp;

import com.ayyappa.dp.dao.DressCodeDAO;
import com.ayyappa.dto.DressCodeDTO;

public class DressCodeOperation {

	public static void main(String[] args) {

		DressCodeDTO dresscode = new DressCodeDTO();
		dresscode.setSize(20);
		dresscode.setMaterail("cotten");
		dresscode.setPrice(752.5F);
		dresscode.setgender("male");
		dresscode.setColor("Red");
		DressCodeDTO dresscode2 = new DressCodeDTO(60, "cotten", 455.2F, "male", "pink");
		DressCodeDTO dresscode4 = new DressCodeDTO(60, "cotten", 455.2F, "male", "yellow");

		DressCodeDAO dresscodedao = new DressCodeDAO();
		dresscodedao.saveDressCode(dresscode4);
		dresscodedao.saveDressCode(dresscode2);

		dresscodedao.deleteDressCode(1);
		dresscodedao.updateDressCode(2, dresscode2);

		DressCodeDTO[] mref = dresscodedao.getDto();

		for (int i = 0; i < mref.length; i++) {
			DressCodeDTO fig = mref[i];
			if (fig != null) {
				System.out.println(fig.getSize());
				System.out.println(fig.getMaterail());
				System.out.println(fig.getPrice());
				System.out.println(fig.getgender());
				System.out.println(fig.getColor());
			}

		}

	}

}
