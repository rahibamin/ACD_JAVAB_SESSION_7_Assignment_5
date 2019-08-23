package Session7.Assignment5.fishfood;

import java.util.Scanner;

public class FishFoodMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = scan.nextInt();
		
		for(int i = 1; i < x; i++){
			try {
				if(i%2 == 0){
					FoodThread t = new FoodThread();
					t.start();
					t.join();
				}else if(i %3 == 0){
					FishThread t = new FishThread();
					t.start();
					t.join();
				}else if(i % 5 == 0){
					FoodForFishThread t = new FoodForFishThread();
					t.start();
					t.join();
				}else{
					System.out.println(i);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		scan.close();
	}
}