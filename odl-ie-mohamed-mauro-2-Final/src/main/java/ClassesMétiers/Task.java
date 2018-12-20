package ClassesMétiers;

import javafx.concurrent.Worker;

public class Task {
	private String name;
	//private int expectedDuration;
	//private int deadline;
	private int progress;  // !!!! ici observer !!!!!
	//private Skill skill;
	private ClassesMétiers.Worker worker;
	private AgendaEntry agendaEntry;

	public String getName() { return name; }
	//public int getExpectedDuration() { return expectedDuration; }
	//public int getDeadline(){ return deadline; }
	public int getProgress(){ return progress; }
	//public Skill getSkill() { return skill; }
	public ClassesMétiers.Worker getWorker() { return worker; }
	public AgendaEntry getAgendaEntry() { return agendaEntry; }

	public Task(){
		this.progress=0;
	}

	/*public Task(String name, int expectedDuration, int deadline){
		this.name=name;
		this.expectedDuration=expectedDuration;
		this.deadline=deadline;
		this.progress=0;
	}*/

	public Task (String name, ClassesMétiers.Worker worker)
	{
		this.name = name;
		this.worker = worker;
	}

	public Task(String name, ClassesMétiers.Worker worker, AgendaEntry agendaEntry){
		this.name = name;
		this.worker = worker;
		this.agendaEntry = agendaEntry;
	}

	public Task (String name){
		this.name =name;
	}

	public Task(String name, AgendaEntry agendaEntry){
		this.name=name;
		this.agendaEntry=agendaEntry;
	}

	public void setName(String name){
		this.name=name;
	}
	/*public void setExpectedDuration(int expectedDuration){
		this.expectedDuration=expectedDuration;
	}*/
	/*public void setDeadline(int deadline){
		this.deadline=deadline;
	}*/
	public void setProgress(int progress){
		this.progress=progress;
	}
	/*public void setSkill(Skill skill){
		this.skill=skill;
	}*/
	public void setWorker(ClassesMétiers.Worker worker){
		this.worker=worker;
	}
	public void setAgendaEntry(AgendaEntry agendaEntry){
		this.agendaEntry=agendaEntry;
	}

	@Override
	public String toString() {
		return "Task{" +
			"name= " + name +
			", progress=" + progress +
			", worker=" + worker +
			", agendaEntry=" + agendaEntry +
			'}';
	}
}
