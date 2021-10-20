package com.problem1.service;

import java.util.LinkedList;

public class SearchingLogicImplementation {

	public int findPositionOfElements(LinkedList<Integer> floorConfig, int a) {
				
		return floorConfig.indexOf(a);					
	}
	public boolean isFloorLarger(LinkedList<Integer> floorConfig, int upperLimit, int a) {
		
		if(floorConfig.indexOf(a)<=upperLimit)
			return true;
		return false;
	}
}
