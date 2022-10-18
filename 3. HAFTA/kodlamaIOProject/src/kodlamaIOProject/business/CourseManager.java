package kodlamaIOProject.business;

import java.util.List;

import kodlamaIOProject.core.logging.Logger;
import kodlamaIOProject.dataAccess.CourseDao;
import kodlamaIOProject.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Logger> loggers;
	private List<Course> courses;

	public CourseManager(CourseDao courseDao, List<Logger> loggers, List<Course> courses) {

		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		for (Course c : courses) {
			if (c.getName().equals(course.getName())) {
				throw new Exception("Kurs İsimleri Aynı Olamaz !!");
			}	
		}
		if (course.getPrice() < 0) {
			throw new Exception("Kurs Fiyatı Sıfırdan Küçük Olamaz !!");
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
		
	}
}
