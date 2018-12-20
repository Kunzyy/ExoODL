package ClassesMétiers;

public class Worker {

	private static int i=0;
	private String id;
	private String name;
	private Skill skill;

	public Worker(String name, Skill skill) {
		this.id = "1"+i;
		this.name = name;
		this.skill = skill;
		i++;
	}

	public Worker(String name) {
		this.id = "1"+i;
		this.name = name;
		i++;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}


	@Override
	public String toString() {
		return "Worker{" +
			"id='" + id + '\'' +
			", name='" + name + '\'' +
			", skill=" + skill+
			'}';
	}
}








