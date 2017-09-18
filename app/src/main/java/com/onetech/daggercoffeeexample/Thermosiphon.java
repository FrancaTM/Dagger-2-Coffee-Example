package com.onetech.daggercoffeeexample;

import javax.inject.Inject;

/**
 * Created by francatm0 on 17/09/17.
 */

class Thermosiphon implements Pump {

    private final Heater heater;

    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
