package com.linecomparison;

public class LineComparison {
	int x1,y1,x2,y2;
    float result;
    
	LineComparison(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	/*
	 * calculating distance using math function
	 */
	public void distance() {
		result = (float)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Distance between two points is "+result);
	}

}
