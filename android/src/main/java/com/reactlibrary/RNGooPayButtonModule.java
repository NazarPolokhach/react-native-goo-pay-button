
package com.reactlibrary;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNGooPayButtonModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext context;

  public RNGooPayButtonModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.context = reactContext;
    this.RNGooPayButtonModule(reactContext);
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