package com.onetech.daggercoffeeexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by francatm0 on 17/09/17.
 */

@Module(includes = PumpModule.class)
class DripCoffeeModule {
    @Provides @Singleton Heater providerHeater() {
        return new ElectricHeater();
    }
}
