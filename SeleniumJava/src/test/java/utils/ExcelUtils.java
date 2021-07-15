package utils;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

	public static int getRows() {
		
		int noOfRows = 0;
		noOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("No. of Rows: "+noOfRows);
		return noOfRows;
	}

	public static String getCellStringData(int rowNum, int columnNum) {
		
		String cellData = null;
		cellData = sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
//		System.out.println(cellData);
		return cellData;

	}

	public static void getCellNumericData(int rowNum, int columnNum) {

		double cellData = sheet.getRow(rowNum).getCell(columnNum).getNumericCellValue();
		System.out.println(cellData);

	}

	public static int getColumns(int rowNum) {
		
		int noOfColumns = 0;
		noOfColumns = sheet.getRow(rowNum).getPhysicalNumberOfCells();
		System.out.println("No. of Columns: "+noOfColumns);
		return noOfColumns;
	}
}
