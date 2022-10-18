package kodlamaIOProject.entities;

public class Course {
	private int id;
	private String name;
	private int price;
	private String teacher;

	public Course(int id, String name, int price, String teacher) {

		this.id = id;
		this.name = name;
		this.price = price;
		this.teacher = teacher;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}
