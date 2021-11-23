package com.ayyappa.vaccin.state;

public interface StateVaccinDAO {

	void state(EmployeeDTO employee);

	void vaccinRegistration(EmployeeDTO reg);

	void entry(EmployeeDTO dose);
}
