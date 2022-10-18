package kodlamaIOProject;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOProject.business.CategoryManager;
import kodlamaIOProject.business.CourseManager;
import kodlamaIOProject.business.InstructorManager;
import kodlamaIOProject.core.logging.DatabaseLogger;
import kodlamaIOProject.core.logging.FileLogger;
import kodlamaIOProject.core.logging.Logger;
import kodlamaIOProject.core.logging.MailLogger;
import kodlamaIOProject.dataAccess.HibernateCategoryDao;
import kodlamaIOProject.dataAccess.InstructorDao;
import kodlamaIOProject.dataAccess.JdbcCategoryDao;
import kodlamaIOProject.dataAccess.JdbcCourseDao;
import kodlamaIOProject.dataAccess.JdbcInstructorDao;
import kodlamaIOProject.entities.Category;
import kodlamaIOProject.entities.Course;
import kodlamaIOProject.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course = new Course(1, "Java", 500, "Engin Demiroğ");
		Course course2 = new Course(2, "After Effects", 450, "İbrahim Bektaş");

		Category category = new Category(1, "Programlama");
		Category category2 = new Category(2, "Tasarım");

		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		Instructor instructor2 = new Instructor(2, "İbrahim", "Bektaş");

		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new DatabaseLogger());
		loggers.add(new FileLogger());
		loggers.add(new MailLogger());

		List<Course> courses = new ArrayList<Course>();

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);
		courseManager.add(course);
		courseManager.add(course2);

		List<Category> categorys = new ArrayList<Category>();
		CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(), categorys, loggers);
		categoryManager.add(category);
		categoryManager.add(category2);
		
		List<Instructor> instructors=new ArrayList<Instructor>();
		InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao(), loggers, instructors);
		instructorManager.add(instructor);
		instructorManager.add(instructor2);

	}

}
