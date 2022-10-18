package kodlamaIOProject.dataAccess;

import kodlamaIOProject.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc İle Eklendi: " + course.getName());

	}

}
