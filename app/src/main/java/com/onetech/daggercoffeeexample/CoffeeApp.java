package com.onetech.daggercoffeeexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by francatm0 on 17/09/17.
 */

public class CoffeeApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeShop coffeeShop = DaggerCoffeeApp_CoffeeShop.builder().build();
        coffeeShop.maker().brew();
    }

    @Singleton
    @Component(modules = { DripCoffeeModule.class })
    public interface CoffeeShop {
        CoffeeMaker maker();
    }

//    public static void main(String[] args) {
//        CoffeeShop coffeeShop = DaggerCoffeeApp_CoffeeShop.builder().build();
//        coffeeShop.maker().brew();
//    }
}
