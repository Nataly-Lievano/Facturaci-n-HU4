package main;
import Chef.Chef;
import foodItems.FoodItems;
import Guest.Guest;

public class main {
	public static void main(String[] args) {
		System.out.println("Bienvenido al hotel de comida");
		Chef chef = new Chef("Jhoan", 1, "french");
		Guest guest1 = new Guest("Juan", 4);
		chef.TakeOrders(guest1.getName(), guest1.orderFood());
	}

}