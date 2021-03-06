
package com.iboz.react;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.modules.network.OkHttpClientProvider;
import android.util.Log;

public class RNTLSWebSocketPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      Log.d("RNTLSWebSocketPackage", "Initialising OkHttpFactory");
      OkHttpClientProvider.setOkHttpClientFactory(new RNTLSOkHttpClientFactory());
      return Arrays.<NativeModule>asList(new RNTLSWebSocketModule(reactContext));
    }

    // Deprecated from RN 0.47
    public List<Class<? extends JavaScriptModule>> createJSModules() {
      return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
      return Collections.emptyList();
    }
}