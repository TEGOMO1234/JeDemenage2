package com.example.jedemenage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hbb20.CountryCodePicker;

public class Interface_de_connexion extends AppCompatActivity {

    CountryCodePicker countryCodePicker;             //countryCodePicker = cpp
    private String selectioner_du_pays_de_residence ="+237";   //selectioner_du_pays_de_residence =select_country_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_de_connexion);

        countryCodePicker = findViewById(R.id.countryCodePicker);
        countryCodePicker.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected() {
                selectioner_du_pays_de_residence = countryCodePicker.getDefaultCountryCodeWithPlus();
            }
        });


    }
}