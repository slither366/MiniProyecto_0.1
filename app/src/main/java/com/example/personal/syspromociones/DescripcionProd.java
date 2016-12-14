package com.example.personal.syspromociones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DescripcionProd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descripcion_prod);
    }

    public void volver(View v) {
        Intent inte = new Intent(this, Main.class);
        startActivity(inte);
    }

}
