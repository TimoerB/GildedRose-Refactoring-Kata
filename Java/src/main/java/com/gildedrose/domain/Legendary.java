package com.gildedrose.domain;

import com.gildedrose.Item;

public class Legendary extends InventoryItem {

    public Legendary(Item item) {
        setName(item.name);
        setSellIn(item.sellIn);
        setQuality(item.quality);
    }

    @Override
    public int updateQualityAfterSellIn() {
        return quality;
    }

    @Override
    public int decreaseQualityAboveZero() {
        return quality;
    }

    @Override
    public int reduceSellIn() {
        return sellIn;
    }
}
