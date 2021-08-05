package com.example.bancodedados;

import android.content.ContentValues;
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

    //Método para cadastrar um novo usuário na tabela
    public boolean cadastrar(String nome, String email, String usuario, String senha){

        //Abertura de conexão
        SQLiteDatabase conexao = getWritableDatabase();

        //Usando a classe ContentValues para atribuir o valor de cada tabela
        ContentValues valores = new ContentValues();
        valores.put("nome", nome); //nome_da_coluna, valor_do_campo
        valores.put("email", email);
        valores.put("usuario", usuario);
        valores.put("senha", senha);

        //Chamar o método insert() e testar se foi executado com sucesso
        if (conexao.insert("usuario", null, valores) != -1){
            return true;
        } else {
            return false; //
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
