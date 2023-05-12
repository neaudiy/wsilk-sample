package com.wuba.wsilk.sample.factory;

import javax.annotation.*;

import com.wuba.wsilk.sample.factory.GreySilk;

import com.wuba.wsilk.sample.factory.WhiteSilk;

import com.wuba.wsilk.sample.factory.YellowSilk;


@Generated(value="com.wuba.wsilk.sample.factory.SilkFactory")
public class SilkFactory extends SilkFactorySupport{

}

class SilkFactorySupport{

    public static Silk create(String option){
        if("g".equals(option)){
            return new GreySilk(option);
        }        else if("w".equals(option)){
            return new WhiteSilk(option);
        }        else if("y".equals(option)){
            return new YellowSilk(option);
        }        return null;
    }

}

