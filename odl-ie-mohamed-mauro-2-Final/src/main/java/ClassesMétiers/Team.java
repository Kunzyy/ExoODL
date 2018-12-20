package ClassesMétiers;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Team {

	// une team n'aurait pas un projet attribué ?

	private List<Worker> teamComposition = new ArrayList<>();
	private String teamName;
	private static int teamNumber=0;

	public Team(List<Worker> teamComposition){
		this.teamComposition = teamComposition;
		this.teamName = "Team" + teamNumber;
		teamNumber++;
	}

	public Team() {teamNumber++;}

	public List<Worker> getTeamComposition() {
		return teamComposition;
	}

	public String getTeamName() {
		return teamName;
	}

	public int getTeamNumber() {
		return teamNumber;
	}


	public void setTeamComposition(List<Worker> teamComposition) {
		this.teamComposition = teamComposition;
	}

	public void setTeamName(){
		this.teamName="Team" + teamNumber;
		teamNumber++;
	}

	public void addWorker(Worker w){
		teamComposition.add(w);
	}

	@Override
	public String toString() {
		String text = teamName +  " :";
		ListIterator<Worker> it = teamComposition.listIterator();
		while (it.hasNext()) {
			Worker next = it.next();
			text = text + "\n" + next.toString();
		}
		return text;
	}
}
