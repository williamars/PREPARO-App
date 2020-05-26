package br.edu.insper.al.anaccf5.preparoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Cadastro extends AppCompatActivity {
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        final EditText email = findViewById(R.id.email);
        final EditText senha = findViewById(R.id.senha);
        Button cadastrar = findViewById(R.id.button_cadastro);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email_usuario = email.getText().toString().trim();
                String senha_usuario = senha.getText().toString().trim();
                criarUser(email_usuario, senha_usuario);

            }
        });
    }

    private void criarUser(String email, String senha) {
        auth.createUserWithEmailAndPassword(email,senha)
                .addOnCompleteListener(Cadastro.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            alert(("Usuário cadastrado com sucesso"));
//                            Intent intent = new Intent(Cadastro.this, Cadastro.class);
//                            MainActivity.this.startActivity(intent);
//                            MainActivity.this.onPause();
                        }else {
                            alert("Erro de cadastro");
                        }
                    }
                });
    }

    private void alert(String msg){
        Toast.makeText(Cadastro.this,msg,Toast.LENGTH_SHORT).show();
    }


    protected void onStart() {
        super.onStart();
        auth = Conexao.getFirebaseAuth();
    }
}