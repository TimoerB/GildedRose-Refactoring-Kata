package com.gildedrose.domain;

import com.gildedrose.Item;

import static java.util.stream.IntStream.range;

public class ConjuredItem extends InventoryItem {

    public ConjuredItem(Item item) {
        setName(item.name);
        setSellIn(item.sellIn);
        setQuality(item.quality);
    }

    @Override
    public int updateQuality() {
        range(0, 2).forEach(i -> decreaseQualityAboveZero());
        return quality;
    }
}
