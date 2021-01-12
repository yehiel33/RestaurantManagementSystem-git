package service;

/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents  object in type of Drink that inherits from Item.
 */

import enums.Volume;

public class Drink extends Item {

	public Volume volume;
	/**
	 * 
	 * @param itemId represents the id of the item
	 * @param itemName represents the name of the item
	 * @param price represents the price of the item
	 * @param volume represents the volume of the drink (size)
	 */
	public Drink (int itemId, String itemName, double price, Volume volume) { //parameter constructor
		super(itemId, itemName, price);
		this.volume = volume;
	}

	public Volume getVolume() { // Getters and Setters
		return volume;
	}

	public void setVolume(Volume volume) {
		this.volume = volume;
	}

	@Override // toString method
	public String toString() {
		return super.toString() + " " + volume;
	}
	
}
