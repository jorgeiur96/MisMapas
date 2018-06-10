package com.cord.jorge.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  Zona1(View V){
        Intent intent=new Intent(MainActivity.this,MapsActivity.class);
        intent.putExtra("NombreZona","Centro comercial Buena Vista");
        intent.putExtra("longitud","8.778949");
        intent.putExtra("latitud","-75.86154");
        startActivity(intent);
    }
    public void  Zona2(View V){
        Intent intent=new Intent(MainActivity.this,MapsActivity.class);
        intent.putExtra("NombreZona","ronda del sinu");
        intent.putExtra("longitud","8.754795");
        intent.putExtra("latitud","-75.889199");
        startActivity(intent);
    }
    public void  Zona3(View V){
        Intent intent=new Intent(MainActivity.this,MapsActivity.class);
        intent.putExtra("NombreZona","Centro comercial Nuestro");
        intent.putExtra("longitud","8.743353");
        intent.putExtra("latitud","-75.867097");
        startActivity(intent);
    }
    public void  Zona4(View V){
        Intent intent=new Intent(MainActivity.this,MapsActivity.class);
        intent.putExtra("NombreZona","Centro comercial Alamedas");
        intent.putExtra("longitud","8.762769");
        intent.putExtra("latitud","-75.872869");
        startActivity(intent);
    }

}
