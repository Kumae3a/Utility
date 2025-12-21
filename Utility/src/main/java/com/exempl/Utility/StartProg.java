package com.exempl.Utility;

public class StartProg {
	private boolean dir = false;
	private boolean twoName = false;
	private boolean rec = false;
	private String name = "";
	private String directory = "";
	private String[] arr;
	private String nameDoub = "floats.txt";
	private String nameInt = "integers.txt";
	private String nameStr = "strings.txt";

	public StartProg(String[] arr) {
		this.arr = arr;
	}

	public void start() {

		Picking picking = new Picking(arr);
		picking.addAll();
		Statistics statistics = new Statistics();
		statistics.doubles(picking.getPoint());
		statistics.numbers(picking.getNum());
		statistics.strings(picking.getWord());
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals("-o")) {
				dir = true;
				directory = arr[i + 1];
			} else if (arr[i].equals("-p")) {
				twoName = true;
				name = arr[i + 1];
			} else if (arr[i].equals("-a")) {
				rec = true;
			} else if (arr[i].equals("-s")) {
				System.out.println("Колличество строк: " + picking.getNumLine());
				System.out.println("Колличество чисел: " + picking.getNumNumb());
				System.out.println("Колличество дробных чисел: " + picking.getNumPoint());
			} else if (arr[i].equals("-f")) {
				System.out.println("Строки");
				System.out.println("Наибольшая строка: " + statistics.getMaxS());
				System.out.println("Наименьшая строка: " + statistics.getMinS());
				System.out.println("Числа");
				System.out.println("Наибольшее число: " + statistics.getMaxI());
				System.out.println("Наименьшее число: " + statistics.getMinI());
				System.out.println("Среднее значение: " + (double) statistics.getAverageNumb() / picking.getNumNumb());
				System.out.println("Дробные числа");
				System.out.println("Наибольшее число: " + statistics.getMax());
				System.out.println("Наименьшее число: " + statistics.getMin());
				System.out.println("Среднее значение: " + statistics.getAveragePoint() / picking.getNumPoint());

			}
		}
		if (dir && twoName) {
			SaveFile.saveName(name, directory, picking.getPoint(), nameDoub, rec);
			SaveFile.saveName(name, directory, picking.getWord(), nameStr, rec);
			SaveFile.saveName(name, directory, picking.getNum(), nameInt, rec);

		} else if (dir && !twoName) {
			SaveFile.saveNameDir(directory, picking.getPoint(), nameDoub, rec);
			SaveFile.saveNameDir(directory, picking.getWord(), nameStr, rec);
			SaveFile.saveNameDir(directory, picking.getNum(), nameInt, rec);

		} else if (!dir && twoName) {
			SaveFile.saveName(name, picking.getPoint(), nameDoub, rec);
			SaveFile.saveName(name, picking.getWord(), nameStr, rec);
			SaveFile.saveName(name, picking.getNum(), nameInt, rec);

		} else if (!dir && !twoName) {
			SaveFile.saveName(picking.getPoint(), nameDoub, rec);
			SaveFile.saveName(picking.getWord(), nameStr, rec);
			SaveFile.saveName(picking.getNum(), nameInt, rec);

		}

	}

}