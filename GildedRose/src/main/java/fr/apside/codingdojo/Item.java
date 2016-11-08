package fr.apside.codingdojo;

public class Item {

	private static final int MIN_QUALITY = 0;
	private static final int MAX_QUALITY = 50;

	public String name;

	public int sellIn;

	public int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public void handle() {
		
		this.sellIn = this.sellIn - 1;
		
		decrementItemQuality();

		if (this.sellIn < 0) {
			decrementItemQuality();
		}

	}

	protected void decrementItemQuality() {
		if (this.quality > MIN_QUALITY) {
			this.quality--;
		}
	}

	protected void incrementItemQuality() {
		if (this.quality < MAX_QUALITY) {
			this.quality++;
		}
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}
}
