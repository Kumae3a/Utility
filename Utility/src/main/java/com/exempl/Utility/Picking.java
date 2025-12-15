package com.exempl.Utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Picking {

	private String[] arr;
	private List<Object> num = new ArrayList<>();
	private List<Object> word = new ArrayList<>();
	private List<Object> point = new ArrayList<>();
	private int numLine = 0;
	private int numPoint = 0;
	private int numNumb = 0;

	public Picking(String[] arr) {
		super();
		this.arr = arr;

	}

	public int getNumLine() {
		return numLine;
	}

	public int getNumPoint() {
		return numPoint;
	}

	public int getNumNumb() {
		return numNumb;
	}

	public List<Object> getNum() {
		return num;
	}

	public List<Object> getWord() {
		return word;
	}

	public List<Object> getPoint() {
		return point;
	}
 
	public void addAll() { 																
		List<String> addFile = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].endsWith(".txt")) {
				
				
				File file = new File(arr[i]);
				if(!file.isFile()) {
					System.out.println("Файл " + arr[i] + " не найден!" );
					continue;
				}else {
									
				try (BufferedReader reader = new BufferedReader(new InputStreamReader( 
						new FileInputStream((String) arr[i])))) {
					String line;
					while ((line = reader.readLine()) != null) {
						addFile.add(line);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				}
			}
		}

		for (String elem : addFile) {
			String unkElement = elem.trim(); 											
			if (addFile.isEmpty()) {
				continue;
			}
			try {
				num.add(Long.parseLong(unkElement));
				numNumb++;
			} catch (Exception e1) {
				try {
					point.add(Double.parseDouble(unkElement));
					numPoint++;
				} catch (Exception e2) {
					word.add(unkElement);
					numLine++;
				}
			}
		}

	}

}
