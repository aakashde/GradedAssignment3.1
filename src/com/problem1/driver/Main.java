package com.problem1.driver;
import java.util.LinkedList;
import java.util.Scanner;
import com.problem1.service.SearchingLogicImplementation;

public class Main {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);		
		System.out.println("enter the total no of floors in the building");
		int totalFloor = sc.nextInt();		
		LinkedList<Integer> floorConfig = new LinkedList<Integer>();
		for(int i=0;i<totalFloor;i++)
		{
			System.out.println("enter the floor size given on day : "+(i+1));
			floorConfig.add(sc.nextInt());						
		}
		
		SearchingLogicImplementation sLI = new SearchingLogicImplementation();
		
		int upperLimit=0;
		int lowerLimit = 0;
		int a=totalFloor;
		System.out.println("\nThe order of construction is as follows :\n");
		do {
			//Searching for the position of the largest floor
			upperLimit = sLI.findPositionOfElements(floorConfig,a);
			
			//Loop for printing the days as Empty
			for(int i=lowerLimit;i<upperLimit;i++)
			{
				System.out.println("Day: "+(i+1)+"\n");
			}
			lowerLimit = upperLimit+1;
			System.out.println("Day: "+(upperLimit+1));
			
			while(sLI.isFloorLarger(floorConfig,upperLimit,a))
			{
				System.out.print(a--+" ");
				if(a<=0)
					break;
			}
			System.out.println();
			
		}while(a>0);
		sc.close();
	}
}
