public class Developer {

	private String name;
	private int age;
	private String programmingLanguage;
	private int experienceYears;
	private double salary;
	

	
	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("Bitte geben Sie Ihren Namen ein");
		}
		
		if(name.trim().isEmpty()) {
			throw new IllegalArgumentException("Bitte geben Sie Ihren Namen ein");
		}
			this.name = name;		

	}
	
	public void setAge(int age) {
		
		if(age <= 0 || age > 120) {
			throw new IllegalArgumentException("Bitte geben Sie einen gültigen Wert ein");
			
		}
				this.age = age;
				
			}
	
	public void setProgrammingLanguage (String programmingLanguage) {
		if(programmingLanguage == null || programmingLanguage.trim().isEmpty()) {
			throw new IllegalArgumentException("Bitte geben Sie Ihre Programmiersprache ein");
			
		}
		this.programmingLanguage = programmingLanguage;
	}
	
	public void setExperienceYears (int experienceYears) {
		if(experienceYears < 0) {
			throw new IllegalArgumentException("Bitte geben Sie Ihre Programmiersprache ein");
		}
		this.experienceYears = experienceYears;
		
	}
	
	public void setSalary (double salary) {
		if (salary < 0) {
			throw new IllegalArgumentException("Bitte geben Sie ihr Gehalt an");
		}
		this.salary = salary;
	}
}





