public class Rata2{
	int bil1;
	int bil2;
	int bil3;
	double rata2;
	
	public void setBil1 (int bil1){
		this.bil1 = bil1;
	}
	
	public void setBil2 (int bil2){
		this.bil2 = bil2;
	}
	
	public void setBil3 (int bil3){
		this.bil3 = bil3;
	}
	
	public int getBil1(){
		return bil1;
	}
	
	public int getBil2(){
		return bil2;
	}
	
	public int getBil3(){
		return bil3;
	}
	
	public double rata2(){
		rata2 = (bil1+bil2+bil3)/3;
		return rata2;
	}
	
	
}