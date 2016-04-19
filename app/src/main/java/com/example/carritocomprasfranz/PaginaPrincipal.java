package com.example.carritocomprasfranz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.Toast;

public class PaginaPrincipal extends AppCompatActivity {
//private
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_menu_principal);
        setContentView(R.layout.activity_menu_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Recibimos los datos
        Intent b=getIntent();
        String[] datos_recibidos=new String[2];
        datos_recibidos=b.getStringArrayExtra("datos_usuario");
        Toast.makeText(this,"Bienvenido "+datos_recibidos[0],Toast.LENGTH_SHORT).show();


    }

}
