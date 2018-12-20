package ClassesMétiers;

import javafx.concurrent.Worker;

public class AgendaEntry {
	private int startTime;
	private int endTime;
	//private Worker worker;

	public int getStartTime() {
		return startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	/*public Worker getWorker() {
		return worker;
	}*/

	public AgendaEntry() {
		this.endTime = 0;
		this.startTime = 0;
	}

	public AgendaEntry(int startTime, int endTime, Worker worker) {
		this.startTime = startTime;
		this.endTime = endTime;
		//this.worker = worker;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	/*public void setWorker(Worker worker) {
		this.worker = worker;
	}*/

	@Override
	public String toString() {
		return "ClassesMétiers.AgendaEntry{" +
			"startTime=" + startTime +
			", endTime=" + endTime +
			/*", worker=" + worker +*/
			'}';
	}
}
