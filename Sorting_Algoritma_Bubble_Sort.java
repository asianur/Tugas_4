import java.util.ArrayList;

public class Sorting_Algoritma_Bubble_Sort {
	
	public static void main(String[] args) {	
		
		//PREPARING data input
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
		
		//CETAK DATA INPUT
		System.out.println("Data Input : "+data.toString());
		ArrayList<Double> output = sort(data);	
	}
	public static ArrayList<Double> sort(ArrayList<Double> data){
		int swapped = 1;
		for (int i = data.size()-1; i >= 0 && data.size()-1 >= swapped; i--) {
			swapped = 0;
			for (int j = 0; j <= i-1; j++) {
				if (data.get(j) > data.get(j + 1)) {
					double temp = data.get(j);
					data.set(j, data.get(j+1));
					data.set(j+1, temp);
					swapped = 1;
				}
			}
			System.out.print("\nstep-"+i+": ");
			for(int k=0; k<data.size();k++) {
				System.out.print(data.get(k)+" ");
			}
		}
		// END OF BEGIN BUBBLE SORT
		
		// CETAK DATA AKHIR
		System.out.print("\nDATA HASIL SORTING : ");
		for(int k=0;k<data.size();k++) {
			System.out.print(data.get(k)+" ");
		}
		return data;
	}		
}
