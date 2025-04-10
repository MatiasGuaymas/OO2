package ar.edu.unlp.info.oo2._Ejercicio4;

import java.time.Duration;

public abstract class State {
	private ToDoItem task;
	
	public State (ToDoItem task) {
		this.task = task;
	}
	
	public ToDoItem getTask() {
		return this.task;
	}
	
	public abstract void start();
	
	public abstract void togglePause() throws RuntimeException;
	
	public abstract void finish();
	
	public abstract Duration workedTime() throws RuntimeException;
	
	public abstract void addComment(String comment);
}
