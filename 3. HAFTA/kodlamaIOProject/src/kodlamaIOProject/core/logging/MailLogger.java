package kodlamaIOProject.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String msg) {
		System.out.println("Maile Loglandı :" + msg);

	}

	@Override
	public void log(int id) {
		System.out.println("ID Maile Loglandı: "+ id);
		
	}

}
