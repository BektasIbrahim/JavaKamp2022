package kodlamaIOProject.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String msg) {
		System.out.println("Dosyaya Loglandı :" + msg);

	}

	@Override
	public void log(int id) {
		System.out.println("ID Dosyaya Loglandı: "+ id);
		
	}

}
