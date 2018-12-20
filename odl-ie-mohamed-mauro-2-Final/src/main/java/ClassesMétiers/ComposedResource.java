package ClassesMétiers;

import ClassesMétiers.Resource;

import java.util.ArrayList;

public class ComposedResource implements Resource {
	private String name;
	private float state;
	private ArrayList<Resource> basicResources = new ArrayList<>();
	private boolean status;

	public String getName() { return name; }

	public float getState() { return state; }

	public ArrayList<Resource> getBasicResources() { return basicResources; }

	public boolean getStatus(){ return status;}

	public ComposedResource(String name){
		this.name=name;
	}

	public ComposedResource(String name, ArrayList<Resource> basicResources) {
		this.name = name;
		this.basicResources = basicResources;
	}

	public void addBasicRessource(Resource addedRessource){
		this.basicResources.add(addedRessource);
	}
	public void dropBasicRessource(Resource droppedRessource){
		this.basicResources.remove(droppedRessource);
	}

	public void setState(float state) {
		this.state = state;
	}

	public void setBasicResources(ArrayList<Resource> basicResources) {
		this.basicResources = basicResources;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(boolean status){this.status=status;}
}
