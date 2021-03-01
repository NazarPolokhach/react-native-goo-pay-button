
package com.reactlibrary;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class RNGooPayButtonModule extends SimpleViewManager<View> {
  public static final String REACT_CLASS = "RNGooPayButton";

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @SuppressLint("InflateParams")
  @Override
  protected View createViewInstance(ThemedReactContext reactContext) {
    return LayoutInflater.from(reactContext).inflate(R.layout.googlepay_button, null);
  }
}