package com.example.customadapterlistview;

public class TraiCay {
    private String Name;
    private String Description;
    private int Hinh;

    public TraiCay(String name, String description, int hinh) {
        Name = name;
        Description = description;
        Hinh = hinh;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}


