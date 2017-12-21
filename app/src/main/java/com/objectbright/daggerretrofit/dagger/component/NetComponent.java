package com.objectbright.daggerretrofit.dagger.component;

import com.objectbright.daggerretrofit.dagger.module.AppModule;
import com.objectbright.daggerretrofit.dagger.module.NetModule;
import com.objectbright.daggerretrofit.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
    // void inject(MyFragment fragment);
    // void inject(MyService service);
}
