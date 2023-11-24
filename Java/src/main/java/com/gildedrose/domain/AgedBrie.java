package com.gildedrose.domain;

import com.gildedrose.Item;

public class AgedBrie extends InventoryItem {

    public AgedBrie(Item item) {
        setName(item.name);
        setSellIn(item.sellIn);
        setQuality(item.quality);
    }

    @Override
    public int updateQuality() {
        return increaseQualityBelowMaximum();
    }

    @Override
    public int updateQualityAfterSellIn() {
        return increaseQualityBelowMaximum();
    }
}
