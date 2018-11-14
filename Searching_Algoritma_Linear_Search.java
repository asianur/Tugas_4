
import java.util.ArrayList;
import java.util.Scanner;

public class Searching_Algoritma_Linear_Search {

	public static void main(String[] args) {
		// PREPARING data
		ArrayList<Double> data = new ArrayList<Double>();
		data.add(67.57);
		data.add(22.21);
		data.add(10.45);
		data.add(2.1);
		data.add(76.23);
		data.add(24.10);
		data.add(8.7);
		data.add(66.12);
		data.add(8.10);
		data.add(6.7);
		data.add(4.5);

		//  DATA INPUT
		System.out.println("Data : " + data.toString());		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan kunci pencarian: ");
		double key	= s.nextDouble();
		
		int posisi = -1;//jika setelah proses pencarian posisi tetap = -1 berarti key tidak ditemukan pada data
		
		//BEGIN PENCARIAN LINEAR
		for(int i=0;i<data.size();i++){
			if(key==data.get(i)){
				posisi = i;
				break;
			}
		}
		//END OF PENCARIAN LINEAR
		
		//TAMPILKAN HASIL PENCARIAN
		if(posisi!=-1){//Jika nilai posisi tidak sama dengan -1 berarti data ditemukan
			System.out.println("KEY: "+key+" Berada di index array list: "+posisi);
		}else{
			System.out.println("KEY TIDAK DITEMUKAN");
		}	
	}

}

