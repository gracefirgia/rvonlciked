package com.jequinn.submitagain.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Iphone  implements Parcelable {
    private String name, rilis, photo, harga, varian, warna;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRilis() {
        return rilis;
    }

    public void setRilis(String rilis) {
        this.rilis = rilis;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getVarian() {
        return varian;
    }

    public void setVarian(String varian) {
        this.varian = varian;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Iphone() {
    }

    protected Iphone(Parcel in) {
        name = in.readString();
        rilis = in.readString();
        photo = in.readString();
        harga = in.readString();
        varian = in.readString();
        warna = in.readString();
    }

    public static final Creator<Iphone> CREATOR = new Creator<Iphone>() {
        @Override
        public Iphone createFromParcel(Parcel in) {
            return new Iphone(in);
        }

        @Override
        public Iphone[] newArray(int size) {
            return new Iphone[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(rilis);
        parcel.writeString(photo);
        parcel.writeString(harga);
        parcel.writeString(varian);
        parcel.writeString(warna);
    }
}
