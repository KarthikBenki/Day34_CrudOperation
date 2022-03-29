/**
 *@PROBLEM_STATEMENT : UC
 *@author Karthik M C
 *@Date 26-Mar-2022
 */
package com.sql.jdbs;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class EmployeePayrollServiceTest {
	@Test
	public void givenEmployeePayrollInDB_WhenRetrived_ShouldMatchEmployeeCount() {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollData(DB_IO);
		Assert.assertEquals(3, employeePayrollData.size());
	}

}
