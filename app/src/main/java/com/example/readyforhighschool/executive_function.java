package com.example.readyforhighschool;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.webkit.WebViewAssetLoader;
import androidx.appcompat.app.AppCompatActivity;
import androidx.webkit.WebViewClientCompat;


public class executive_function extends AppCompatActivity {
    final WebViewAssetLoader assetLoader = new WebViewAssetLoader.Builder()
            .addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(this))
            .build();


    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // standard url loading into webview.
        super.onCreate(savedInstanceState);

        setContentView(R.layout.executive_function);

        mWebView = (WebView) findViewById(R.id.exec_function_webview);




        // standard
        mWebView.setWebViewClient(new WebViewClientCompat() {
            @Override
            @RequiresApi(21)
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                return assetLoader.shouldInterceptRequest(request.getUrl());
            }
        @Override
        @SuppressWarnings("deprecation") // for API < 21
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return assetLoader.shouldInterceptRequest(Uri.parse(url));
            }
    });
        WebSettings webViewSettings = mWebView.getSettings();
        mWebView.getSettings().setJavaScriptEnabled(true);
        // Setting this off for security. Off by default for SDK versions >= 16.
        webViewSettings.setAllowFileAccessFromFileURLs(false);
        // Off by default, deprecated for SDK versions >= 30.
        webViewSettings.setAllowUniversalAccessFromFileURLs(false);
        // Keeping these off is less critical but still a good idea, especially if your app is not
        // using file:// or content:// URLs.
        webViewSettings.setAllowFileAccess(false);
        webViewSettings.setAllowContentAccess(false);



        mWebView.loadUrl("https://appassets.androidplatform.net/assets/cognitive-testbattery-main/index.html");
    }
}

/**
public class executive_function extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.executive_function);
        WebView webview = findViewById(R.id.exec_function_webview);

        //webview.getSettings().setJavaScriptEnabled(true);
        WebSettings websettings = webview.getSettings();

        //websettings.setJavaScriptEnabled(true);
        //After configuring all the required settings then you load your url
        webview.loadUrl("file:///android_asset/test.html");

        //webview.setWebViewClient(new webViewClient());
    }
}
**/