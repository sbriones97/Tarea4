package com.iteso.test.beans;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemProduct {
    private int image ;
    private String title;
    private String store;
    private String location;
    private String phone;
    private String descripction;
    private int code;

    public ItemProduct(){
        setImage(0);
        setDescripction("");
        setTitle("");
        setPhone("");
        setLocation("");
        setStore("");
        code =0;
    }

    public ItemProduct(Parcel in){
        image = in.readInt();
        title = in.readString();
        store = in.readString();
        location = in.readString();
        phone = in.readString();
        descripction = in.readString();
        code = in.readInt();
    }

    public ItemProduct(int image, String title, String store, String location, String phone, String descripction, int code) {
        this.image = image;
        this.title = title;
        this.store = store;
        this.location = location;
        this.phone = phone;
        this.descripction = descripction;
        this.code = code;
    }

    @Override
    public String toString() {
        return "ItemProduct{" +
                "image=" + image +
                ", title='" + title + '\'' +
                ", store='" + store + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", descripction='" + descripction + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt( image );
        dest.writeString(title);
        dest.writeString(store);
        dest.writeString(location);
        dest.writeString(phone);
        dest.writeString(descripction);
        dest.writeInt(code);
    }
    public static final Parcelable.Creator<ItemProduct> CREATOR= new Parcelable.Creator<ItemProduct>() {
        @Override
        public ItemProduct createFromParcel(Parcel source) {
        // using parcelable constructor
            return new ItemProduct (source);
        }
        @Override
        public ItemProduct[] newArray(int size) {
            return new ItemProduct[size];
        }
    };



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescripction() {
        return descripction;
    }

    public void setDescripction(String descripction) {
        this.descripction = descripction;
    }

    public int getCode() { return code; }

    public void setCode(int code) { this.code = code; }
}


