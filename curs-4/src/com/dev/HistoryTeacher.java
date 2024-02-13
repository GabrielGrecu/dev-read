package com.dev;

import com.dev.WisdomWordsService;

public class HistoryTeacher implements ITeacher {
    private WisdomWordsService wisdomService;

    public HistoryTeacher(WisdomWordsService wisdomWordsService) {
        this.wisdomService = wisdomService;
    }

    @Override
    public String getHomeWork() {
        return "learn abour ww1";
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }
}
