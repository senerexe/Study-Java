package b;

public class Employee {
	private String name;  // ÇALIŞAN ADI
	public double salary; // MAAŞI
	private int hareYear, workHours; // İŞE BAŞLAMA YILI VE ÇALIŞMA SAATİ

	Employee(int hareYear, int workHours, double salary, String name){

		this.hareYear = hareYear;
		this.name = name;
		this.salary= salary;
		this.workHours = workHours;
	}
	public double tax() {           // VERGİ HESAPLAMA
		if(this.salary >= 1000) {
			return salary * 0.03;
		}else {
			return 0.00;

		}
	}
	public int bonus() {         // EKSTRA ÇALIŞMA HESAPLAMA
		int extraHours = this.workHours - 40;
		if(extraHours > 0) {
			return 30 * extraHours;
		}else {
			return 0;
		}
	}

	public double raiseSalary() {      // ÇALIŞMA YILI KATKISI
		int startWork = 2020 - this.hareYear;
		if(startWork< 10) {
			return salary * 0.05;
	    }else if (startWork >= 10 && startWork < 20) {
			return salary * 0.1;
		
	    }else{
			return salary * 0.15;
		}
	}
	public void toString(Employee emp)  {    // ÇIKTI ALMA
		System.out.println("Tax: " + emp.tax());
		System.out.println("Bonus: " + emp.bonus());
		System.out.println("Raise Salary: " + emp.raiseSalary());
		double totalSalary = emp.salary - emp.tax() + emp.bonus();
		System.out.println("Total Salary with tax and bonus:" + totalSalary);
		System.out.println("Total Salary with the raise of salary: " + (emp.salary + emp.raiseSalary()) );
		
		
		
		
	}
	
}




