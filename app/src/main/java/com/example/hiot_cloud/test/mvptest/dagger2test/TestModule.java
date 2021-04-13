package com.example.hiot_cloud.test.mvptest.dagger2test;

import dagger.Module;
import dagger.Provides;

/**
 * dahher2 测试module类
 *
 */
@Module
public class TestModule {
    @Provides
    public ThirdObj getThiredObj(){
        return new ThirdObj();
    }
}
