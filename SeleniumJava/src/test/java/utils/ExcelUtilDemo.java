package utils;

public class ExcelUtilDemo {
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectPath+"/excel/data.xlsx", "Sheet1");
		
		excel.getRows();
		excel.getCellStringData(0, 0);
		excel.getCellNumericData(1, 1);
	}

}
