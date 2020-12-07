package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<>();
		farm.add(new Cat());
		farm.add(new Chicken());
		farm.add(new Chicken());
		farm.add(new Chicken());
		farm.add(new Doggo());
		farm.add(new Fish());
		
		for(int i = 0; i < farm.size(); i++) {
			System.out.println(farm.get(i).makeNoise());
		}
	}
}
