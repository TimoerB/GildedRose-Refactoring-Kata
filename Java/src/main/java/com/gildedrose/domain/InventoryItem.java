package com.gildedrose.domain;

import com.gildedrose.Item;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static java.util.stream.IntStream.range;

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

    public int qualityDecreaseAmount() {
        return 1;
    }

    public int decreaseQualityAboveZero() {
        return quality > 0 ? quality - 1 : 0;
    }

    int increaseQualityBelowMaximum() {
        if (quality < MAX_QUALITY) {
            quality++;
        }
        return quality;
    }

    public int reduceSellIn() {
        return --sellIn;
    }

    public int updateQuality() {
        range(0, qualityDecreaseAmount()).forEach(i -> quality = decreaseQualityAboveZero());
        return quality;
    }

    public int updateQualityAfterSellIn() {
        return decreaseQualityAboveZero();
    }
}
