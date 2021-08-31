package com.linecomparison;

public class LineComparison {
	int x1, y1, x2, y2, p1, q1, p2, q2;

	LineComparison(int x1, int y1, int x2, int y2, int p1, int q1, int p2, int q2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.p1 = p1;
		this.q1 = q1;
		this.p2 = p2;
		this.q2 = q2;
	}

	/*
	 * calculating distance using math function comparing two lines using
	 * compareTo()
	 */
	public void compareTo() {
		Double distance1 = new Double(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
		Double distance2 = new Double(Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1)));

		System.out.println("Distance between two points of line1 is " + distance1);
		System.out.println("Distance between two points of line2 is " + distance2);

		// comparison using compareTo()
		int res = distance1.compareTo(distance2);
		if (res > 0)
			System.out.println("Line1 is greater than Line2");
		else if (res < 0)
			System.out.println("Line1 is smaller than Line2");
		else
			System.out.println("Both lines are equal");

	}

}
