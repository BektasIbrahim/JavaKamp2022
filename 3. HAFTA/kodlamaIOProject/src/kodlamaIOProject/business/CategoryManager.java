package kodlamaIOProject.business;

import java.util.List;

import kodlamaIOProject.core.logging.Logger;
import kodlamaIOProject.dataAccess.CategoryDao;
import kodlamaIOProject.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private List<Category> categoryes;
	private List<Logger> loggers;

	public CategoryManager(CategoryDao categoryDao, List<Category> categoryes, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.categoryes = categoryes;
		this.loggers = loggers;

	}

	public void add(Category category) throws Exception {
		for (Category cat : categoryes) {
			if (cat.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori İsimleri Aynı Olamaz");
			}
		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}

}
