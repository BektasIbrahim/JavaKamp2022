package kodlamaIOProject.dataAccess;

import kodlamaIOProject.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate İle EKlendi :" + instructor.getId());

	}

}
