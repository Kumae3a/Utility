package com.exempl.Utility;

import java.util.List;
import java.util.stream.Collectors;

public class Statistics {
	private long averageNumb = 0;
	private double averageDouble = 0;
	private double max = 0;
	private double min = 100;
	private long minI = 100;
	private long maxI = 0;
	private String maxS = "";
	private String minS = "";
	
	

	public String getMaxS() {
		return maxS;
	}

	public String getMinS() {
		return minS;
	}

	public long getMinI() {
		return minI;
	}

	public long getMaxI() {
		return maxI;
	}

	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}

	public double getAverageNumb() {
		return averageNumb;
	}

	public double getAveragePoint() {
		return averageDouble;
	}

	public void numbers(List<Object> list) {

		List<Long> number = list.stream()
				.map(n -> (long) n)
				.collect(Collectors.toList());
		
     		
		for (int i = 0; i < number.size(); i++) {
			if (minI > number.get(i)) {
				minI = number.get(i);
			}
			if (maxI < number.get(i)) {
				maxI = number.get(i);
			}
			averageNumb = averageNumb + number.get(i);
		}

	}

	public void doubles(List<Object> list) {
		
		List<Double> number = list.stream()
				.map(n -> (double) n)
				.collect(Collectors.toList());

		for (int i = 0; i < number.size(); i++) {
			if (min > number.get(i)) {
				min = number.get(i);
			}
			if (max < number.get(i)) {
				max = number.get(i);
			}
			averageDouble = +number.get(i);
		}

		
	}

	public void strings(List<Object> list) {

		List<String> number = list.stream()
				.map(n -> (String) n)
				.collect(Collectors.toList());
		int min1 = 100;
		int max1 = 0;
		for (int i = 0; i < number.size(); i++) {
			if (min1 > number.get(i).length()) {
				min1 = number.get(i).length();
				minS = number.get(i);
			}
			if (max1 < number.get(i).length()) {
				max1 = number.get(i).length();
				maxS = number.get(i);
			}

		}

	}
}
