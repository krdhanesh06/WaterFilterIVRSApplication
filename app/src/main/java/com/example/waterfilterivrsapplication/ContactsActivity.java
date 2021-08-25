package com.example.waterfilterivrsapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
public class ContactsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
    }
    public void Back(View view) {
        Intent intent = new Intent(ContactsActivity.this, DialerActivity.class);
        startActivity(intent);
    }
    public void Contacts(View view) {

    }
    public void Credential(View view) {

    }

}
