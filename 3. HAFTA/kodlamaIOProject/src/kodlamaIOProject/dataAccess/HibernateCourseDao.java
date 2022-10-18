package kodlamaIOProject.dataAccess;

import kodlamaIOProject.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate İle Eklendi: " + course.getName());

	}

}
