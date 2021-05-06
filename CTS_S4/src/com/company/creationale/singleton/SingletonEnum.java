package com.company.creationale.singleton;

import java.util.ArrayList;

public enum SingletonEnum {
    INSTANCE;

    public ArrayList<String> produsList;

    public ArrayList<String> getProdusList() {
        if (produsList == null)
            produsList = new ArrayList<>();
        return produsList;
    }
}
