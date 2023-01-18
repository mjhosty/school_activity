import java.util.Scanner;

import act3.*;

public class Main {
	
	public static void main(String[] args) {
		BaseSkill s1 = new BaseSkill() {
			@Override
			public boolean action() {
				System.out.println("Body Slam");
				return true;
			}};
		BaseSkill s2 = new BaseSkill() {
			@Override
			public boolean action() {
				System.out.println("Ice Rain");
				return true;
			}};
			
		BaseSkill s3 = new BaseSkill() {
			@Override
			public boolean action() {
				System.out.println("Wind Cutter");
				return true;
			}};
		
		Player player = new Player(s1, s2, s3);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int c = sc.nextInt();
			if(c > player.getSkills().length) 
				continue;
			player.cast(player.getSkills()[c - 1]);
		}
	}
}
