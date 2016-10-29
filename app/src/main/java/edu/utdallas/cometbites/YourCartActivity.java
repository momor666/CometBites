package edu.utdallas.cometbites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

import edu.utdallas.cometbites.models.CartItem;

public class YourCartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String TAG = "CartActivity";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_cart);

        ListView listView = (ListView) findViewById(R.id.items_in_cart_list_view);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_cart_page);
        toolbar.setTitle("Your Cart");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        List<CartItem> cartItemList = new LinkedList<>();
        cartItemList.add(new CartItem("1X", "Subway Club", "$6.49"));
        Log.d(TAG, "onCreate: " + cartItemList);
        ItemCartAdapter itemCartAdapter = new ItemCartAdapter(cartItemList, getApplicationContext());
        listView.setAdapter(itemCartAdapter);

        Log.d(TAG, "onCreate: " + "Successfully set the adapter");


        TextView cancelButton= (TextView) findViewById(R.id.cancelOrderButton);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Order Cancelled",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(YourCartActivity.this, BrowseFoodJointsActivity.class);
                startActivity(i);
                finish();
            }
        });

        Button checkoutButton= (Button)findViewById(R.id.checkoutButton);
        checkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(YourCartActivity.this, OrderConfirmationActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}
