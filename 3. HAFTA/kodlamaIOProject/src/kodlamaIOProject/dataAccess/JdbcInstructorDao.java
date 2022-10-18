package kodlamaIOProject.dataAccess;

import kodlamaIOProject.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc İle EKlendi :" + instructor.getId());

	}

}
