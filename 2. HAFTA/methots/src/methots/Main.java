package methots;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 4, 7, 8, 10 };
		int aranacak = 10;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
			}
		}

		if (varMi) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}

		String mesaj = "";
		if (varMi) {
			mesaj = "Sayı mevcuttur: " + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayı mevcut değildir: " + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
