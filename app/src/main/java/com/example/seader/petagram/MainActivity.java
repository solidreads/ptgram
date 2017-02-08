package com.example.seader.petagram;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agregarFAB();
    }
    public void agregarFAB(){
        FloatingActionButton miFAB = (FloatingActionButton) findViewById(R.id.fabMiFAB);
        //seimpre va a estar alerta a lo que se escuche
        miFAB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Toast.makeText(getBaseContext(), getResources().getString(R.string.mensaje), Toast.LENGTH_SHORT).show();
                Snackbar.make(v, getResources().getString(R.string.mensaje), Snackbar.LENGTH_SHORT)
                        .setAction(getResources().getString(R.string.texto_accion), new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.i("SNACK BAR", "Click en snack bar");
                            }
                        } ).show();
            }
        });
    }
}
