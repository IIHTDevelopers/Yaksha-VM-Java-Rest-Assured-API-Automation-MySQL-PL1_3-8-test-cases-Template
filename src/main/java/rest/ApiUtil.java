package rest;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.restassured.response.Response;

public class ApiUtil {

	private static final String BASE_URL = "https://healthapp.yaksha.com/api";

	/**
	 * @Test1 This method retrieves and verifies the list of departments.
	 * 
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - The API response includes HTTP status code, status
	 *         message, and a list of departments in the "Results" field, containing
	 *         details such as DepartmentId and DepartmentName.
	 */
	public CustomResponse getAllDepartments(String endpoint, Object body) {
		// write your code here

		Response response = null;
		int statusCode = 0;
		String status = "";

		List<Object> departmentIds = null;
		List<Object> departmentNames = null;

		return new CustomResponse(response, statusCode, status, departmentIds, departmentNames);
	}

	/**
	 * @Test2 This method retrieves and verifies the list of items.
	 * 
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 * @return CustomResponse - The API response includes HTTP status code, status
	 *         message, and a list of items in the "Results" field, containing
	 *         details such as ItemId and ItemName.
	 */
	public CustomResponse getAllItems(String endpoint, Object body) {
		// write your code here

		Response response = null;
		int statusCode = 0;
		String status = "";

		List<Object> itemIds = null;
		List<Object> itemNames = null;

		return new CustomResponse(response, statusCode, status, itemIds, itemNames);
	}

	/**
	 * @Test3 This method retrieves and verifies the incentive summary report.
	 * 
	 * @param URL  - The API endpoint to which the GET request is sent.
	 * @param body - Optional
	 * @return CustomResponse - The API response includes HTTP status code, status
	 *         message, and a list of incentive summary details in the "JsonData"
	 *         field, containing details such as PrescriberName, PrescriberId,
	 *         DocTotalAmount, TDSAmount, and NetPayableAmount.
	 * @throws JsonProcessingException
	 * @throws JsonMappingException
	 */
	public CustomResponse getIncentiveSummaryReport(String URL, Object body) {
		// write your code here

		Response response = null;
		int statusCode = 0;
		String status = "";

		List<Object> prescriberIds = null;
		List<Object> prescriberNames = null;
		List<Object> docTotalAmounts = null;
		List<Object> tdsAmounts = null;
		List<Object> netPayableAmounts = null;

		return new CustomResponse(response, statusCode, status, prescriberIds, prescriberNames, docTotalAmounts,
				tdsAmounts, netPayableAmounts);
	}

	/**
	 * @Test4 This method retrieves and verifies the incentive referral summary
	 *        report.
	 * 
	 * @param URL  - The API endpoint to which the GET request is sent.
	 * @param body - Optional
	 * @return CustomResponse - The API response includes HTTP status code, status
	 *         message, and a list of incentive referral summary details in the
	 *         "JsonData" field, containing details such as PrescriberName,
	 *         PrescriberId, DocTotalAmount, TDSAmount, and NetPayableAmount.
	 */
	public CustomResponse getIncReffSummReport(String URL, Object body) {
		// write your code here

		Response response = null;
		int statusCode = 0;
		String status = "";

		List<Object> prescriberNames = null;
		List<Object> prescriberIds = null;
		List<Object> docTotalAmounts = null;
		List<Object> tdsAmounts = null;
		List<Object> netPayableAmounts = null;

		return new CustomResponse(response, statusCode, status, prescriberNames, prescriberIds, docTotalAmounts,
				tdsAmounts, netPayableAmounts);
	}

	/**
	 * @Test5 This method fetches the hospital income incentive report for a
	 *        specified date range and service department from the API. It validates
	 *        the response status code, checks the "Status" field, and extracts
	 *        fields such as ServiceDepartmentId, ServiceDepartmentName, NetSales,
	 *        ReferralCommission, GrossIncome, OtherIncentive, and HospitalNetIncome
	 *        from the "Results" array.
	 *
	 * @param endpoint - The API endpoint for fetching the hospital income incentive
	 *                 report.
	 * @param body     - Optional request body (null in this case).
	 *
	 * @return CustomResponse - The API response includes the HTTP status code,
	 *         status message, and details such as ServiceDepartmentId,
	 *         ServiceDepartmentName, NetSales, ReferralCommission, GrossIncome,
	 *         OtherIncentive, and HospitalNetIncome in the "Results" field.
	 */
	public CustomResponse getHospIncIncReport(String endpoint, Object body) {
		// write your code here

		Response response = null;
		int statusCode = 0;
		String status = "";

		List<Object> serviceDepartmentIds = null;
		List<Object> serviceDepartmentNames = null;
		List<Object> netSales = null;
		List<Object> referralCommissions = null;
		List<Object> grossIncomes = null;
		List<Object> otherIncentives = null;
		List<Object> hospitalNetIncomes = null;

		return new CustomResponse(response, statusCode, status, serviceDepartmentIds, serviceDepartmentNames, netSales,
				referralCommissions, grossIncomes, otherIncentives, hospitalNetIncomes);
	}

	/**
	 * @Test6 This method fetches employee bill items for a specific employee from
	 *        the API. It validates the response status, checks the "Status" field,
	 *        and extracts fields like EmployeeIncentiveInfoId, EmployeeId,
	 *        FullName, TDSPercent, EmpTDSPercent, IsActive, and
	 *        EmployeeBillItemsMap for validation.
	 *
	 * @param endpoint - The API endpoint for fetching employee bill items.
	 * @param body     - Optional request body (null in this case).
	 *
	 * @return CustomResponse - The API response includes the HTTP status code,
	 *         status message, and details such as EmployeeIncentiveInfoId,
	 *         EmployeeId, FullName, TDSPercent, EmpTDSPercent, IsActive, and
	 *         EmployeeBillItemsMap in the "Results" field.
	 */
	public CustomResponse getEmpBillItem(String endpoint, Object body) {
		// write your code here

		Response response = null;
		int statusCode = 0;
		String status = "";

		Object employeeIncentiveInfoId = null;
		Object employeeId = null;
		Object fullName = null;
		Object tdsPercent = null;
		Object empTdsPercent = null;
		Object isActive = null;
		List<Map<String, Object>> employeeBillItemsMap = null;

		return new CustomResponse(response, statusCode, status, employeeIncentiveInfoId, employeeId, fullName,
				tdsPercent, empTdsPercent, isActive, employeeBillItemsMap);
	}

	/**
	 * @Test7 This method fetches inventory fiscal years from the API and validates
	 *        various fields. It checks the fiscal year ID, name, start date, end
	 *        date, and active status for each fiscal year.
	 *
	 * @param endpoint - The API endpoint for retrieving inventory fiscal years.
	 * @param body     - Optional request body (null in this case).
	 *
	 * @return CustomResponse - The API response includes the HTTP status code,
	 *         status message, and details such as FiscalYearId, FiscalYearName,
	 *         StartDate, EndDate, and IsActive in the "Results" field.
	 */
	public CustomResponse getInvntryFiscalYrs(String endpoint, Object body) {
		// write your code here

		Response response = null;
		int statusCode = 0;
		String status = "";

		List<Object> fiscalYearIds = null;
		List<Object> fiscalYearNames = null;
		List<Object> startDates = null;
		List<Object> endDates = null;
		List<Object> isActiveList = null;

		return new CustomResponse(response, statusCode, status, fiscalYearIds, fiscalYearNames, startDates, endDates,
				isActiveList);
	}

	/**
	 * @Test8 This method activates inventory by retrieving store information from
	 *        the API. It fetches a list of stores and validates each store's ID,
	 *        name, and description.
	 *
	 * @param endpoint - The API endpoint for activating inventory.
	 * @param body     - Optional request body (null in this case).
	 *
	 * @return CustomResponse - The API response includes the HTTP status code,
	 *         status message, and a list of stores in the "Results" field.
	 */
	public CustomResponse getActInventory(String endpoint, Object body) {
		// write your code here

		Response response = null;
		int statusCode = 0;
		String status = "";

		List<Object> storeIds = null;
		List<Object> names = null;
		List<Object> storeDescriptions = null;

		return new CustomResponse(response, statusCode, status, storeIds, names, storeDescriptions);
	}
}
