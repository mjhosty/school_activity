package act2;

import handler.MainHandler;

public class Main {
	public Main() {
		Person p1;
		Student s1 = new Student("John", 19, "4th St.", "BSCS");
		Teacher in1 = new Teacher("Mikey", 24, "St. Burg", "OOP");


		p1 = s1;
		MainHandler.log(p1.getName() + ": " + p1.greetings(in1));

		p1 = in1;
		MainHandler.log(p1.getName() + ": " + p1.greetings());
	}
}