package utilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	
	public static List<String[]> readStringFile(String file) {
		//Name, SSN, account number, initial deposit
		List<String[]> data = new LinkedList<String[]>();
		String dataRow = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			//read line by line
			while((dataRow = br.readLine()) != null) {
				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}

}
