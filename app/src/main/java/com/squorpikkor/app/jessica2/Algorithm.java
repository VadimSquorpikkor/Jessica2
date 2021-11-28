package com.squorpikkor.app.jessica2;

public class Algorithm {


    private int type;//F2L
    private String algorithm;
    private String name;
    private boolean isLearned;
    private int id;
    private int image;

    public Algorithm(int type, String algorithm, String name, int id, int image) {
        this.type = type;
        this.algorithm = algorithm;
        this.name = name;
        this.id = id;
        this.image = image;
    }

    public int getType() {
        return type;
    }

    public String getAlgorithm() {
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
}
