package kodlamaIOProject.dataAccess;

import kodlamaIOProject.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate İle Eklendi :" + category.getCategoryName());

	}

}
