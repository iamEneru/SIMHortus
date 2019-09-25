package com.vbadapts.simhortus;

public class Model {

    private int plant_image;
    private String plant_title;
    private String plant_desc;

    public Model(int plant_image, String plant_title, String plant_desc){
        this.plant_image = plant_image;
        this.plant_title = plant_title;
        this.plant_desc = plant_desc;
    }

    public int getPlant_image() {
        return plant_image;
    }

    public void setPlant_image(int plant_image) {
        this.plant_image = plant_image;
    }

    public String getPlant_title() {
        return plant_title;
    }

    public void setPlant_title(String plant_title) {
        this.plant_title = plant_title;
    }

    public String getPlant_desc() {
        return plant_desc;
    }

    public void setPlant_desc(String plant_desc) {
        this.plant_desc = plant_desc;
    }
}
