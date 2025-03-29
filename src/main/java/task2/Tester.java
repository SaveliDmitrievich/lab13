package task2;

import java.sql.SQLOutput;

public class Tester {
	public static String jobTitle;
	private String name;
	private String surname;
	private int expirienceInYears;
	private String englishLevel;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getExpirienceInYears() {
		return expirienceInYears;
	}

	public void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	public String getEnglishLevel() {
		return englishLevel;
	}

	public void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Tester() {
	}

	public Tester(String name, String surname, double salary) {
		setName(name);
		setSurname(surname);
		setSalary(salary);
	}

	public Tester(String name, String surname, double salary, String englishLevel) {
		this(name, surname, salary);
		setEnglishLevel(englishLevel);
	}

	public Tester(String name, String surname, double salary, String englishLevel, int expirienceInYears) {
		this(name, surname, salary, englishLevel);
		setExpirienceInYears(expirienceInYears);
	}

	public void changeSalary(double num) {
		double newSalary = getSalary() + num;
		if (newSalary < 0) {
			setSalary(0);
		} else {
			setSalary(newSalary);
		}
	}

	public void changeSalary(double num, Tester[] mas) {
		if (mas == null) return;
		for (Tester tester : mas) {
			if (tester != null)
				tester.changeSalary(num);
				System.out.println(jobTitle);
		}
	}

	public boolean compareSalary(double amount) {
		return this.salary > amount;
	}

	public boolean compareSalary(Tester other) {
		return this.salary > other.salary;
	}

	public String isSenior() {
		if (this.expirienceInYears >= 10) {
			return this.name + " " + this.surname + " уже Senior-тестировщик! 🎉";
		} else {
			int yearsLeft = 10 - this.expirienceInYears;
			return this.name + " " + this.surname + " ещё не Senior. Нужно поработать " + yearsLeft + " лет(года) и набраться опыта.";
		}
	}

	public String isSenior(int requiredExperience) {
		if (this.expirienceInYears >= requiredExperience) {
			return this.name + " " + this.surname + " соответствует требованиям компании для Senior-тестировщика! ✅";
		} else {
			int yearsLeft = requiredExperience - this.expirienceInYears;
			return this.name + " " + this.surname + " пока не соответствует требованиям компании. Нужно ещё " + yearsLeft + " лет опыта.";
		}
	}

	public static double calculateAverageSalary(Tester[] testers) {
		if (testers == null || testers.length == 0)
			return 0;
		double sum = 0;
		int count = 0;
		for (Tester tester : testers) {
			if (tester != null) {
				count++;
				sum += tester.getSalary();
			}
		}
		return sum / count;
	}

	@Override
	public String toString() {
		return getName() + "\n" + getSurname() + "\n" + getSalary() + "\n" + getEnglishLevel() + "\n" + getExpirienceInYears();
	}
}
