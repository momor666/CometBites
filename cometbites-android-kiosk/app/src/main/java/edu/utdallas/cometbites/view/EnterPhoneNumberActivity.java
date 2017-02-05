package edu.utdallas.cometbites.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import edu.utdallas.cometbites.R;

public class EnterPhoneNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_phone_number);


        final EditText phoneNumberEditText = (EditText) findViewById(R.id.phoneNumberEditText);

        Button startButton = (Button) findViewById(R.id.startButton);


        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputPhone = phoneNumberEditText.getText().toString();

                sendMessageToUser(inputPhone);
                startActivity(new Intent(EnterPhoneNumberActivity.this, BrowseFoodJointsActivity.class));

            }
        });



    }

    private void sendMessageToUser(String inputPhone) {
        //TODO send meesage to user
        //oin successfull message sent go to next page.
    }


}
