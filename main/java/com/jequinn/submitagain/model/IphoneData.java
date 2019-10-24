package com.jequinn.submitagain.model;

import android.graphics.drawable.Drawable;

import com.jequinn.submitagain.R;

import java.util.ArrayList;

public class IphoneData {

    public static String[][] data = new String[][] {

            {"iPhone 11",
                    "Rilis: 20 September 2019",
                    "https://shop.ee.co.uk/content/dam/everything-everywhere/images/SHOP/Devices/apple/iPhone_11/affilliates_iPhone_11_Purple_800x800.jpg",
                    "Harga: Rp 11.700.000 / 12.400.000 / 14.100.000",
                    "Varian: 64GB / 128GB / 256GB",
                    "Warna: Hijau Mint, Kuning, Midnight Green, Ungu, Hitam, Merah, Space Grey, Putih, Silver, Gold"},
            {"iPhone X",
                    "Rilis: 22 September 2018",
                    "data:image/jpeg;base64,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",
                    "Harga: Rp 13.850.000 / 15.800.000",
                    "Varian: 64GB / 256GB",
                    "Warna: Space Grey, Silver, Gold, White"},
            {"iPhone 8",
                    "Rilis: 22 September 2017",
                    "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone8-gold-select-2018?wid=940&hei=1112&fmt=png-alpha&qlt=80&.v=1550795416637",
                    "Harga: Rp 8.750.000 / 12.200.000",
                    "Varian: 64GB / 256GB",
                    "Warna: RoseGold, Gold, White, Space Grey, Black"},
            {"iPhone 7",
                    "Rilis: 16 September 2016",
                    "https://images.morele.net/i1064/1021730_4_i1064.jpg",
                    "Harga: Rp 5.500.000 / 6.459.000 / 8.850.000",
                    "Varian: 32GB / 128GB / 256GB",
                    "Warna: RoseGold, Gold, White, Space Grey, Black"},
            {"iPhone SE",
                    "Rilis: 31 Maret 2016",
                    "https://images-na.ssl-images-amazon.com/images/I/61mK5UcYp-L._SL1075_.jpg",
                    "Harga: Rp 5.000.000",
                    "Varian: 32GB",
                    "Warna: Gold, Silver, RoseGold, SpaceGrey"},
            {"iPhone 6S",
                    "Rilis: 25 September 2015",
                    "https://images-na.ssl-images-amazon.com/images/I/61Kli1qHbiL._SX342_.jpg",
                    "Harga: Rp 3.200.000 / 3.500.000 / 3.900.000",
                    "Varian: 16GB/ 64GB / 128GB",
                    "Warna: RoseGold, Gold, Silver, SpaceGrey"},
            {"iPhone 6",
                    "Rilis: 19 September 2014",
                    "https://zdnet4.cbsistatic.com/hub/i/r/2014/11/25/3e125a37-7480-11e4-a0a6-d4ae52e95e57/resize/1200x900/b95672e1669c6f9c64437449234cce53/apple-iphone-6-plus-64gb-review-a-classy-iphablet.jpg",
                    "Harga: Rp 2.700.000 / 2.900.000 / 3.000.000 / 3.200.000",
                    "Varian: 16GB / 32GB / 64GB / 128GB",
                    "Warna: Gold, Silver, SpaceGrey"},
            {"iPhone 5S",
                    "Rilis: 20 September 2013",
                    "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full/apple_apple-iphone-5s-32-gb-gray-smartphone_full01.jpg",
                    "Harga: Rp 1.699.000 / 2.175.000 / 2.589.000",
                    "Varian: 16GB / 32GB / 64GB",
                    "Warna: Space Gray, Silver, Gold"},
            {"iPhone 5C",
                    "Rilis: 20 September 2013",
                    "https://www.mobiledokan.co/wp-content/uploads/2019/02/Apple-iPhone-5c.jpg",
                    "Harga: Rp 1.250.000 / 1.399.000 / 1.750.000",
                    "Varian: 8GB / 16GB / 32GB",
                    "Warna: White, Pink, Yellow, Blue, Green"},
            {"iPhone 5",
                    "Rilis: 21 September 2012",
                    "https://www.einfo.co.nz/media/catalog/product/cache/80c7c8f52d609acf4bfb1cf663840192/6/1/61lyvsbbtql._sx385_.jpg",
                    "Harga: Rp 1.000.000 / 1.400.000",
                    "Varian: 8GB / 16GB",
                    "Warna: Space Gray, Silver, Gold"}
    };

    public static ArrayList<Iphone> getListData(){
        Iphone iphone;
        ArrayList<Iphone> list = new ArrayList<>();

        for (String[] mData : data){
            iphone = new Iphone();
            iphone.setName(mData[0]);
            iphone.setRilis(mData[1]);
            iphone.setPhoto(mData[2]);
            iphone.setHarga(mData[3]);
            iphone.setVarian(mData[4]);
            iphone.setWarna(mData[5]);

            list.add(iphone);
        }
        return list;
    }
}
