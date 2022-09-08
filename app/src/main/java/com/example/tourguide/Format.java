package com.example.tourguide;

public class Format {
    private String Number;
    private String Place_Name;
    private int ImageResourceID;


    public Format(String number, String placename, int imageresourceID) {
        Number = number;
        Place_Name = placename;
        ImageResourceID = imageresourceID;
    }

    public String getNumber(){
        return Number;
    }

    public String getPlace_Name(){
        return Place_Name;
    }

    public int getImageResourceID(){
        return ImageResourceID;
    }

}
