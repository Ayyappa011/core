package com.ayyappa.vaccin.state.implementation;

import com.ayyappa.vaccin.state.EmployeeDTO;
import com.ayyappa.vaccin.state.OfficeVaccinDAO;

public class OfficeVaccinDetailsDAO implements OfficeVaccinDAO {

	@Override
	public void checkallDeatils(EmployeeDTO details) {
		if (details != null) {
			System.out.println("Check all employee  the  details ");
			if (details instanceof EmployeeDTO) {
				EmployeeDTO gateChecking = (EmployeeDTO) details;
				if (gateChecking != null) {
					System.out.println("Employee Name :".concat(String.valueOf(details.getName())));
					System.out.println("Vaccin Name :".concat(String.valueOf(details.getVaccinName())));
				} else {
					System.out.println(" no vaccins here come tmer ");
				}

			}

		}
	}

	@Override
	public void secondDose(EmployeeDTO dose) {
		if (dose != null) {
			System.out.println("After first dose done than call next  second dose");
			EmployeeDTO seconddose = (EmployeeDTO) dose;
			if (seconddose != null) {
				System.out.println("After one month cpmpleted than show the  second dose date :"
						.concat(String.valueOf(dose.getSecondDose())));
			}

		}

	}

}
