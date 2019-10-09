package com.example.movie_app;

public class ItemData {
     int photo;
     String txt1 ,txt2;

    public ItemData(int photo, String txt1, String txt2) {
        this.photo = photo;
        this.txt1 = txt1;
        this.txt2 = txt2;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }
}
