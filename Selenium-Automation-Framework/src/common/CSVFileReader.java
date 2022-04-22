package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CSVFileReader {
	/*
	 admin,admin
	 ess,ess
	 admin123,admin123
	 */

	public static void main(String[] args)throws Exception
	{
		File file = new File("C:/Users/lenovo/Downloads/Test.csv");
				

				BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		while ((st = br.readLine()) != null)
		{
			System.out.println(st.split(",")[0]+" " +st.split(",")[1]);
		}
		
	}

}



