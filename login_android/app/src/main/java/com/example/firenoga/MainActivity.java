package com.example.firenoga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class MainActivity extends AppCompatActivity {

private RecyclerView mRecyclerView;

private EditText mEditTextMensaje;
private Button mBtnCrearDatos;
private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditTextMensaje=(EditText) findViewById(R.id.editTextMensaje);
        mBtnCrearDatos=(Button) findViewById(R.id.btnCrearDatos);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mBtnCrearDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = mEditTextMensaje.getText().toString();
                mDatabase.child("texto2").setValue(mensaje);
            }
        });




    }


}