package act2;

public class Teacher extends Person {
	private String subject;
	
	public Teacher(String name, int age, String address, String subject) {
		super(name, age, address, Occupation.INSTRUCTOR);
		this.subject = subject;
		this.t = this;
	}
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String greetings() {
		return "Good Morning Students";
	}
}