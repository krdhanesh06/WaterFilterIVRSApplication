package com.example.waterfilterivrsapplication;
import android.Manifest;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class CallTimerActivity extends AppCompatActivity {
    public int counter;
    TextView counttime;
    private boolean isPaused = false;
    //Declare a variable to hold count down timer's paused status
    private boolean isCanceled = false;

    //Declare a variable to hold CountDownTimer remaining time
    private long timeRemaining = 0;
    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_timer);
        final TextView counttime = findViewById(R.id.counttime);
        final TextView tView = (TextView) findViewById(R.id.counttime);
        final Button btnStart = (Button) findViewById(R.id.btn_start);
        final Button btnPause = (Button) findViewById(R.id.btn_pause);
        final Button btnResume = (Button) findViewById(R.id.btn_resume);
        final Button btnCancel = (Button) findViewById(R.id.btn_cancel);

        //Initially disabled the pause, resume and cancel button
        btnPause.setEnabled(false);
        btnResume.setEnabled(false);
        btnCancel.setEnabled(false);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isPaused = false;
                isCanceled = false;

                //Disable the start and pause button
                btnStart.setEnabled(false);
                btnResume.setEnabled(false);
                //Enabled the pause and cancel button
                btnPause.setEnabled(true);
                btnCancel.setEnabled(true);

                CountDownTimer timer;
                long millisInFuture = 60000; //30 seconds
                long countDownInterval = 1000; //1 second


                //Initialize a new CountDownTimer instance
                timer = new CountDownTimer(millisInFuture, countDownInterval) {
                    public void onTick(long millisUntilFinished) {
                        //do something in every tick
                        if (isPaused || isCanceled) {
                            //If the user request to cancel or paused the
                            //CountDownTimer we will cancel the current instance
                            cancel();
                        } else {
                            //Display the remaining seconds to app interface
                            //1 second = 1000 milliseconds
                            tView.setText("" + millisUntilFinished / 1000);
                            //Put count down timer remaining time in a variable
                            timeRemaining = millisUntilFinished;
                        }
                    }

                    public void onFinish() {
                        //Do something when count down finished
                        tView.setText("Done");
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:+919039905656"));
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                            if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                // TODO: Consider calling
                                //    Activity#requestPermissions
                                // here to request the missing permissions, and then overriding
                                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                //                                          int[] grantResults)
                                // to handle the case where the user grants the permission. See the documentation
                                // for Activity#requestPermissions for more details.
                                return;
                            }
                        }
                        startActivity(callIntent);
                        //Enable the start button
                        btnStart.setEnabled(true);
                        //Disable the pause, resume and cancel button
                        btnPause.setEnabled(false);
                        btnResume.setEnabled(false);
                        btnCancel.setEnabled(false);
                    }
                }.start();
            }
        });

        //Set a Click Listener for pause button
        btnPause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //When user request to pause the CountDownTimer
                isPaused = true;

                //Enable the resume and cancel button
                btnResume.setEnabled(true);
                btnCancel.setEnabled(true);
                //Disable the start and pause button
                btnStart.setEnabled(false);
                btnPause.setEnabled(false);
            }
        });

        //Set a Click Listener for resume button
        btnResume.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Disable the start and resume button
                btnStart.setEnabled(false);
                btnResume.setEnabled(false);
                //Enable the pause and cancel button
                btnPause.setEnabled(true);
                btnCancel.setEnabled(true);

                //Specify the current state is not paused and canceled.
                isPaused = false;
                isCanceled = false;

                //Initialize a new CountDownTimer instance
                long millisInFuture = timeRemaining;
                long countDownInterval = 1000;
                new CountDownTimer(millisInFuture, countDownInterval){
                    public void onTick(long millisUntilFinished){
                        //Do something in every tick
                        if(isPaused || isCanceled)
                        {
                            //If user requested to pause or cancel the count down timer
                            cancel();
                        }
                        else {
                            tView.setText("" + millisUntilFinished / 1000);
                            //Put count down timer remaining time in a variable
                            timeRemaining = millisUntilFinished;
                        }
                    }
                    public void onFinish(){
                        //Do something when count down finished
                        tView.setText("Done");
                        //Disable the pause, resume and cancel button
                        btnPause.setEnabled(false);
                        btnResume.setEnabled(false);
                        btnCancel.setEnabled(false);
                        //Enable the start button
                        btnStart.setEnabled(true);
                    }
                }.start();

                //Set a Click Listener for cancel/stop button
                btnCancel.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        //When user request to cancel the CountDownTimer
                        isCanceled = true;

                        //Disable the cancel, pause and resume button
                        btnPause.setEnabled(false);
                        btnResume.setEnabled(false);
                        btnCancel.setEnabled(false);
                        //Enable the start button
                        btnStart.setEnabled(true);

                        //Notify the user that CountDownTimer is canceled/stopped
                        tView.setText("Canceled/stopped.");
                    }
                });
            }
        });

        //Set a Click Listener for cancel/stop button
        btnCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //When user request to cancel the CountDownTimer
                isCanceled = true;

                //Disable the cancel, pause and resume button
                btnPause.setEnabled(false);
                btnResume.setEnabled(false);
                btnCancel.setEnabled(false);
                //Enable the start button
                btnStart.setEnabled(true);

                //Notify the user that CountDownTimer is canceled/stopped
                tView.setText("Canceled/stopped.");
            }
        });

    }

    public void Next(View view) {

        Intent i = new Intent(CallTimerActivity.this, VoiceToTextActivity.class);
        startActivity(i);
    }
    public void Back(View view) {
        Intent intent = new Intent(CallTimerActivity.this, ScheduledCallActivity.class);
        startActivity(intent);
    }
}