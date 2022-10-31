package act1;

import handler.MainHandler;

public class BicycleRegistration {
	static String txt = " owns a bicycle";
	
	public BicycleRegistration() {
		Bicycle b1, b2;
		String o1, o2;
		
		b1 = new Bicycle("Adam Smith", "2000-187T");
		MainHandler.log(Bicycle.counter + "");
		b2 = new Bicycle("Ben Jones", "2000-132U");
		MainHandler.log(Bicycle.counter + "");
		o1 = b1.getName();
		o2 = b2.getName();
		
		MainHandler.log(o1 + txt);
		MainHandler.log(o2 + " also" + txt);
	}
}