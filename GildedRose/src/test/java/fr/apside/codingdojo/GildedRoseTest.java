package fr.apside.codingdojo;

import static org.junit.Assert.*;

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
        		new Item("Backstage passes to a TAFKAL80ETC concert", 16, 4), new Item("Sulfuras, Hand of Ragnaros", 100, 12)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        
        System.out.println("assertEquals("+app.items[0].toString()+", app.items[0].toString()");
        
        assertEquals("foo, -1, 0", app.items[0].toString());
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        System.out.println(app.items[0].toString());
        assertEquals("foo, -5, 0", app.items[0].toString());
    }

}
