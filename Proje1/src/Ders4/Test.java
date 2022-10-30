package Ders4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int [] soru1= {1,2,3,4};
		int [] soru2= {1,2,3,4};
		int [] soru3= {1,2,3,4};
		int [] soru4= {1,2,3,4};
		int [] soru5= {1,2,3,4};
		
		int  cevap1=0, cevap2=0, cevap3=0, cevap4=0, cevap5=0 ;
		int dogru=0;
		System.out.println("a=1 b=2 c=3 d=4");
		
		System.out.println("Hangi ulke en cok sera gazi yaymaktadir? \n A)Cin  B)Amerika C)Turkiye D)Hindistan");
		System.out.println("CEVABINIZ...");
		Scanner scan = new Scanner (System.in);
		
		cevap1=scan.nextInt();
		
		if(cevap1==soru1[0]) {
			dogru=dogru+1;
			System.out.println("Dogru cevap");
		}
		
		System.out.println("Bunlardan hangisi toksik bir sera gazidir? \n A)nitrojen B)oksijen C)metan D)karbonmonoksit ");
		System.out.println("CEVABINIZ...");
		Scanner scan2 = new Scanner (System.in);
		
		cevap2=scan2.nextInt();
		
		if(cevap2==soru2[2]) {
			dogru=dogru+1;
			System.out.println("Dogru cevap");
		}
		
		
		System.out.println("Kuresel isinmaya karsi en savunmasız hayvan hangisidir? \n A)leopar B)kutup ayisi C)deniz gergedani D)tukan");
		System.out.println("CEVABINIZ...");
		Scanner scan3 = new Scanner (System.in);
		
		cevap3=scan3.nextInt();
		
		if(cevap3==soru3[2]) {
			dogru=dogru+1;
			System.out.println("Dogru cevap");
		}
		
		
		System.out.println("Hangi gezegenin atmosferi kuresel isinma ile yok edilmektedir? \n A)jupiter  B)mars C)neptun D)venus");
		System.out.println("CEVABINIZ...");
		Scanner scan4 = new Scanner (System.in);
		
		cevap4=scan4.nextInt();
		
		if(cevap4==soru4[3]) {
			dogru=dogru+1;
			System.out.println("Dogru cevap");
		}
		
		
		System.out.println("Hangisi kuresel isinmanin bir etkisi olabilir? \n A)Ada tarimi B)Deniz seviyesinin yukselmesi C)daha fazla heyelan gerçekleşmesi D)volkanik puskurmesi");
		System.out.println("CEVABINIZ...");
		Scanner scan5 = new Scanner (System.in);
		
		cevap5=scan5.nextInt();
		
		if(cevap5==soru5[1]) {
			dogru=dogru+1;
			System.out.println("Dogru cevap");
		}
		if(dogru==5) {
			System.out.println("Mükemmel");
			dogru=dogru+1;
		}
		if(dogru==4) {
			System.out.println("cok iyi");
			dogru=dogru+1;
		}if(dogru<=3) {
			System.out.println("TEKRAR YAPMALISINIZ!!!!");
			dogru=dogru+1;
		}
	}
}
