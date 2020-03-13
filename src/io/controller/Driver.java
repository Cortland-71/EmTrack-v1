package io.controller;
import io.view.*;

public class Driver {

	public static void main(String[] args) {
		
		HomeWindow homeWindow = new HomeWindow();
		WestButtonController controller = new WestButtonController(homeWindow);
	}

}
