package ClassesMétiers;

public interface Resource {

	public String getName();
	public float getState();
	public boolean getStatus();

	public void setName(String name);
	public void setState (float state);
	public void setStatus(boolean status);
}
