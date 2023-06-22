package com.example.pm2e10645;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pm2e10645.Configuracion.SQLiteConexion;
import com.example.pm2e10645.Configuracion.Transacciones;

public class ActivityInicial extends AppCompatActivity {

    EditText pais, nombres, telefono, nota;
    Button btnsalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        pais = findViewById(R.id.pais);
        nombres = findViewById(R.id.nombres);
        telefono = findViewById(R.id.telefono);
        nota = findViewById(R.id.nota);

        btnsalvar = (Button) findViewById(R.id.btnsalvar);

        btnsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddPerson();
            }
        });

    }

    private void AddPerson()
    {
        SQLiteConexion conexion = new SQLiteConexion(this, Transacciones.NameDatabase,null,1);
        SQLiteDatabase db = conexion.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(Transacciones.pais, pais.getText().toString());
        valores.put(Transacciones.nombres, nombres.getText().toString());
        valores.put(Transacciones.telefono, telefono.getText().toString());
        valores.put(Transacciones.nota, nota.getText().toString());

        Long result = db.insert(Transacciones.tablaPersonas, Transacciones.id, valores);
        Toast.makeText(getApplicationContext(), "Registro ingresado : " + result.toString(),Toast.LENGTH_LONG ).show();

        db.close();

        CleanScreen();

    }

    private void CleanScreen()
    {
        pais.setText("");
        nombres.setText("");
        telefono.setText("");
        nota.setText("");
    }
}