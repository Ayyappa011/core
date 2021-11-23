package com.ayyappa.vaccin.association;

import com.ayyappa.vaccin.state.EmployeeDTO;
import com.ayyappa.vaccin.state.OfficeVaccinDAO;
import com.ayyappa.vaccin.state.StateVaccinDAO;
import com.ayyappa.vaccin.state.implementation.OfficeVaccinDetailsDAO;
import com.ayyappa.vaccin.state.implementation.StateVaccinDetailsDAO;

public class EmployeeTester {

	public static void main(String[] args) {

		EmployeeDTO employeeDetails = new EmployeeDTO("Ayyappa Reddy", "Andra", "COVAXIN", "15-12-21", "18-12-21",
				"18-01-21");

		StateVaccinDAO stateDetails = new StateVaccinDetailsDAO();

		OfficeVaccinDAO officeDetails = new OfficeVaccinDetailsDAO();
		officeDetails.checkallDeatils(employeeDetails);
		stateDetails.entry(employeeDetails);
		stateDetails.vaccinRegistration(employeeDetails);
		stateDetails.state(employeeDetails);
		officeDetails.secondDose(employeeDetails);

	}

}
