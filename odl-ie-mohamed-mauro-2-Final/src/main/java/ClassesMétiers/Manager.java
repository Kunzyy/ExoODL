package ClassesMétiers;

public class Manager  {

	private static int i=0;
	private String id;
	private String name;

	public Manager(String name) {
		this.id="0"+i;
		this.name=name;
		i++;
	}


	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Manager{" +
			"id='" + id + '\'' +
			", name='" + name + '\'' +
			'}';
	}
}
