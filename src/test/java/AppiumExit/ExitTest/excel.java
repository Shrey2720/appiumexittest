package AppiumExit.ExitTest;
import java.io.IOException;
import java.io.PrintStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test
public class excel {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	@Test
	public static String name() throws IOException
	{
		projectPath= System.getProperty("user.dir");
		workbook = new XSSFWorkbook(projectPath+ "\\Book1.xlsx");
		sheet = workbook.getSheet("Sheet1");
		String name= sheet.getRow(1).getCell(0).getStringCellValue();
		return name;
	}

}
