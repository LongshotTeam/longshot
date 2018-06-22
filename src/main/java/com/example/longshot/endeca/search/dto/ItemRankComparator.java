package com.example.longshot.endeca.search.dto;

import java.util.Comparator;

public class ItemRankComparator  implements Comparator<Items>{

    @Override
    public int compare(Items o1, Items o2) {
        if(o1.getRank() == o2.getRank())
            return 0;
        else if(o1.getRank() > o2.getRank())
            return 1;
        else
            return -1;
    }
}
