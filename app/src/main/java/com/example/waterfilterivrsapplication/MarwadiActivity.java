package com.example.waterfilterivrsapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Locale;
public class MarwadiActivity extends AppCompatActivity {
    TextToSpeech myTTS;
    EditText editText;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b10,b11;
    DatabaseHelper myDatabaseHelper;
    private static final String TAG ="MarwadiActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marwadi);
        b1=(Button)findViewById(R.id.thirdActivityButton1);
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
                    Toast.makeText(MarwadiActivity.this, "There is no TTS engine on your device", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    //myTTS.setLanguage(Locale.US);
                    //  Locale myLocale = new Locale("gu");
                    // Resources res =  getResources();
                    //DisplayMetrics dm = res.getDisplayMetrics();
                    // Configuration conf = res.getConfiguration();
                    // conf.locale = myLocale;
                    //  res.updateConfiguration(conf, dm);
                    myTTS.setSpeechRate(0.8f);
                    //myTTS.setLanguage(new Locale("hi"));
                    myTTS.setLanguage(new Locale("hi"));
                    // speak("पाँच आंगलियां पूंच्यौँ भारी ");
                    //speak("Welcome to Water Filter Piloting User Feedback System. You have chosen English as your language. Is your filter working? Press 1 for Yes, Or 9 for No.");
                    //speak("জল ফিল্টার আইভিআরএস সিস্টেমে আপনাকে স্বাগতম");
                    speak("पानी साफ़ करवाली मशीन की आई वी आर एस में आपरो स्वागत है सा. ये मारवाड़ी भाषा चुनी हो सा , आपके पानी साफ़ करवाली मशीन सही काम कर रहे है या कोणी ? यदि करे है तो १ दबाबों नहीं तो ९ दबाबों ।");
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
    }
    public void Logout(View view) {
        Intent intent = new Intent(MarwadiActivity.this, LoginActivity.class);
        startActivity(intent);
        speak("");
        finish();
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
            myTTS.setLanguage(new Locale("hi"));
            myTTS.setSpeechRate(0.8f);
            speak("आज आप कतो पाणी पीबा मा और खानू बनाब मा काम में लियो ? बहुत सारा की खातिर ५ दबाबों , थोड़ा घणा री खातिर ६ दबाबों,  कुछ नहीं की खातिर ७ दबाबों");
        }else if (view==b9) {
            editText.setText("९");
            myTTS.setSpeechRate(0.8f);
            myTTS.setLanguage(new Locale("hi"));
            speak("आपकी पाणी साफ़ करणारी मशीन मा काई खराबी है ? पाणी तपकरियो  है री खातिर २ दबाबों , पाणी री टोटी काम नी करण री ३ दबाबों , पाणी रो स्वाद सही नी आ रयो री खातिर ४ दबाबों ");
        }else if (view==b2){
            editText.setText("२");
            myTTS.setSpeechRate(0.8f);
            myTTS.setLanguage(new Locale("hi"));
            speak("आपने मशीन मा सू पाणी टपकरियो है विकल्प चुन्यो है , जानकरी देबा री खातिर धन्यवाद, आपरी जानकारी के इनपर  काम कर रिया हा, जल्द ही आपरी सहायता की जावेली! क्या आप म्हारा मशीन ठीक करने वाले मिस्त्री सू बात करनो चावो हो ? नहीं री खातिर ० दबाबों, हां की खातिर ८ दबाबों ! आईवीआरएस में फ़ोन करबारी खातिर धन्यवाद ! आपरो दिन शुभ हो!");
            //finish();
        }else if (view==b3){
            editText.setText("३");
            myTTS.setSpeechRate(0.8f);
            myTTS.setLanguage(new Locale("hi"));
            speak("आपने मशीन री टोटी काम कोणी करे विकल्प चुन्यो है  जानकरी देबा री खातिर धन्यवाद, आपरी जानकारी के इनपर  काम कर रिया हा, जल्द ही आपरी सहायता की जावेली! क्या आप म्हारा मशीन ठीक करने वाले मिस्त्री सू बात करनो चावो हो ? नहीं री खातिर ० दबाबों, हां की खातिर ८ दबाबों ! आईवीआरएस में फ़ोन करबारी खातिर धन्यवाद ! आपरो दिन शुभ हो!");
            //finish();
        }else if (view==b4){
            editText.setText("४");
            myTTS.setSpeechRate(0.8f);
            myTTS.setLanguage(new Locale("hi"));
            speak("आपने  पाणी रो स्वाद सही नी आ रियो  है विकल्प चुन्यो है . जानकरी देबा री खातिर धन्यवाद, आपरी जानकारी के इनपर  काम कर रिया हा, जल्द ही आपरी सहायता की जावेली! क्या आप म्हारा मशीन ठीक करने वाले मिस्त्री सू बात करनो चावो हो ? नहीं री खातिर ० दबाबों, हां की खातिर ८ दबाबों ! आईवीआरएस में फ़ोन करबारी खातिर धन्यवाद ! आपरो दिन शुभ हो!");
            //finish();
        }else if (view==b5){
            editText.setText("५");
            myTTS.setSpeechRate(0.8f);
            myTTS.setLanguage(new Locale("hi"));
            speak("आप बहुत घणो रो बिकल्प चुन्यो है .क्या आप म्हारा मशीन ठीक करने वाले मिस्त्री सू बात करनो चावो हो ? नहीं री खातिर ० दबाबों, हां की खातिर ८ दबाबों ! जानकारी देबारी री खातिर धन्यवाद , आपरो दिन शुभ हो !");
            //finish();
        }else if (view==b6){
            editText.setText("६");
            myTTS.setSpeechRate(0.8f);
            myTTS.setLanguage(new Locale("hi"));
            speak("आपने थोड़ा घणा रो बिकल्प चुन्यो है क्या आप म्हारा मशीन ठीक करने वाले मिस्त्री सू बात करनो चावो हो ? नहीं री खातिर ० दबाबों, हां की खातिर ८ दबाबों ! जानकारी देबारी री खातिर धन्यवाद , आपरो दिन शुभ हो !");
            // finish();
        }else if (view==b7){
            editText.setText("७");
            myTTS.setSpeechRate(0.8f);
            myTTS.setLanguage(new Locale("hi"));
            speak("क्या आप म्हारा मशीन ठीक करने वाले मिस्त्री सू बात करनो चावो हो ? नहीं री खातिर ० दबाबों, हां की खातिर ८ दबाबों !");
        }
        else if (view==b8){
            editText.setText("८");
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919039905656"));
            startActivity(intent);
            myTTS.setLanguage(Locale.US);
            speak("");
            // myTTS.setLanguage(Locale.US);
            // speak("Please call on this given number.");
            // Toast.makeText(getApplicationContext(),"Mobile No +919039905656",Toast.LENGTH_SHORT).show();
            //Intent callIntent = new Intent(Intent.ACTION_CALL);
            //callIntent.setData(Uri.parse("tel:+919039905656"));
            //startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:+919039905656")));
            //startActivity(callIntent);
        }
        else if (view==b0){
            editText.setText("०");
            myTTS.setSpeechRate(0.8f);
            myTTS.setLanguage(new Locale("hi"));
            speak(" आईवीआरएस में फ़ोन करबारी खातिर धन्यवाद ! आपरो दिन शुभ हो!");
            finish();
        }
        else if (view==b10) {
            speak("");
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }
        else{
            editText.setText("अमान्य विकल्प");
            myTTS.setSpeechRate(0.8f);
            myTTS.setLanguage(new Locale("hi"));
            //speak("Sorry, you have chosen the wrong option. Thanks for calling in IVRS. Have a good day!");
            speak("माफ़ करो सा , आपने गलत विकल्प चुन्यो है !");
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
        myTTS.setLanguage(new Locale("hi"));
        speak("");
    }
    public void OnClickCancel(View view) {
        EditText editText = findViewById(R.id.editText);
        editText.setText("");
        myTTS.setLanguage(new Locale("hi"));
        speak("");
    }
    public void OnClickCall(View view) {
        editText.setText("");
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "));
        startActivity(intent);
        myTTS.setLanguage(Locale.US);
        speak("");
    }
    public void LoginActivity5(View view) {
        Intent intent = new Intent(MarwadiActivity.this, DialerActivity.class);
        startActivity(intent);
        speak("");
    }
    private void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void OnView(View view) {
        Intent i = new Intent(MarwadiActivity.this, ListDataActivity.class);
        startActivity(i);
        speak("");
    }
    public void Back(View view) {
        Intent i = new Intent(MarwadiActivity.this, LanguagesActivity.class);
        startActivity(i);
        speak("");
    }
    public void CallRecorder(View view) {
        Intent i = new Intent(MarwadiActivity.this, CallRecorder.class);
        startActivity(i);
    }
}