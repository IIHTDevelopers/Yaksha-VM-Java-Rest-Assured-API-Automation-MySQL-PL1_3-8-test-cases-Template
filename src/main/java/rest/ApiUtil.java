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
	 * @param body     - Optional request body
	 * @return CustomResponse - Contains response, statusCode, status, departmentIds and departmentNames.
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
	 * @param body     - Optional request body
	 * @return CustomResponse - Contains response, statusCode, status, itemIds and itemNames.
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
	 * @param body - Optional request body
	 * @return CustomResponse - Contains response, statusCode, status, prescriberIds, prescriberNames, docTotalAmounts,
				tdsAmounts and netPayableAmounts.
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
	 * @param body - Optional request body
	 * @return CustomResponse - Contains response, statusCode, status, prescriberNames, prescriberIds, docTotalAmounts,
				tdsAmounts and netPayableAmounts.
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
	 * @Test5 This method fetches the hospital income incentive report.
	 *
	 * @param endpoint - The API endpoint for fetching the hospital income incentive
	 *                 report.
	 * @param body     - Optional request body
	 *
	 * @return CustomResponse - Contains response, statusCode, status, serviceDepartmentIds, serviceDepartmentNames, netSales,
				referralCommissions, grossIncomes, otherIncentives and hospitalNetIncomes.
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
	 *        the API.
	 *
	 * @param endpoint - The API endpoint for fetching employee bill items.
	 * @param body     - Optional request body
	 *
	 * @return CustomResponse - Contains response, statusCode, status, employeeIncentiveInfoId, employeeId, fullName,
				tdsPercent, empTdsPercent, isActive and employeeBillItemsMap.
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
	 * @Test7 This method fetches inventory fiscal years from the API.
	 *
	 * @param endpoint - The API endpoint for retrieving inventory fiscal years.
	 * @param body     - Optional request body
	 *
	 * @return CustomResponse - Contains response, statusCode, status, fiscalYearIds, fiscalYearNames, startDates, endDates and 
				isActiveList.
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
	 *        the API.
	 *
	 * @param endpoint - The API endpoint for activating inventory.
	 * @param body     - Optional request body
	 *
	 * @return CustomResponse - Contains response, statusCode, status, storeIds, names and storeDescriptions.
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
