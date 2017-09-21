package edu.sdmesa.mesaweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WebApp extends AppCompatActivity  implements View.OnClickListener
{

    Button buttonMesa;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_app);

        buttonMesa = findViewById(R.id.buttonMesa);
        buttonMesa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent m = new Intent();
    }
}
