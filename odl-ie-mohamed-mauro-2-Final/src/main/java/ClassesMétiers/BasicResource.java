package ClassesMétiers;

public class BasicResource implements Resource{
	private String name;
	private boolean status;  //Status=true if the resource is being used right now; false if it's not
	private float state; //Represent the usury of the resource: 0=new ; 1=unusable.

	public BasicResource(String name) {
		this.name = name;
		this.status = false;
		this.state = 0;
	}

	public String getName() { return name; }

	public boolean getStatus (){ return status;}

	@Override
	public float getState() {
		return state;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(boolean status){ this.status = status; }

	@Override
	public void setState(float state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "BasicResource{" +
			"name='" + name + '\'' +
			", status=" + status +
			", state=" + state +
			'}';
	}

}
