package com.objectbright.daggerretrofit;

import android.app.Application;

import com.objectbright.daggerretrofit.dagger.component.DaggerNetComponent;
import com.objectbright.daggerretrofit.dagger.component.NetComponent;
import com.objectbright.daggerretrofit.dagger.module.AppModule;
import com.objectbright.daggerretrofit.dagger.module.NetModule;

public class App extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
