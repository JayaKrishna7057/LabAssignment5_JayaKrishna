/**
  Author : Jayakrishna
  date : 2/11/2020
  desc : An employeeException class is created
  */

package com.cg.eis.exception;


import java.util.*;
public class EmployeeException {
    private  float salary;

    /**
     * to get the salary of the employee
     * @return salary
     */

	public float getSalary() {
		return salary;
	}
	/**
	 * to set the salary
	 * @param salary
	 */

	public void setSalary(float salary) {
		this.salary = salary;
	}
}
