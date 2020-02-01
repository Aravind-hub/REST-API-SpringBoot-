package io.javabrains.sprintbootstarter.studentDetails;

public class StudentDetails {

	private int id;
	private String name;
	private int mark;

	public StudentDetails() {

	}

	public StudentDetails(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	

	

}
