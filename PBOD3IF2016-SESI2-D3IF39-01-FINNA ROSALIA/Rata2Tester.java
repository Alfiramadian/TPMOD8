public class Rata2Tester{
	public static void main(String [] args){
		Rata2 obj1 = new Rata2();
		obj1.setBil1(10);
		obj1.setBil2(15);
		obj1.setBil3(15);
		System.out.println("PROGRAM MENGHITUNG NILAI RATA2:");
		System.out.println("Bilangan ke-1  : "+obj1.getBil1());
		System.out.println("Bilangan ke-1  : "+obj1.getBil2());
		System.out.println("Bilangan ke-1  : "+obj1.getBil3());
		System.out.println("Nilai Rata2nya : "+obj1.rata2());
	}
}