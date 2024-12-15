package day2;

import java.util.ArrayList;

public class main
{

	public static void main(String[] args)
	{
		Data data = new Data();
		data.inputData();

		part1(data);
		
	}

	private static int part2(ArrayList<Integer> list)
	{
		ArrayList<Integer> alt = new ArrayList<>(list);
		boolean safe = false;
		int temp;
		
		for(int index = 0; index < list.size(); index++)
		{
			temp = alt.remove(index);
			System.out.println(alt);
			safe = controle(alt);
			System.out.println(safe);
			if(safe == true)
				return 1;
			alt.add(index, temp);
		}
		
		return 0;
	}

	private static void part1(Data data)
	{
		
		int score = 0;
		
		for(ArrayList<Integer> list : data.allRows)
		{
			boolean safe = controle(list);
			
			if(safe == true)
				score++;
			else
				score += part2(list);
			
			System.out.println(score);
		}
		System.out.println(score);
		
		
	}

	private static boolean controle(ArrayList<Integer> list)
	{
		boolean increase, test;
		int gap = 0;
		increase = true;
		
		System.out.println(list);
		for(int index = 0; index < list.size(); index++)
		{
			if(index != 0)
			{
				if(index == 1)
				{
					if(list.get(index-1)<list.get(index))
						increase = true;
					else
						increase = false;
				}
				gap = Math.abs(list.get(index) - list.get(index-1)); // controle gap
				if (gap <= 0 || gap >= 4)
					return false;

				
				if(list.get(index-1)<list.get(index)) // controle increase
					test = true;
				else
					test = false;
				
				if (increase != test)
					return false;
				
			}
		}
		return true;
	}


	

}
