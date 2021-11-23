package com.ayyappa.vaccin.state.implementation;

import com.ayyappa.vaccin.state.EmployeeDTO;
import com.ayyappa.vaccin.state.StateVaccinDAO;

public class StateVaccinDetailsDAO implements StateVaccinDAO {

	@Override
	public void state(EmployeeDTO employee) {
		if(employee!=null) {
			System.out.println("To get the employee from state");
			if(employee instanceof EmployeeDTO) {
				EmployeeDTO employeeDetaiols=(EmployeeDTO)employee;
				if(employeeDetaiols!=null) {
					System.out.println("Employee Name :".concat(String.valueOf(employee.getFirstDose())));
				}else {
					System.err.println("NO employee Name here");
				}
	
				
			}
		}else {
			System.out.println("No Employee details");
		}
		
	}
	@Override
	public void vaccinRegistration(EmployeeDTO reg) {
		if(reg!=null) {
			EmployeeDTO register=(EmployeeDTO)reg;
			if(register!=null) {
				System.out.println("Register for vaccination :".concat(String.valueOf(reg.getRegVaccination())));
			}
		}
		
	}

	@Override
	public void entry(EmployeeDTO dose) {
		if(dose!=null) {
			System.out.println("Ofiice gate entry");
			if(dose instanceof EmployeeDTO) {
				EmployeeDTO firstdose=(EmployeeDTO)dose;
				
				if(firstdose!=null) {
					System.out.println("First dose completed in the state :".concat(String.valueOf(dose.getStateName())));
					
					
				}else {
					System.out.println("if dose not completed than allow into the office gate");
				}
			}
		 
		}else {
			System.err.println("if dose vaccination is done than in the office");
		}
		
	}

	
}
