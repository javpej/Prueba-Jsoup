package com.example.javi.pruebajsoup;

/**
 * Created by Javi on 25/5/17.
 */

public class Item {

    String sTitle;
    String sDesc;
    String sImgUrl;
    String sUrl;

    public Item(String sTitle, String sDesc, String sImgUrl, String sUrl) {
        this.sTitle = sTitle;
        this.sDesc = sDesc;
        this.sImgUrl = sImgUrl;
        this.sUrl = sUrl;
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }

    public String getsImgUrl() {
        return sImgUrl;
    }

    public void setsImgUrl(String sImgUrl) {
        this.sImgUrl = sImgUrl;
    }

    public String getsUrl() {
        return sUrl;
    }

    public void setsUrl(String sUrl) {
        this.sUrl = sUrl;
    }
}
