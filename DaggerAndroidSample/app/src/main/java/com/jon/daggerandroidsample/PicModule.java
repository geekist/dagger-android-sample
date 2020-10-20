package com.jon.daggerandroidsample;


import dagger.Module;
import dagger.Provides;

/**
 * Author by linrh , Email ruihanl@126.com, Date on 2019/8/30 0030.
 * 最终实际的module
 */
@Module
public class PicModule {

    @Provides
    Pic getPic(){
        return new Pic();
    }
}


