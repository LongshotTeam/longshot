package com.example.longshot.endeca.search.dto;

import java.util.Comparator;

public class ItemScoreComparator  implements Comparator<Items>{

    @Override
    public int compare(Items o1, Items o2) {
        if(o1.getScore() == o2.getScore())
            return 0;
        else if(o1.getScore() > o2.getScore())
            return 1;
        else
            return -1;
    }
}
