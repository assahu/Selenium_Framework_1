package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	@Test(dataProvider="test1Data")
	public void test1(String userName, String password) {
		System.out.println(userName+" : "+password);
	}
	
	@DataProvider(name="test1Data")
	public Object[][] getData(){
		
		Object[][] data = testData("E:\\Eclipse Workspace\\SeleniumJava\\excel\\data.xlsx", "Sheet1");
		return data;
	}
	
	public Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRows();
		int columnCount = excel.getColumns(0);
		
		Object[][] data = new Object[rowCount-1][columnCount];
		
		for(int i = 1; i<rowCount; i++ ) {
			for(int j = 0; j<columnCount; j++) {
				
				Object cellData = excel.getCellStringData(i, j);
//				System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
			}
			
//			System.out.println();
		}
		return data;
	}
}
