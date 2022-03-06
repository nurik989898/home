package com.example.home;

public class Model {
    private String photo;
    private String textPost;
    private String imageProfile;
    private String textLike;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public String getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(String imageProfile) {
        this.imageProfile = imageProfile;
    }

    public String getTextLike() {
        return textLike;
    }

    public void setTextLike(String textLike) {
        this.textLike = textLike;
    }

    public Model(String photo, String textPost) {
        this.photo = photo;
        this.textPost = textPost;
    }

    public Model(String photo, String textPost, String imageProfile) {
        this.photo = photo;
        this.textPost = textPost;
        this.imageProfile = imageProfile;
    }
}
