package br.edu.insper.al.anaccf5.preparoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Perfil extends AppCompatActivity {

//    private FirebaseUser user;
//
//    private TextView user_email, le_id;
//    private Button log_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

//        inicializaComponentes();
//
//        log_out.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Conexao.logout();
//                Intent intent = new Intent(Perfil.this, MainActivity.class);
//                Perfil.this.startActivity(intent);
//                Perfil.this.onPause();
//                user_email.setText("E-mail \n");
//                le_id.setText("ID \n");
//            }
//        });
//    }
//
//    private void inicializaComponentes() {
//        user_email = (TextView) findViewById(R.id.email_perfil);
//        le_id = (TextView) findViewById(R.id.id_perfil);
//        log_out = (Button) findViewById(R.id.logout);
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        FirebaseAuth auth = Conexao.getFirebaseAuth();
//        user = Conexao.getFirebaseUser();
//        verificaUser();
//    }
//
//    @SuppressLint("SetTextI18n")
//    private void verificaUser() {
//        if (user == null){
//            finish();
//        } else {
//            user_email.setText("E-mail: \n".concat(user.getEmail() + "\n"));
//            le_id.setText("ID: \n".concat(user.getUid() + "\n"));
//        }
    }
}
