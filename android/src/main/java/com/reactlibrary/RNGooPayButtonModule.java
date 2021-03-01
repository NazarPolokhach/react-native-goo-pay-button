
package com.reactlibrary;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNGooPayButtonModule extends ReactContextBaseJavaModule {

  public RNGooPayButtonModule(ReactApplicationContext reactContext, ReactApplicationContext reactContext1) {
    super(reactContext);
  }

  @SuppressLint("InflateParams")
  public View RNGooPayButtonModule(ReactApplicationContext reactContext) {
    return LayoutInflater.from(reactContext).inflate(R.layout.googlepay_button, null);
  }

  @Override
  public String getName() {
    return "RNGooPayButton";
  }
}