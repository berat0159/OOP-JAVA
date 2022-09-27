package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//aranacakSayi();
		
		//int toplam=topla(5,5);
		int toplam2=topla2(2,4,9,6,7,4);
		
	}
	
	
	public static int topla2(int...sayilar) {
		
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
	public static int topla(int sayi1,int sayi2) {
		
		return sayi1+sayi2;
	}
	
	
	
	
	
	/*public static void aranacakSayi() {
		int[] sayilar= new int[] {1,9,5,7,8};
		
		int aranacak=6;
		boolean varMı=false;
		
		for(int sayi:sayilar) {
			
			if(sayi==aranacak) {
				varMı=true;
			}
		}
		if(varMı) {
			System.out.println("Sayi Mevcuttur"+" "+aranacak);
			
		}else {
			System.out.println("Sayi Mevcut Degildir"+"  "+aranacak);
		}
	}*/-

}
