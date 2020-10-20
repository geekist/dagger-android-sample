package com.jon.daggerandroidsample;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        MainActivityModule.class,
        AndroidSupportInjectionModule.class})
public interface MyApplicationComponent {
    void inject(MyApplication application);

}
