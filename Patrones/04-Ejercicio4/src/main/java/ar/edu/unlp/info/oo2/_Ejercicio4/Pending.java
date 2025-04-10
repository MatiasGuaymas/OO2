package ar.edu.unlp.info.oo2._Ejercicio4;

import java.time.Duration;

public class Pending extends State {

	public Pending(ToDoItem task) {
		super(task);
	}
	
	@Override
	public void start() {
		ToDoItem task = this.getTask();
		task.changeState(new InProgress(task));
	}

	@Override
	public void togglePause() throws RuntimeException {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	@Override
	public void finish() {}

	@Override
	public Duration workedTime() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause, in-progress o finished");
	}

	@Override
	public void addComment(String comment) {
		this.getTask().getComments().add(comment);
	}

}
