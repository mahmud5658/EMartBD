package org.abdsoft.emartbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterUserActivity extends AppCompatActivity {

    private ImageButton backBtn,gpsBtn;
    private ImageView profileIv;
    private EditText nameEt,phoneEt,countryEt,stateEt,cityEt,
            addressEt,emailEt,passwordEt,cpasswordEt;
    private Button registerBtn;
    private TextView registerSellerTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        backBtn = findViewById(R.id.backBtn);
        gpsBtn = findViewById(R.id.gpsBtn);
        profileIv = findViewById(R.id.profileIv);
        nameEt = findViewById(R.id.nameEt);
        phoneEt = findViewById(R.id.phoneEt);
        countryEt = findViewById(R.id.countryEt);
        stateEt = findViewById(R.id.stateEt);
        cityEt = findViewById(R.id.cityEt);
        addressEt = findViewById(R.id.addressEt);
        emailEt = findViewById(R.id.emailEt);
        passwordEt = findViewById(R.id.passwordEt);
        cpasswordEt = findViewById(R.id.cpasswordEt);
        registerBtn = findViewById(R.id.registerBtn);
        registerSellerTv = findViewById(R.id.registerSellerTv);



        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        gpsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //detect current location
            }
        });
        profileIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pick image from gallery
            }
        });
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // register user
            }
        });
        registerSellerTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // open register seller activity
                startActivity(new Intent(RegisterUserActivity.this,RegisterSellerActivity.class));
            }
        });
    }
}