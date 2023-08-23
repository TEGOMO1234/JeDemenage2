package com.example.jedemenage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Premire_partie extends AppCompatActivity {
    private TextView animation_du_text;
    private ImageView creation;
    Animation animer_maintenant;                        //animer_maintenant = anmationview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.premiere_partie);

         // masquer la bare de status//

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // fin du masquage la bare de status//

        //gestionare de redirection de page//

     new Handler().postDelayed(new Runnable() {
         @Override
         public void run() {
             Intent intent = new Intent(Premire_partie.this,Login.class);
             startActivity(intent);

             finish();
         }
     }, 6000);

        // fin du gestionaire//

        // appel des constructeur //
        init();
        ini();
        // fin de l'appel //
    }
    //constructeur servant a modifier les animation de l'acceuil//
    public void init(){
        animation_du_text = (TextView)findViewById(R.id.textView);
        creation = (ImageView)findViewById(R.id.imageView8);
        animer_maintenant = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_du_dessus);
       // animer_maintenant = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_droite);

        animation_du_text.setAnimation(animer_maintenant);


        Glide.with(this).load(R.drawable.icon).into(creation);
    }
     // fon de la premiere modification //
    public void ini(){
        animation_du_text = (TextView)findViewById(R.id.textView);
        creation = (ImageView)findViewById(R.id.imageView4);
          animer_maintenant = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_du_dessus);
       // animer_maintenant = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_droite);

        animation_du_text.setAnimation(animer_maintenant);

        Glide.with(this).load(R.drawable.googletransit).into(creation);

    }
    // fin de la seconde modification //


}