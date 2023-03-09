package multilevel_inheritance;

public class Person {

	private String name;
	private String place;

	public void setProp(String name, String place) {

		this.name = name;
		this.place = place;
	}
	
	public void display() {
		System.out.println("Name: "+name+" Place: "+place);
	}
}
