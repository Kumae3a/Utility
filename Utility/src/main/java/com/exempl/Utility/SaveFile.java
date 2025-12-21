package com.exempl.Utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveFile {

	public static void saveName(String addName, String directory, List<Object> arr, String name, boolean save) {
		if (arr.isEmpty()) {
			return; 
		}
		File direcFile = new File(directory);
		File file = new File(directory + addName + name);
		String fileName = directory + addName + name;

		try {
			if (!file.isDirectory()) {
				direcFile.mkdirs();
				file.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, save))) {
				for (Object str : arr) {
					writer.write(str.toString());
					writer.newLine();

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public static void saveName(String addName, List<Object> arr, String name, boolean save) {
		if (arr.isEmpty()) {
			return;
		}
		String fileName = addName + name;
		File file = new File(fileName);


		
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, save))) {
				for (Object str : arr) {
					writer.write(str.toString());
					writer.newLine();

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public static void saveName(List<Object> arr, String name, boolean save) {
		if (arr.isEmpty()) {
			return;
		}
		String fileName = name;
		File file = new File(fileName);

		try {
			if (!file.isDirectory()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, save))) {
				for (Object str : arr) {
					writer.write(str.toString());
					writer.newLine();

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public static void saveNameDir(String directory, List<Object> arr, String name, boolean save) {
		if (arr.isEmpty()) {
			return;
		}
		File direcFile = new File(directory);
		File file = new File(directory + name);
		String fileName = directory + name;

		try {
			if (!file.isDirectory()) {
				direcFile.mkdirs();
				file.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, save))) {
				for (Object str : arr) {
					writer.write(str.toString());
					writer.newLine();

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
