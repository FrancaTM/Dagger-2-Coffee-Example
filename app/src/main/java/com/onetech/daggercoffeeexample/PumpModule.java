package com.onetech.daggercoffeeexample;

import dagger.Binds;
import dagger.Module;

/**
 * Created by francatm0 on 17/09/17.
 */

@Module
abstract class PumpModule {
    @Binds
    abstract Pump providePump(Thermosiphon pump);
}
