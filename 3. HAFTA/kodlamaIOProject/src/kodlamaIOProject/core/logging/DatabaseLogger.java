package kodlamaIOProject.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String msg) {
		System.out.println("Veritabanına Loglandı :" + msg);

	}

	@Override
	public void log(int id) {
		System.out.println("ID Veritabanına Loglandı: "+ id);
		
	}

}
