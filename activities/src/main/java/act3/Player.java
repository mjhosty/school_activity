package act3;

public class Player {
	private BaseSkill[] skills = new BaseSkill[3];
	
	public Player(BaseSkill s1, BaseSkill s2, BaseSkill s3) {
		skills[0] = s1;
		skills[1] = s2;
		skills[2] = s3;
	}
	
	public BaseSkill[] getSkills() {
		return skills;
	}
	
	public boolean cast(BaseSkill skill) {
		return skill.action();
	}
}
