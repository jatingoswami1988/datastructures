package com.fis.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Interval {

	private Integer start;
	private Integer end;

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public Interval(Integer start, Integer end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return this.start + "-" + this.end;
	}

}

public class MergingIntervals {

	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(2, 4));
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(6, 8));
		intervals.add(new Interval(5, 7));
		intervals.sort((Interval i1, Interval i2) -> i1.getStart().compareTo(i2.getStart()));
		Stack<Interval> stack = new Stack<Interval>();
		for (Interval interval : intervals) {
			if (stack.isEmpty()) {
				stack.push(interval);
			} else {
				Interval temp = stack.pop();
				if (temp.getEnd() < interval.getEnd()) {
					temp.setEnd(interval.getEnd());
					stack.push(temp);
				} else {
					stack.push(interval);
				}
			}
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.pop().toString());
		}

	}

}
