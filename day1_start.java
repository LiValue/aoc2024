package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main
{

	public static void main(String[] args)
	{
		int total = 0;
		Data data = new Data();
//		data.insertTestData();
		data.insertData();
		
		test1(data);
		test2(data);

	}
	
	public static void test2(Data data)
	{
		int total = 0, sim = 0, score = 0, d1;
		int index;
		
		for(index = 0; index < data.data1.size(); index++)
		{
			sim = 0;
			score = 0;
			d1 = data.data1.get(index);
			for(int d2 : data.data2)
			{
//				System.out.printf("d1 = %d, d2 = %d %n", d1, d2);
				if (d2 == d1)
					sim++;
			}
				
			score = sim * d1;
			total += score;
			
//			System.out.printf("score = %d, total = %d %n", score, total);
		}
			
		System.out.println(total);
		
		
		
	}
	
	public static void test1(Data data)
	{
		int total = 0;
		while(!data.data1.isEmpty())
		{
//			System.out.println("data lijst 1:");
//			for(int d1 : data.data1)
//				System.out.printf("%d ",d1);
			
//			System.out.println("\ndata lijst 2:");
//			for(int d2 : data.data2)
//				System.out.printf("%d ",d2);
			
			int min1 = Collections.min(data.data1);
			int min2 = Collections.min(data.data2);
			
			int temp = min1 - min2;
			total += Math.abs(temp);
			
//			System.out.printf("%nmin1 = %d, min2 = %d %n",min1, min2);
			
			data.data1.remove((Integer)min1);
			data.data2.remove((Integer)min2);
			
			
		}
		
		System.out.println(total);
		

	}

}
