package com.jon.daggerandroidsample;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

/**
 * 指定含有下级的模块
 */
@Module( subcomponents = MainActivitySubcomponent.class)
public abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity.class)
    abstract AndroidInjector.Factory<?>  bindYourAndroidInjectorFactory(MainActivitySubcomponent.Factory factory);

}


