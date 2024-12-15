package day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Data
{
	public ArrayList<ArrayList<Integer>> allRows = new ArrayList<>();
	
	public List<String> inputData()
	{
		List<String> data = new ArrayList<>();
		File file = new File("src/day3/advent3.txt");
		try
		{
			Scanner sc = new Scanner(file);
			
			
			
			data = sc.findAll("mul\\(\\d{1,3}\\,\\d{1,3}\\)").map(MatchResult::group).collect(Collectors.toList());

//			System.out.println(data);
			

			
			
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		 
	}
	
	
	
	public String readList()
	{
		
		Path filePath = Path.of("src/day3/advent3.txt");
		String content="";
		
		try
		{
			content = Files.readString(filePath);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
       return content;
		
		
	}
	
}
