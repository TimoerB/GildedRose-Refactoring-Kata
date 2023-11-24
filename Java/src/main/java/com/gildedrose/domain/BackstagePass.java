package com.gildedrose.domain;

import com.gildedrose.Item;

public class BackstagePass extends InventoryItem {

    public BackstagePass(Item item) {
        setName(item.name);
        setSellIn(item.sellIn);
        setQuality(item.quality);
    }

    @Override
    public int updateQuality() {
        increaseQualityBelowMaximum();

        // increase backstage pass further when sellIn date approaches
        return increaseBackstagePass();
    }

    @Override
    public int updateQualityAfterSellIn() {
        return 0;
    }

    private int increaseBackstagePass() {
        if (sellIn < 10) {
            increaseQualityBelowMaximum();

            if (sellIn < 5) {
                increaseQualityBelowMaximum();
            }
        }
        return quality;
    }
}
