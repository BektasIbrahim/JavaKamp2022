package kodlamaIOProject.business;

import java.util.List;

import kodlamaIOProject.core.logging.Logger;
import kodlamaIOProject.dataAccess.InstructorDao;
import kodlamaIOProject.entities.Instructor;

public class InstructorManager {
	private InstructorDao ınstructorDao;
	private List<Instructor> instructores;
	private List<Logger> loggers;

	public InstructorManager(InstructorDao ınstructorDao, List<Logger> loggers, List<Instructor> instructores) {
		this.ınstructorDao = ınstructorDao;
		this.instructores = instructores;
		this.loggers = loggers;

	}

	public void add(Instructor instructor) throws Exception {

		for (Instructor ıns : instructores) {
			if (ıns.getId() == instructor.getId()) {
				throw new Exception("Aynı id ile birden fazla kişi olamaz");

			}
		}
		ınstructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getId());
		}
	}

}
