/**
 *@PROBLEM_STATEMENT : UC
 *@author Karthik M C
 *@Date 26-Mar-2022
 */
package com.sql.jdbs;

import java.util.List;

public class EmployeePayrollService {
	private List<EmployeePayrollData> employeePayrollList;

	public enum IOSevice {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	public List<EmployeePayrollData> readEmployeePayrollData(IOSevice ioSevice) {
		if (ioSevice.equals(IOSevice.DB_IO))
			this.employeePayrollList = new EmployeePayrollDBService().readData();
		return employeePayrollList;
	}

}
