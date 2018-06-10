package com.cord.jorge.mismapas;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.cord.jorge.mismapas.Pojo.*;



public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

     mapa m=new mapa();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        Intent intent2 = getIntent();

        Bundle extras = intent2.getExtras();

        final String NombreZona=extras.getString("NombreZona");
        final String  logitud =extras.getString("longitud");
        final String latitud=extras.getString("latitud");
        m.setNombre(NombreZona);
        m.setLogitud(logitud);
        m.setLatitud(latitud);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String la=""+m.getLatitud()+"";
        String lo=""+m.getLogitud()+"";
        // Add a marker in Sydney and move the camera
        LatLng  ciudad = new LatLng(Double.parseDouble(lo), Double.parseDouble(la));
        mMap.addMarker(new MarkerOptions().position(ciudad).title("Marker "+m.getNombre()+""));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ciudad));
    }
}
