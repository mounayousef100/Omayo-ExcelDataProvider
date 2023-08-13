package com.omayo.dataprovider;
import org.testng.annotations.DataProvider;
import com.omayo.utility.ExcelUtils;

public class ExcelDataProvider {
	ExcelUtils obj = new ExcelUtils();
	
	@DataProvider(name = "LocateUsingNameAttributePage")
	public Object[][] locateUsingNameAttributePage() throws InterruptedException {
	    int rows = obj.getRowCount("LocateUsingNameAttributePage");
	    int columns = obj.getColumnCount("LocateUsingNameAttributePage");
	    int actRows = rows - 1;
	    int actColumns = columns;
	    Object[][] data = new Object[actRows][actColumns];

	    for (int i = 0; i < actRows; i++) {
	        for (int j = 0; j < actColumns; j++) {
	            data[i][j] = obj.getCellData("LocateUsingNameAttributePage", j, i + 2);
	        }
	    }
	    return data;
	
}
}
