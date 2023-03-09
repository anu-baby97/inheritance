package multilevel_inheritance;

public class Tester extends Employee {
	
	private String specialization;
	
	public void setSpecialization(String specialization) {

		this.specialization=specialization;
	}
	
	public void print() {
		display();
		System.out.println(getEmpid());
		System.out.println(specialization);
	}
	
	 
}
