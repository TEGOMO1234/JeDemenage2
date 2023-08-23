package com.example.jedemenage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Login extends AppCompatActivity {

    private Button BoutonDeConnexionNumero , BoutonDeConnexionGoogle;        //  BoutonDeConnexionNumero = phonebutton ,  BoutonDeConnexionGoogle =googlebutton
    Animation animerleBoutonDeConnexionNumero,animerleBoutonDeConnexionGoogle; // animerleBoutonDeConnexionNumero =Phoneanimate,animerleBoutonDeConnexionGoogle=googleanmate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
  //faire interagir les boutton de connexion//
        BoutonDeConnexionNumero =(Button) findViewById(R.id.ConnexionAvecNumero);
        BoutonDeConnexionGoogle =(Button) findViewById(R.id.ConnexionViaGoogle);
        // fin faire interagir les boutton de connexion//

        //animation//
        animerleBoutonDeConnexionNumero = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_droite);
        animerleBoutonDeConnexionGoogle = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_droite);


        BoutonDeConnexionNumero.setAnimation(animerleBoutonDeConnexionNumero);
        BoutonDeConnexionGoogle.setAnimation(animerleBoutonDeConnexionGoogle);

        //fin//

    }

    public void connexionauClick(View view) {

        Intent intent = new Intent(Login.this, Interface_de_connexion.class);
        startActivity(intent);
        Animatoo.animateSlideUp(this);
    }
}