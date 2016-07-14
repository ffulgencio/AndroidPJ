package com.example.ffulgencio.escribedb;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnGuardar;
    EditText edDescripcion,edCategoria, edPrecio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edDescripcion = (EditText) findViewById(R.id.edDescripcion);
        edCategoria   = (EditText) findViewById(R.id.ed)

        btnGuardar = (Button) findViewById(R.id.btnGuardar);

        //btnGuardar.setOnClickListener();


    }

    public void GuardarRegistro(String Descripcion, String categoria,String precio){
        DataBaseHelper database = new DataBaseHelper(this,"INVENTARIO",null,1);
        SQLiteDatabase db = database.getWritableDatabase();



    }


}
