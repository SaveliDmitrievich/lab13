package task2;

public class Main {
	public static void main(String[] args) {
		Tester t = new Tester("Савелий", "Иванов", 2000);
		System.out.println(t);

		Tester[] testers = {
				new Tester("Савелий", "Иванов", 5000, "Advanced", 12),
				new Tester("Никита", "Волошко", 4200, "Upper-Intermediate", 8),
				new Tester("Марк", "Запольский", 3500, "Intermediate", 5)
		};

		System.out.println("Средняя зп: " + Tester.calculateAverageSalary(testers));

		testers[0].changeSalary(1000);
		System.out.println("Новая зарплата Савелия: " + testers[0].getSalary());

		if (testers[0].compareSalary(testers[1])) {
			System.out.println("Савелий зарабатывает больше, чем Никита");
		} else {
			System.out.println("Никита зарабатывает больше, чем Савелий");
		}

		System.out.println(testers[0].isSenior());

		System.out.println(testers[1].isSenior(10));

		testers[0].changeSalary(-500, testers);
		System.out.println("Зарплаты после изменения:");
		for (Tester tester : testers) {
			System.out.println(tester.getName() + ": " + tester.getSalary());
		}
	}
}