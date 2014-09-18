package com.galaxy.kite.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Point {
	int x;
	int y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int a, int b) {
		x = a;
		y = b;
	}

}

class NumPoint extends Point {
	int num = 1;

	public NumPoint(Point point) {
		super(point.x, point.y);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * x + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		NumPoint other = (NumPoint) obj;
		if (x != other.x || y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[x=" + x + ",y:" + y + " ,num:" + num + "]";
	}
}

class Line {
	int a;
	int b;
	double c;

	int num;

	Line(int a, int b, double c, int num) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.num = num;
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static Line getLine(Point point1, Point point2) {

		int y = point1.y - point2.y;
		int x = point1.x - point2.x;

		if (x != 0) {
			int gcd = gcd(y, x);
			y = y / gcd;
			x = x / gcd;
		}

		int a, b;
		double c;

		if (x != 0) {
			a = y;
			b = -x;
			c = point1.y - (y * 1.0 / x) * point1.x;
		} else {
			a = 0;
			b = 0;
			c = point1.y;
		}
		return new Line(a, b, c, ((NumPoint) point2).num);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		long temp;
		temp = Double.doubleToLongBits(c);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		Line other = (Line) obj;
		if (other.a * b != other.b * a)
			return false;
		if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[a=" + a + ",b=" + b + ",c=" + c + "]";
	}

}

public class MaxPointOnLine {

	public int maxPoints(Point[] points) {

		Map<NumPoint, NumPoint> map = new HashMap<NumPoint, NumPoint>();
		for (Point point : points) {
			NumPoint numPoint = new NumPoint(point);
			NumPoint tempPoint = map.get(numPoint);
			if (tempPoint == null) {
				map.put(numPoint, numPoint);
			} else {
				tempPoint.num++;
			}
		}

		List<NumPoint> list = new ArrayList<NumPoint>(map.keySet());

		int maxPointOnLine = 0;

		for (int i = 0, len = list.size(); i < len; i++) {
			Map<Line, Line> lineMap = new HashMap<Line, Line>();
			for (int j = i + 1; j < len; j++) {
				Line line = Line.getLine(list.get(i), list.get(j));
				Line tempLine = lineMap.get(line);

				if (tempLine == null) {
					lineMap.put(line, line);
				} else {
					tempLine.num += list.get(j).num;
				}
			}
			for (Line templine : lineMap.keySet()) {
				maxPointOnLine = Math.max(maxPointOnLine,
						templine.num + list.get(i).num);
			}
			maxPointOnLine = Math.max(maxPointOnLine, list.get(i).num);
		}
		return maxPointOnLine;
	}
}
