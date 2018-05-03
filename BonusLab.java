import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BonusLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// prompt and user input in
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a Fruit");
		String name = input.next();

		// HashMap Method inserted
		HashMap<String, Double> list = new HashMap<>();

		// Fruit and prices at the market
		list.put("bannanas", 1.99);
		list.put("apples", 3.99);
		list.put("grapes", 4.99);
		list.put("avacodo", 9.99);
		list.put("orange", 6.99);
		list.put("plums", 2.99);
		list.put("watermelon", 8.00);
		list.put("strawberries", 5.99);

		// enhanced for loop used to find fruit
		for (String product : list.keySet()) {

			System.out.println(product + " - " + list.get(product));

		}
		// fruit chosen by user and fruit available and the price
		if (list.containsKey(name)) {
			System.out.println(name + "    " + list.get(list));
		} else {
			System.out.println("No such product exists here");

		}
		ArrayList<String> orderList = new ArrayList<>();
		orderList.add(name);
		ArrayList<Double> priceList = new ArrayList<>();
		priceList.add(list.get(name));

		System.out.println(orderList + "   ");
		System.out.print(priceList);

		System.out.println("Would you like anything else? (yes/no");
		for (int i = 0; i < orderList.size(); i++) {
			System.out.println(orderList.get(i));
		}
		for (int i = 0; i < priceList.size(); i++) {
			System.out.print(priceList.get(i));
		}

	}

}
