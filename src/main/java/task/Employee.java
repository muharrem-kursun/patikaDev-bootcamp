package task;

public class Employee {
	
	private String name;
	
	private float slary;
	
	private float workHours;
	
	private int hireYear;

	public Employee(String name, float slary, float workHours, int hireYear) {
		super();
		this.name = name;
		this.slary = slary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public float tax() {
		
		if(this.slary>1000)
			return this.slary*3/100;
		
		
		return 0.0f;
		
	}
	
	public float bonus()
	{
		if(this.workHours>40)
			return (this.workHours-40)*30;
		
		return 0.0f;
	}
	
	public float raiseSalary() {
		int workYears = 2021-this.hireYear;
		float realSalary = this.slary-this.tax()+this.bonus();
		
			if(workYears<10) {
				return realSalary*5/100;
			}
			else if(workYears>=10 && workYears<20) {
				return realSalary*10/100;
			}
			
			return realSalary*15/100;
				
	}

	@Override
	public String toString() {
		return "Adı : " + this.name  + "\n" + 
			   "Maaşı : " + this.slary + "\n" + 
				"Çalışma Saati : " + this.workHours + "\n" + 
			   "Başlangıç Yılı : " + this.hireYear + "\n" + 
				"Vergi : " + this.tax() + "\n" + 
				"Bonus : " + this.bonus() + "\n" + 
				"Maaş Artışı : " + this.raiseSalary() + "\n" + 
				"Vergi Ve Bonuslar ile birlikte maaş : " + (this.slary-this.tax()+this.bonus()) + "\n" + 
				"Toplam Maaş : " + (this.slary+this.raiseSalary()+this.bonus());
	}
	
	
	
}
