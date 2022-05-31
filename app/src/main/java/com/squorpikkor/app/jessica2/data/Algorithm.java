package com.squorpikkor.app.jessica2.data;

import static com.squorpikkor.app.jessica2.data.Data._SPLIT_;

public class Algorithm {


    private final int type;//F2L
    private final String[] algorithm;
    private final String name;
    private final int id;
    private final int image;
    private final String description;
    private boolean isLearned;

    public Algorithm(int type, int image, int id, String name, String algorithm, String description) {
        this.type = type;
        this.algorithm = algorithm.split(_SPLIT_);
        this.name = name;
        this.id = id;
        this.image = image;
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public String[] getAlgorithm() {
        return algorithm;
    }

    public String getName() {
        return name;
    }

    public boolean isLearned() {
        return isLearned;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
