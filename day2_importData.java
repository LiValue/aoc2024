package day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Data
{
	public ArrayList<ArrayList<Integer>> allRows = new ArrayList<>();
	
	public void inputData() throws NumberFormatException
	{
		BufferedReader br;
		try
		{
			String filePath = "src/day2/advent2.txt";
			br = new BufferedReader(new FileReader(filePath));
		
		String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split("\\s+");
            ArrayList<Integer> row = new ArrayList<>();
            for (String value : values) {
                row.add(Integer.parseInt(value));
            }
            allRows.add(row);
        }
		} catch (FileNotFoundException e)
		{
            e.printStackTrace();
        } catch (IOException e)
		{
			e.printStackTrace(); 
		}
		
//		for (ArrayList<Integer> row : allRows) {
//            System.out.println(row);
//		}
	}
}
