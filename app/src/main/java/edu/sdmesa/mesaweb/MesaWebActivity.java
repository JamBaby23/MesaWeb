package edu.sdmesa.mesaweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MesaWebActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa_web);

        WebView mesaView = (WebView) findViewById(R.id.webViewMesa);
        mesaView.loadUrl("*http://www.sdmesa.edu/*");
    }
}
