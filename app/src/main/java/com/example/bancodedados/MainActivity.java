package com.example.bancodedados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Criar um objeto da classe BancoDeDados
        BancoDeDados bd = new BancoDeDados(MainActivity.this, 1);

        boolean resultado = bd.cadastrar("Elizeu", "email@meu@email", "Elizeusj","123");

        if (resultado){
            Toast.makeText(MainActivity.this, "Sucesso", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(MainActivity.this, "Erro", Toast.LENGTH_SHORT).show();
        }

    }
}