package com.example.waterfilterivrsapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;
public class LanguagesActivity extends AppCompatActivity {
    TextView textView2;
    String username;
    TextToSpeech myTTS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);
        textView2= (TextView)findViewById(R.id.textView2);

        username= getIntent().getStringExtra("username");
        textView2.setText(username);


        initializeTextToSpeech();
    }
    private void initializeTextToSpeech() {
        myTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (myTTS.getEngines().size() == 0) {
                    Toast.makeText(LanguagesActivity.this, "There is no TTS engine on your device", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    //myTTS.setLanguage(Locale.US);
                    myTTS.setSpeechRate(0.8f);
                    myTTS.setLanguage(new Locale("hi"));
                    //speak("Welcome to Water Filter Piloting User Feedback System");
                    speak("कृप्या अपनी भाषा चुनें...");
                    //वाटर फ़िल्टर IVRS में आपका स्वागत है!
                }
            }
        });
    }
    private void speak(String message) {
        if (Build.VERSION.SDK_INT >= 21) {
            myTTS.speak(message, TextToSpeech.QUEUE_FLUSH, null, null);
        } else {
            myTTS.speak(message, TextToSpeech.QUEUE_FLUSH, null);
        }
    }
    public void LoginEnglish(View view) {
        Intent intent = new Intent(LanguagesActivity.this, EnglishActivity.class);
        startActivity(intent);
        speak("");
    }
    public void LoginHindi(View view) {
        Intent intent = new Intent(LanguagesActivity.this, HindiActivity.class);
        startActivity(intent);
        speak("");
    }
    public void LoginMarwadi(View view) {
        Intent intent = new Intent(LanguagesActivity.this, MarwadiActivity.class);
        startActivity(intent);
        speak("");
    }
    public void Logout(View view) {
        Intent intent = new Intent(LanguagesActivity.this, WelcomeActivity.class);
        startActivity(intent);
        finish();
    }
    public void Back(View view) {
        Intent intent = new Intent(LanguagesActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}