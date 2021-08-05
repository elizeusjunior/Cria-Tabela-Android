package com.example.bancodedados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BancoDeDados extends SQLiteOpenHelper {
    private final String criaTabela = "CREATE TABLE usuario (" +
            "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "nome VARCHAR(60), " +
            "email VARCHAR(80), " +
            "usuario VARCHAR(40) UNIQUE, " +
            "senha VARCHAR(70) );";

    public BancoDeDados(@Nullable Context context, int version) {
        super(context, "BD_APLICATIVO", null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Para criar a tabela usuário
        sqLiteDatabase.execSQL(criaTabela);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
