package com.example.waterfilterivrsapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
public class ThankYouActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
    }
    public void Logout(View view) {
        Intent intent = new Intent(ThankYouActivity.this, WelcomeActivity.class);
        startActivity(intent);
        finish();
    }
    public void Back(View view) {
        Intent intent = new Intent(ThankYouActivity.this, CallTimerActivity.class);
        startActivity(intent);
    }
}