package fr.apside.codingdojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest {

	@Test
	public void goldenTest() {
		Item[] items = new Item[] { new Item("foo", 0, 0) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals("foo, -1, 0", app.items[0].toString());
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		System.out.println(app.items[0].toString());
		assertEquals("foo, -5, 0", app.items[0].toString());
	}

	@Test
	public void goldenTest2() {
		Item[] items = new Item[] { new Item("Aged Brie", 42, 5), new Item("foo", 10, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", 16, 4),
				new Item("Sulfuras, Hand of Ragnaros", 100, 12) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();

		assertEquals("Aged Brie, 41, 6", app.items[0].toString());
		assertEquals("foo, 9, 19", app.items[1].toString());
		assertEquals("Backstage passes to a TAFKAL80ETC concert, 15, 5", app.items[2].toString());
		assertEquals("Sulfuras, Hand of Ragnaros, 100, 12", app.items[3].toString());

		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();

		assertEquals("Aged Brie, 37, 10", app.items[0].toString());
		assertEquals("foo, 5, 15", app.items[1].toString());
		assertEquals("Backstage passes to a TAFKAL80ETC concert, 11, 9", app.items[2].toString());
		assertEquals("Sulfuras, Hand of Ragnaros, 100, 12", app.items[3].toString());

		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();

		assertEquals("Aged Brie, 26, 21", app.items[0].toString());
		assertEquals("foo, -6, 0", app.items[1].toString());
		assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 35", app.items[2].toString());
		assertEquals("Sulfuras, Hand of Ragnaros, 100, 12", app.items[3].toString());

		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();
		app.updateQuality();

		// for (int idx = 0; idx < app.items.length; idx++) {
		// System.out.println(
		// String.format("assertEquals(\"%s\", app.items[%s].toString());",
		// app.items[idx].toString(), idx));
		// }

		assertEquals("Aged Brie, 21, 26", app.items[0].toString());
		assertEquals("foo, -11, 0", app.items[1].toString());
		assertEquals("Backstage passes to a TAFKAL80ETC concert, -5, 0", app.items[2].toString());
		assertEquals("Sulfuras, Hand of Ragnaros, 100, 12", app.items[3].toString());

	}

	@Test
	public void goldenTest3() {
		Item[] items = new Item[] { new Item("Aged Brie", 1, 40) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		app.updateQuality();

		assertEquals("Aged Brie, -1, 43", app.items[0].toString());
	}

}
