package com.wuba.wsilk.sample.config;

import javax.annotation.*;


@Generated(value="com.wuba.wsilk.sample.config.Bundle")
public abstract class Bundle{

    private static Bundle BUNDLE=null;

    public abstract String title_good_gg();

    public abstract String title_name();

    public static void setBundle(String key){
        if("en".equals(key)){
            BUNDLE=new Bundle_en();
        }else{
            BUNDLE=new Bundle_cn();
        }
    }

    public static Bundle get(){
        return BUNDLE;
    }

    public static final String TITLE_GOOD_GG(){
        return BUNDLE.title_good_gg();
    }

    public static final String TITLE_NAME(){
        return BUNDLE.title_name();
    }

}

