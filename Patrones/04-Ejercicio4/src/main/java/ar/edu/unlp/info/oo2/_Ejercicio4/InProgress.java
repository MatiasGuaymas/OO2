package ar.edu.unlp.info.oo2._Ejercicio4;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress extends State {

	public InProgress(ToDoItem task) {
		super(task);
		this.getTask().setStartDate();
	}
	
	@Override
	public void start() {}

	@Override
	public void togglePause() {
		ToDoItem task = this.getTask();
		task.changeState(new Paused(task));
	}

	@Override
	public void finish() {
		ToDoItem task = this.getTask();
		task.changeState(new Finished(task));
	}
	
	@Override
	public Duration workedTime() {
		return Duration.between(this.getTask().getStartDate(), LocalDateTime.now());
	}

	@Override
	public void addComment(String comment) {
		this.getTask().getComments().add(comment);
	}
	
}
