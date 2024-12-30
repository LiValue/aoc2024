package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start
{

	public static void main(String[] args)
	{
		Data data = new Data();
		List<String> d = new ArrayList<>();

		d = data.inputData();
		
		part1(d);

	}


	private static void part1(List<String> d)
	{



				
				List<String> ints = new ArrayList<>();

        boolean wasDigit = false; // Flag to track if the previous character was a digit

        // Iterate through each character in the string
        for(String string : d)
        {
        	StringBuilder r = new StringBuilder();
        	for (char c : string.toCharArray()) 
        	{

                if (Character.isDigit(c)) {
                    r.append(c);  
                    wasDigit = true; // Mark that we are in a digit sequence
                } else if (wasDigit) {
                  
                    // Append a space only after a sequence of digits ends
                    r.append(" ");
                    wasDigit = false; // Reset flag for non-digit characters
                }
                
                
            }
        	ints.add(r.toString());
        }
        
//       for(String i : ints)
//       {
//    	   System.out.println(i);
//       }
        
        
       List<Integer> allInts = new ArrayList<>();
        
        for(String s : ints)
        {
        	
        	ArrayList<Integer> n = new ArrayList<>();
        	Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(s);

            // Extract integers
            
            while (matcher.find()) 
            {
                n.add(Integer.parseInt(matcher.group()));
            }
            allInts.addAll(n);
        	
        	
            
        }
        
 //      System.out.println(allInts);
        
        long total = 0;
        int sum;
        for(int i = 0; i< allInts.size(); i+=2)
        {
        	sum = (allInts.get(i))*(allInts.get(i+1));
        	total += sum;
        	System.out.printf("x = %d, y = %d, sum = %d, total = %d %n", allInts.get(i), allInts.get(i+1), sum, total);
        }
        
        System.out.println(total);
        

	}

}
