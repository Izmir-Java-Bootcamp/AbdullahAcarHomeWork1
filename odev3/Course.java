package odev3;

import java.util.Arrays;

public class Course {
	private String name;
	private Student[] student;
	private int capacity=40;
	private int numberOfStudent=0;


	public Course(String name) {
		this.name=name;
	}

	public Course(String name, int capacity) {
		this.name=name;
		this.capacity=capacity;
	}

	public String getName() {
		return name;
	}

	public Student[] getStudent() {
		return student;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	public boolean addStudent(Student student) {


		return true;
	}
	public boolean dropStudent(Student student) {
		return true;
	}
	public void increaseCapacity() {

	}
	public Student getBestStudent() {
		return 1;
	}
	public Student getYoungsetStudent() {
		return 1;
	}
	public void clear() {

	}
	public void list() {

	}

	@Override
	public String toString() {
		return "Course [name=" + this.getName() + ",capacity=" + this.capacity
				+ ", numberOfStudent=" + this.getNumberOfStudent() + "]";
	}






}
