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
public class HindiActivity extends AppCompatActivity {
    TextToSpeech myTTS;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b10;
    DatabaseHelper myDatabaseHelper;
    private static final String TAG ="HindiActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi);
        b1=(Button)findViewById(R.id.forthActivityButton1);
        b2=(Button)findViewById(R.id.forthActivityButton2);
        b3=(Button)findViewById(R.id.forthActivityButton3);
        b4=(Button)findViewById(R.id.forthActivityButton4);
        b5=(Button)findViewById(R.id.forthActivityButton5);
        b6=(Button)findViewById(R.id.forthActivityButton6);
        b7=(Button)findViewById(R.id.forthActivityButton7);
        b8=(Button)findViewById(R.id.forthActivityButton8);
        b9=(Button)findViewById(R.id.forthActivityButton9);
        b0=(Button)findViewById(R.id.forthActivityButton0);
        b10 =(Button)findViewById(R.id.forthActivityFunction3);
        myDatabaseHelper = new DatabaseHelper(this);
        initializeTextToSpeech();
    }
    private void initializeTextToSpeech() {
        myTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (myTTS.getEngines().size() == 0) {
                    Toast.makeText(HindiActivity.this, "There is no TTS engine on your device", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    //myTTS.setLanguage(Locale.US);
                    myTTS.setSpeechRate(0.8f);
                    myTTS.setLanguage(new Locale("hi"));
                    //speak("Welcome to Water Filter Piloting User Feedback System");
                    speak("वाटर फिल्टर सिस्टम आई वी आर एस में आपका स्वागत है! आपने हिंदी भाषा चुना है. क्या आपका फ़िल्टर काम कर रहा है? हां के लिए 1 दबाएं, या नहीं के लिए 9");
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
    public void Clear(View view) {
        EditText editText = findViewById(R.id.editText);
        editText.setText("");
        myTTS.setLanguage(Locale.US);
        speak("");
    }
    public void OnClick(View view) {
        EditText editText = findViewById(R.id.editText);
        String newEntry = editText.getText().toString();
        if (editText.length() != 0){
            addData(newEntry);
            editText.setText("");
        }
        if (view==b1){
            editText.setText("१");
            myTTS.setSpeechRate(0.8f);
            myTTS.setLanguage(new Locale("hi"));
            speak("आज, आपने कितना पानी पीने और खाना पकाने के लिए उपयोग किया है? सबसे अधिक या सभी के लिए 5 दबाएं, कुछ के लिए 6, कुछ नहीं के लिए 7 । ");
        }else if (view==b9) {
            editText.setText("९");
            myTTS.setSpeechRate(0.8f);
            myTTS.setLanguage(new Locale("hi"));
            speak("आपके फ़िल्टर में क्या समस्या है? नो पेर्कोलेशन या टपकन के लिए 2 दबाएं, पानी की कल या नल टोटी काम न करने के लिए 3, गुणवत्ता या खराब स्वाद के लिए 4 ।");
        }else if (view==b2){
            editText.setText("२");
            myTTS.setLanguage(new Locale("hi"));
            speak("आपने नो परकोलेशन (टपकन) विकल्प चुना है। जानकारी देने के लिए धन्यवाद, आपकी जानकारी के अनुसार, हम इस पर काम कर रहे हैं और जल्द ही आपकी सहायता की जाएगी। क्या आप हमारे तकनीशियन से बात करना चाहेंगे? नहीं  के लिए 0 दबाएं, हां के लिए 8। आईवीआरएस में कॉल करने के लिए धन्यवाद। आपका दिन शुभ हो !");

        }else if (view==b3){
            editText.setText("३");
            myTTS.setLanguage(new Locale("hi"));
            speak("आपने पानी की कल या  नल टोटी काम न करने के लिए विकल्प का चयन किया है। जानकारी देने के लिए धन्यवाद, आपकी जानकारी के अनुसार, हम इस पर काम कर रहे हैं और जल्द ही आपकी सहायता की जाएगी। क्या आप हमारे तकनीशियन से बात करना चाहेंगे? नहीं  के लिए 0 दबाएं, हां के लिए 8। आईवीआरएस में कॉल करने के लिए धन्यवाद। आपका दिन शुभ हो !");

        }else if (view==b4){
            editText.setText("४");
            myTTS.setLanguage(new Locale("hi"));
            speak("आपने गुणवत्ता या स्वाद खराब का विकल्प चुना है। जानकारी देने के लिए धन्यवाद, आपकी जानकारी के अनुसार, हम इस पर काम कर रहे हैं और जल्द ही आपकी सहायता की जाएगी। क्या आप हमारे तकनीशियन से बात करना चाहेंगे? नहीं  के लिए 0 दबाएं, हां के लिए 8। आईवीआरएस में कॉल करने के लिए धन्यवाद। आपका दिन शुभ हो !");

        }else if (view==b5){
            editText.setText("५");
            myTTS.setLanguage(new Locale("hi"));
            speak("आपने अधिकांश या सभी विकल्प चुने हैं। क्या आप हमारे तकनीशियन से बात करना चाहेंगे? नहीं  के लिए 0 दबाएं, हां के लिए 8। जानकारी देने के लिए धन्यवाद। आपका दिन शुभ हो!");

        }else if (view==b6){
            editText.setText("६");
            myTTS.setLanguage(new Locale("hi"));
            speak("आपने कुछ विकल्प चुना है। क्या आप हमारे तकनीशियन से बात करना चाहेंगे? नहीं  के लिए 0 दबाएं, हां के लिए 8। जानकारी देने के लिए धन्यवाद। आपका दिन शुभ हो!");

        }else if (view==b7){
            editText.setText("७");
            myTTS.setLanguage(new Locale("hi"));
            speak("क्या आप हमारे तकनीशियन से बात करना चाहेंगे? नहीं  के लिए 0 दबाएं, हां के लिए 8।");
        }
        else if (view==b8){
            editText.setText("८");
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919039905656"));
            startActivity(intent);
            myTTS.setLanguage(new Locale("hi"));
            speak("");
        }
        else if (view==b0){
            editText.setText("०");
            myTTS.setLanguage(new Locale("hi"));
            speak("आईवीआरएस में कॉल करने के लिए धन्यवाद। आपका दिन शुभ हो!");
            finish();
        }
        else if (view==b10) {
            speak("");
            //editText.setText("");
            //myTTS.setLanguage(new Locale("hi"));
            // speak("आईवीआरएस में कॉल करने के लिए धन्यवाद। आपका दिन शुभ हो!");
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }
        else{
            editText.setText("Invalid option");
            myTTS.setLanguage(new Locale("hi"));
            speak("क्षमा करें, आपने गलत विकल्प चुना है। आईवीआरएस में कॉल करने के लिए धन्यवाद। आपका दिन शुभ हो!");
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
    public void LoginActivity5(View view) {
        Intent intent = new Intent(HindiActivity.this, DialerActivity.class);
        startActivity(intent);
        speak("");
    }
    public void OnClickStop(View view) {
        EditText editText = findViewById(R.id.editText);
        editText.setText("");
        myTTS.setLanguage(Locale.US);
        speak("");
    }
    public void OnClickk(View view) {
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
        Intent intent = new Intent(HindiActivity.this, LoginActivity.class);
        startActivity(intent);
        speak("");
        finish();
    }
    private void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void OnView(View view) {
        Intent i = new Intent(HindiActivity.this, ListDataActivity.class);
        startActivity(i);
        speak("");
    }
    public void Back(View view) {
        Intent i = new Intent(HindiActivity.this, LanguagesActivity.class);
        startActivity(i);
        speak("");
    }
    public void CallRecorder(View view) {
        Intent i = new Intent(HindiActivity.this, CallRecorder.class);
        startActivity(i);
    }
}