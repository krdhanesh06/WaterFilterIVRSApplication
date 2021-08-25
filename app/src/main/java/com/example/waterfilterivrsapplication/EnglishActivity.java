package com.example.waterfilterivrsapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Locale;

public class EnglishActivity extends AppCompatActivity {
    TextToSpeech myTTS;
    Button b1,f1, b2,b3,b4,b5,b6,b7,b8,b9,b0,b10,b11;
    EditText editText;
    DatabaseHelper myDatabaseHelper;
    private static final String TAG ="EnglishActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        b1=(Button)findViewById(R.id.thirdActivityButton1);
        f1=(Button)findViewById(R.id.thirdActivityButton1);
        b2=(Button)findViewById(R.id.thirdActivityButton2);
        b3=(Button)findViewById(R.id.thirdActivityButton3);
        b4=(Button)findViewById(R.id.thirdActivityButton4);
        b5=(Button)findViewById(R.id.thirdActivityButton5);
        b6=(Button)findViewById(R.id.thirdActivityButton6);
        b7=(Button)findViewById(R.id.thirdActivityButton7);
        b8=(Button)findViewById(R.id.thirdActivityButton8);
        b9=(Button)findViewById(R.id.thirdActivityButton9);
        b0=(Button)findViewById(R.id.thirdActivityButton0);
        b10=(Button)findViewById(R.id.thirdActivityFunction3);
        b11=(Button)findViewById(R.id.thirdActivityFunction1);
        editText= (EditText)findViewById(R.id.editText);
        myDatabaseHelper = new DatabaseHelper(this);
        initializeTextToSpeech();
    }
    private void initializeTextToSpeech() {
        myTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (myTTS.getEngines().size() == 0) {
                    Toast.makeText(EnglishActivity.this, "There is no TTS engine on your device", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    myTTS.setLanguage(Locale.US);
                    myTTS.setSpeechRate(0.8f);
                    // myTTS.setLanguage(new Locale("hi"));
                    speak("Welcome to Water Filter Piloting User Feedback System. You have chosen English as your language. Is your filter working? Press 1 for Yes, Or 9 for No.");
                    //speak(" Namaskar, इस परियोजना के विकाश में आपका स्वागत है.");
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
    public void LoginActivity5(View view) {
        Intent intent = new Intent(EnglishActivity.this, DialerActivity.class);
        startActivity(intent);
        speak("");
    }
    public void Clear(View view) {
        EditText editText = findViewById(R.id.editText);
        editText.setText("");
    }
    public void OnClick(View view) {
        EditText editText = findViewById(R.id.editText);
        String newEntry = editText.getText().toString();
        if (editText.length() != 0){
            addData(newEntry);
            editText.setText("");
        }
        if (view==b1) {
            editText.setText("1");
            myTTS.setSpeechRate(0.8f);
            myTTS.setLanguage(Locale.US);
            speak("How much of your drinking and cooking water did you use from the filter today? Press 5 for most or All, 6 for some, 7 for none.");
        } else if (view==b9) {
            editText.setText("9");
            myTTS.setLanguage(Locale.US);
            speak("What is the problem with your filter? Press 2 for No percolation, 3 for spigot / tap not working, 4 for Quality or Taste poor.");

        }else if (view==b2){
            editText.setText("2");
            myTTS.setLanguage(Locale.US);
            speak("You have selected No percolation option. Thanks for giving information, according to your information, we are working on it and you will be assisted soon. Would you like a technician to call you back? press 0 for not, 8 for yes. Thanks for calling in IVRS. Have a good day !");
            //finish();
        }else if (view==b3){
            editText.setText("3");
            myTTS.setLanguage(Locale.US);
            speak("You have selected option for spigot / tap not working. Thanks for giving information, according to your information, we are working on it and you will be assisted soon. Would you like a technician to call you back? press 0 for not, 8 for yes. Thanks for calling in IVRS. Have a good day !");
            //finish();
        }else if (view==b4){
            editText.setText("4");
            myTTS.setLanguage(Locale.US);
            speak("You have selected option  for Quality or Taste poor. Thanks for giving information, according to your information, we are working on it and you will be assisted soon. Would you like a technician to call you back? press 0 for not, 8 for yes. Thanks for calling in IVRS. Have a good day !");
            //finish();
        }else if (view==b5){
            editText.setText("5");
            myTTS.setLanguage(Locale.US);
            speak("You have selected most or all option. Would you like a technician to call you back? press 0 for not, 8 for yes. Thanks for giving the information.Have a good day !");

            //finish();
        }else if (view==b6){
            editText.setText("6");
            myTTS.setLanguage(Locale.US);
            speak("You have selected some option. Would you like a technician to call you back? press 0 for not, 8 for yes. Thanks for giving the information.Have a good day !");

            //finish();
        }else if (view==b7){
            editText.setText("7");
            myTTS.setLanguage(Locale.US);
            speak("Would you like a technician to call you back? press 0 for not, 8 for yes.");
        }
        else if (view==b8) {
            editText.setText("8");
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919039905656"));
            startActivity(intent);
            myTTS.setLanguage(Locale.US);
            speak("");
        }
        else if (view==b0){
            editText.setText("0");
            myTTS.setLanguage(Locale.US);
            speak("Thanks for calling in IVRS. Have a good day!");
            // speak("");
            finish();
        }
        else if (view==b10) {
            speak("");
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }
        else{
            editText.setText("Invalid option");
            myTTS.setLanguage(Locale.US);
            //speak("Sorry, you have chosen the wrong option. Thanks for calling in IVRS. Have a good day!");
            speak("sorry! Invalid option.");
            finish();
        }
    }
    private void addData(String newEntry) {
        boolean insertData = myDatabaseHelper.addData(newEntry);
        if (insertData){
            toastMessage("Data successfully inserted!");
        }else {
            toastMessage("Data not inserted successfully!");
        }
    }
    public void OnClickStop(View view) {
        EditText editText = findViewById(R.id.editText);
        editText.setText("");
        myTTS.setLanguage(Locale.US);
        speak("");
    }
    public void OnClickk(View view) {
        editText.setText("");
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "));
        startActivity(intent);
        myTTS.setLanguage(Locale.US);
        speak("");
    }
    public void OnClickCancel(View view) {
        EditText editText = findViewById(R.id.editText);
        editText.setText("");
        myTTS.setLanguage(Locale.US);
        speak("");
    }
    public void Logout(View view) {
        Intent intent = new Intent(EnglishActivity.this, LoginActivity.class);
        startActivity(intent);
        speak("");
        finish();
    }
    private void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void View(View view) {
        Intent i = new Intent(EnglishActivity.this, ListDataActivity.class);
        startActivity(i);
        speak("");
    }
    public void Back(View view) {
        Intent i = new Intent(EnglishActivity.this, LanguagesActivity.class);
        startActivity(i);
        speak("");
    }
    public void CallRecorder(View view) {
        Intent i = new Intent(EnglishActivity.this, CallRecorder.class);
        startActivity(i);
    }
   /*
    public void OnClick(View view) {
        String value = editText.getText().toString();
        if (value.equals("1")){
            myTTS.setLanguage(Locale.US);
            speak("One");
        }
        else if (value.equals("9")){
            myTTS.setLanguage(Locale.US);
            speak("Nine");
        }else {
            myTTS.setLanguage(Locale.US);
            speak("invalid option");
        }
    }*/
}