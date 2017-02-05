package edu.utdallas.cometbites.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.FirebaseApp;

import edu.utdallas.cometbites.R;

public class LandingActivity extends Activity {
    final private int DELAY = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);


        Button getStartedbutton = (Button) findViewById(R.id.getStartedButton);


        getStartedbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LandingActivity.this, EnterPhoneNumberActivity.class));
            }
        });
    }
}
