package edu.iu.eego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Button btn = (Button) findViewById(R.id.button);
    }

    public void onClickNextButton(View view) {
        Intent intent = new Intent(getApplicationContext(), ConnectionActivity.class);
        startActivity(intent);

    }

}