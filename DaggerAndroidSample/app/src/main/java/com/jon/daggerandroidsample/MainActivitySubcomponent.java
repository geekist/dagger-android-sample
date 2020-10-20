package com.jon.daggerandroidsample;

import dagger.Subcomponent;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;

/**
 * 包含有子模块
 */
@Subcomponent(modules = PicModule.class)
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<MainActivity>{ }


}


