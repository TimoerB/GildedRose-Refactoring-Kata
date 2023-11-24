package com.gildedrose.domain;

import com.gildedrose.Item;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
public class InventoryItem {
    private static final int MAX_QUALITY = 50;

    public String name;
    public int quality;
    public int sellIn;

    public InventoryItem(Item item) {
        setName(item.name);
        setSellIn(item.sellIn);
        setQuality(item.quality);
    }

    public int decreaseQualityAboveZero() {
        return quality > 0 ? --quality : 0;
    }

    int increaseQualityBelowMaximum() {
        return quality < MAX_QUALITY ? ++quality : quality;
    }

    public int reduceSellIn() {
        return --sellIn;
    }

    public int updateQuality() {
        return decreaseQualityAboveZero();
    }

    public int updateQualityAfterSellIn() {
        return decreaseQualityAboveZero();
    }
}
