package fr.apside.codingdojo;

class GildedRose {
	private static final int MIN_QUALITY = 0;
	private static final int MAX_QUALITY = 50;
	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
	private static final String AGED_BRIE = "Aged Brie";
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			if (items[i].name.equals(SULFURAS)) {
				continue;
			}

			items[i].sellIn = items[i].sellIn - 1;

			if (items[i].name.equals(AGED_BRIE)) {
				handleBrie(i);

			} else if (items[i].name.equals(BACKSTAGE_PASS)) {
				incrementItemQuality(items[i]);

				if (items[i].sellIn < 10) {
					incrementItemQuality(items[i]);
				}

				if (items[i].sellIn < 5) {
					incrementItemQuality(items[i]);
				}

				if (items[i].sellIn < 0) {
					items[i].quality = 0;
				}
			} else {
				decrementItemQuality(items[i]);

				if (items[i].sellIn < 0) {
					decrementItemQuality(items[i]);
				}
			}

		}
	}

	private void handleBrie(int i) {
		incrementItemQuality(items[i]);

		if (items[i].sellIn < 0) {
			incrementItemQuality(items[i]);
		}
	}

	private void decrementItemQuality(Item item) {
		if (item.quality > MIN_QUALITY) {
			item.quality--;
		}
	}

	private void incrementItemQuality(Item item) {
		if (item.quality < MAX_QUALITY) {
			item.quality++;
		}
	}
}
