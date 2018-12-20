package ClassesMétiers;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private String projectName;
	private List<Task> tasks= new ArrayList<>();

	public Project(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return "ClassesMétiers.Project{" +
			"projectName='" + projectName + '\'' +
			", tasks=" + tasks +
			'}';
	}
}

