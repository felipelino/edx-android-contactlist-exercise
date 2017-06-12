package com.beginner.micromaster.contactlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView contactName = (TextView) findViewById(R.id.contactName);
        TextView contactLastName = (TextView) findViewById(R.id.contactLastName);
        TextView contactEmail = (TextView) findViewById(R.id.contactEmail);
        TextView contactPhone = (TextView) findViewById(R.id.contactPhoneNumber);

        Bundle b = new Bundle();
        b = getIntent().getExtras();

        //TODO: get the rest of contact parameters
        String name = b.getString("name");
        Contact contact = (Contact) b.get("contact");

        //TODO: once you have all the values for a contact add them to the views
        contactName.setText(name);
        contactLastName.setText(contact.getLastName());
        contactEmail.setText(contact.getEmail());
        contactPhone.setText(getStrPhoneNumber(contact.getPhoneNumber()));
    }

    private String getStrPhoneNumber(Integer phoneNumber) {
        if(phoneNumber != null) {
            return phoneNumber.toString();
        }
        else
        {
            return "";
        }
    }
}
