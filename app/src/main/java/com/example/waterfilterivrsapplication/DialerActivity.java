package com.example.waterfilterivrsapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class DialerActivity extends AppCompatActivity {
    EditText edtPhoneNo;
    TextView lblinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialer);
        edtPhoneNo = (EditText) findViewById(R.id.edtPhoneNumber);
        lblinfo = (TextView) findViewById(R.id.lblinfo);
   }
    public void buttonClickEvent(View v) {
        String phoneNo = edtPhoneNo.getText().toString();
        try {
            switch (v.getId()) {
                case R.id.btnAterisk:
                    lblinfo.setText("");
                    phoneNo += "*";
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btnHash:
                    lblinfo.setText("");
                    phoneNo += "#";
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btnZero:
                    lblinfo.setText("");
                    phoneNo += "0";
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btnOne:
                    lblinfo.setText("");
                    phoneNo += "1";
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btnTwo:
                    lblinfo.setText("");
                    phoneNo += "2";
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btnThree:
                    lblinfo.setText("");
                    phoneNo += "3";
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btnFour:
                    lblinfo.setText("");
                    phoneNo += "4";
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btnFive:
                    lblinfo.setText("");
                    phoneNo += "5";
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btnSix:
                    lblinfo.setText("");
                    phoneNo += "6";
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btnSeven:
                    lblinfo.setText("");
                    phoneNo += "7";
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btnEight:
                    lblinfo.setText("");
                    phoneNo += "8";
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btnNine:
                    lblinfo.setText("");
                    phoneNo += "9";
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btndel:
                    lblinfo.setText("");
                    if (phoneNo != null && phoneNo.length() > 0) {
                        phoneNo = phoneNo.substring(0, phoneNo.length() - 1);
                    }
                    edtPhoneNo.setText(phoneNo);
                    break;
                case R.id.btnClearAll:
                    lblinfo.setText("");
                    edtPhoneNo.setText("");
                    break;
                case R.id.btnCall:
                    if (phoneNo.trim().equals("")) {
                        lblinfo.setText("Please enter a number to call on!");
                    } else {
                        Boolean isHash = false;
                        if (phoneNo.subSequence(phoneNo.length() - 1, phoneNo.length()).equals("#")) {
                            phoneNo = phoneNo.substring(0, phoneNo.length() - 1);
                            String callInfo = "tel:" + phoneNo + Uri.encode("#");
                            Intent callIntent = new Intent(Intent.ACTION_CALL);
                            callIntent.setData(Uri.parse(callInfo));
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
                        } else {
                            String callInfo = "tel:" + phoneNo;
                            Intent callIntent = new Intent(Intent.ACTION_CALL);
                            callIntent.setData(Uri.parse(callInfo));
                            startActivity(callIntent);
                        }
                    }
                    break;
            }
        } catch (Exception ex) {

        }
    }
    public void Next(View view) {
        Intent intent = new Intent(DialerActivity.this, ScheduledCallActivity.class);
        startActivity(intent);
    }
    public void Back(View view) {
        Intent intent = new Intent(DialerActivity.this, LanguagesActivity.class);
        startActivity(intent);
    }

    public void ContactActivity(View view) {
        Intent intent = new Intent(DialerActivity.this, ContactsActivity.class);
        startActivity(intent);
    }
}