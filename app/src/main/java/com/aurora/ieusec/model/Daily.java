package com.aurora.ieusec.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sinan on 12.11.2015.
 */
public class Daily {

    private String summary;
    private String icon;
    private List<Datum> data = new ArrayList<>();

    public String getSummary() {
        return summary;
    }

    public String getIcon() {
        return icon;
    }

    public List<Datum> getData() {
        return data;
    }
}
