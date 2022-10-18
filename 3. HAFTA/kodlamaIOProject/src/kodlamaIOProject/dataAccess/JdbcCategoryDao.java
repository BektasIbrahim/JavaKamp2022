package kodlamaIOProject.dataAccess;

import kodlamaIOProject.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc İle Eklendi :" + category.getCategoryName());

	}

}
