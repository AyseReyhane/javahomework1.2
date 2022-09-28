package hmwk1;

public class Main {

	public static void main(String[] args) {

		// Hello!

		System.out.println("Merhaba Java");
		System.out.println("Merhaba Java 2");

		// Variables

		int ogrenciSayisi = 12;
		String mesaj = "Öğrenci sayısı : ";
		System.out.println("Öğrenci sayısı : " + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + "9");
		System.out.println("Öğrenci sayım : 9");

		// Data Types

		int sayi = 12;
		sayi = 13333333;
		byte sayi1 = 12;
		sayi1 = 127;
		double sayi2 = 12.5;
		char karakter = 'A';
		boolean dogruMu = false;

		// Conditionals

		int sayi3 = 19;

		if (sayi3 < 20) {
			System.out.println("Sayı 20 den küçüktür");
		}

		if (sayi3 < 15) {
			System.out.println("Sayı 20 den küçüktür");
		} else {
			System.out.println("Sayı 20 den küçük değildir.");
		}

		if (sayi3 < 15) {
			System.out.println("Sayı 20 den küçüktür.");
		} else if (sayi3 == 20) {
			System.out.println("Sayı 20 ye eşittir.");
		} else {
			System.out.println("Sayı 20 den büyüktür.");
		}

		// RecapDemo1

		int sayim1 = 24;
		int sayim2 = 25;
		int sayim3 = 2;
		int enBuyuk = sayim1;

		if (enBuyuk < sayim2) {
			enBuyuk = sayim2;
		}

		if (enBuyuk < sayim3) {
			enBuyuk = sayim3;
		}
		System.out.println("En büyük = " + enBuyuk);

		// Switch Demo

		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

		// Loop Demo

		// for
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti.");

		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti.");

		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti.");

		// while
		int j = 1;
		while (j < 10) {
			System.out.println(j);
			j++;
		}
		System.out.println("While Döngüsü Bitti.");

		// do-while
		int z = 1;
		do {
			System.out.println(z);
			z += 2;
		} while (z < 10);
		System.out.println("Do-While Döngüsü Bitti.");

		int k = 100;
		do {
			System.out.println(k);
			k += 2;
		} while (k < 10);
		System.out.println("Do-While Döngüsü Bitti.");

		// Arrays Demo

		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println("------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		System.out.println("------------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		// Recap Demo2

		double[] mylist = { 1.2, 6.3, 4.3, 5.6 };
		double total = 0;
		double max = mylist[0];
		for (double number : mylist) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam = " + total);
		System.out.println("En Büyük = " + max);

		// Multi Dimensional Array

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";

		for (int i = 0; i <= 2; i++) {
			System.out.println("-------------");
			for (int h = 0; h <= 2; h++) {
				System.out.println(sehirler[i][h]);
			}
		}

		// Strings Demo
		String message = "Bugün hava çok güzel.";
		System.out.println(message);

		System.out.println("Eleman Sayısı : " + message.length());
		System.out.println("5. eleman : " + message.charAt(4));
		System.out.println(message.concat("Yaşasın"));
		System.out.println(message.startsWith("A"));
		System.out.println(message.endsWith("."));
		char[] karakterler = new char[5];
		message.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(message.indexOf('a'));
		System.out.println(message.indexOf("av"));
		System.out.println(message.lastIndexOf("e"));
		System.out.println(message.lastIndexOf("a"));

		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);
		System.out.println(message.substring(2, 5));

		for (String kelime : message.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());

		// Mini Proje Asal Sayı

		int number1 = 25;
		int remainder = number1 % 2;
		System.out.println(remainder);
		boolean isPrime = true;

		if (number1 == 1) {
			System.out.println("Sayı asal değildir");
			return;
		}

		if (number1 < 1) {
			System.out.println("Geçersiz sayı");
		}

		for (int i = 2; i < number1; i++) {
			if (number1 % i == 0) {
				isPrime = false;
			}
        }

		if (isPrime) {
			System.out.println("Sayı asaldır");
		} else {
			System.out.println("Sayı asal değildir");
		}
		
		// Sesli Harfler
		
		char harf = 'E';
		switch (harf) {
		case 'A' :
		case 'I' :
		case 'O' :
		case 'U' :
			System.out.println("Kalın sesli harf");
			break;
			default:
				System.out.println("İnce sesli harf");
		}
		
		// Mükemmel Sayı
		
		int number2 = 28;
		int total1 = 0;
		
		for(int i=1;i<number2;i++) {
			if(number2 % i == 0) {
				total1 = total1 + i ;
			}
		}
		
		if(total1 == number2) {
			System.out.println("Mükemmel sayıdır.");
		}else {
			System.out.println("Mükemmel sayı değildir");
		}
		
		// Arkadaş Sayılar
		    // 220-284
		
		int say1 = 220;
		int say2 = 284;
		int total2 = 0;
		int total3 = 0;
		
		for(int i=1 ; i < say1; i ++){
			if(say1 % i == 0){
				total2 = total2 + i;
			}
		}
		for(int i=1 ; i < say2; i ++){
			if(say2 % i == 0){
				total3 = total3 + i;
			}
		}
		
		if(say1==total3 && say2==total2 ) {
			System.out.println("Bu iki sayı arkadaştır");
		}else {
			System.out.println("Bu iki sayı arkadaş değildir");
		}

	}

}
