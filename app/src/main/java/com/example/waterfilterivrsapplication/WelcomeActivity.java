package com.example.waterfilterivrsapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Toast;
import java.util.Locale;
public class WelcomeActivity extends AppCompatActivity {
    TextToSpeech myTTS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initializeTextToSpeech();
    }
    private void initializeTextToSpeech() {
        myTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (myTTS.getEngines().size() == 0) {
                    Toast.makeText(WelcomeActivity.this, "There is no TTS engine on your device", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    myTTS.setSpeechRate(0.8f);
                    myTTS.setLanguage(new Locale("hi"));
                    //speak("water filter upyogkarta feedback system me aapka swagat hai");
                    speak("वाटर फ़िल्टर उपयोगकर्ता फीडबैक सिस्टम में आपका स्वागत है");
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
    public void Login(View view) {
        Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
        startActivity(intent);
        speak("");
    }
}