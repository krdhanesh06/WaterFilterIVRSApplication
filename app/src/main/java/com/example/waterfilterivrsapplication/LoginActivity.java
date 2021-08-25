package com.example.waterfilterivrsapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1;
    TextView tx1;
    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed1 = (EditText)findViewById(R.id.firstEditEmail1);
        ed2 = (EditText)findViewById(R.id.firstEditPassword2);
        b1 = (Button)findViewById(R.id.firstButton);
        tx1 = (TextView)findViewById(R.id.firstTextView2);
        ed1.getText().clear();
        ed2.getText().clear();
        tx1.setVisibility(View.GONE);
    }
    public void Login(View view) {
//1
        if(ed1.getText().toString().equals("krdhanesh06@gmail.com") &&
                ed2.getText().toString().equals("admin")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, LanguagesActivity.class);

            intent.putExtra("username", ed1.getText().toString());

            startActivity(intent);}
            // Intent i = new Intent(FirstActivity.this, SecondActivity.class);
            //startActivity(i);
//2

//////////////////////////////////////////////////////////////////////////////////////////////////////////////



    else if (ed1.getText().toString().equals("a") &&
            ed2.getText().toString().equals("a")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

        else if (ed1.getText().toString().equals("b") &&
            ed2.getText().toString().equals("b")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

        else if (ed1.getText().toString().equals("c") &&
            ed2.getText().toString().equals("c")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

        else if (ed1.getText().toString().equals("d") &&
            ed2.getText().toString().equals("d")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

        else if (ed1.getText().toString().equals("e") &&
            ed2.getText().toString().equals("e")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

        else if (ed1.getText().toString().equals("f") &&
            ed2.getText().toString().equals("f")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("g") &&
            ed2.getText().toString().equals("g")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("h") &&
            ed2.getText().toString().equals("h")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("i") &&
            ed2.getText().toString().equals("i")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("j") &&
            ed2.getText().toString().equals("j")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("k") &&
            ed2.getText().toString().equals("k")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("l") &&
            ed2.getText().toString().equals("l")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("m") &&
            ed2.getText().toString().equals("m")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("n") &&
            ed2.getText().toString().equals("n")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("o") &&
            ed2.getText().toString().equals("o")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("p") &&
            ed2.getText().toString().equals("p")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("q") &&
            ed2.getText().toString().equals("q")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("r") &&
            ed2.getText().toString().equals("r")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("s") &&
            ed2.getText().toString().equals("s")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("t") &&
            ed2.getText().toString().equals("t")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("u") &&
            ed2.getText().toString().equals("u")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("v") &&
            ed2.getText().toString().equals("v")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("w") &&
            ed2.getText().toString().equals("w")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("x") &&
            ed2.getText().toString().equals("x")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("y") &&
            ed2.getText().toString().equals("y")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
        else if (ed1.getText().toString().equals("z") &&
            ed2.getText().toString().equals("z")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        else if (ed1.getText().toString().equals("subhagopal") &&
                ed2.getText().toString().equals("sgsikar")){
            Toast.makeText(getApplicationContext(),"Login Successfull.",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, LanguagesActivity.class);
            intent.putExtra("username", ed1.getText().toString());
            startActivity(intent);
//3
        }else if (ed1.getText().toString().equals("santoshrajendra") &&
                ed2.getText().toString().equals("srsikar")){
            Toast.makeText(getApplicationContext(),"Login Successfull.",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//4
        }else if (ed1.getText().toString().equals("jhumabahadur") &&
                ed2.getText().toString().equals("jbsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//5
        }else if (ed1.getText().toString().equals("aachikishanlal") &&
                ed2.getText().toString().equals("aksikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//6
        }else if (ed1.getText().toString().equals("manjulakshman") &&
                ed2.getText().toString().equals("mlsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//7
        }else if (ed1.getText().toString().equals("anitachatra") &&
                ed2.getText().toString().equals("acsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//8
        }else if (ed1.getText().toString().equals("manjubanmari") &&
                ed2.getText().toString().equals("mbsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//9
        }else if (ed1.getText().toString().equals("sohnijagdish") &&
                ed2.getText().toString().equals("sjsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//10
        }else if (ed1.getText().toString().equals("birdimahesh") &&
                ed2.getText().toString().equals("bmsikar")) {
           Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//11
        }else if (ed1.getText().toString().equals("anitabrijmohan") &&
             ed2.getText().toString().equals("absikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//12
        }else if (ed1.getText().toString().equals("shardamahavir") &&
                ed2.getText().toString().equals("smsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//13
        }else if (ed1.getText().toString().equals("sumansatyanarayan") &&
                ed2.getText().toString().equals("sssikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//14
        }else if (ed1.getText().toString().equals("geetatrilok") &&
                ed2.getText().toString().equals("gtsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//15
        }else if (ed1.getText().toString().equals("mohnishravan") &&
                ed2.getText().toString().equals("mssikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//16
        }else if (ed1.getText().toString().equals("sushilaashvini") &&
                ed2.getText().toString().equals("sasikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//17
        }else if (ed1.getText().toString().equals("mamtahari") &&
                ed2.getText().toString().equals("mhsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//18
        }else if (ed1.getText().toString().equals("dholibajrang") &&
                ed2.getText().toString().equals("dbsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//19
        }else if (ed1.getText().toString().equals("sumandevendra") &&
                ed2.getText().toString().equals("sdsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//20
        }else if (ed1.getText().toString().equals("geetalaal") &&
                ed2.getText().toString().equals("glsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//21
        }else if (ed1.getText().toString().equals("priyankasunil") &&
                ed2.getText().toString().equals("pssikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//22
        }else if (ed1.getText().toString().equals("kamlaphoolchand") &&
                ed2.getText().toString().equals("kpsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//23
        }else if (ed1.getText().toString().equals("bhagwatidinesh") &&
                ed2.getText().toString().equals("bdsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//24
        }else if (ed1.getText().toString().equals("sunitamukesh") &&
                ed2.getText().toString().equals("smsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//25
        }else if (ed1.getText().toString().equals("sunitagirdhari") &&
                ed2.getText().toString().equals("sgsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//26
        }else if (ed1.getText().toString().equals("tijarajendra") &&
                ed2.getText().toString().equals("trsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//27
        }else if (ed1.getText().toString().equals("sanjanavinod") &&
                ed2.getText().toString().equals("svsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//28
        }else if (ed1.getText().toString().equals("malimoolchand") &&
                ed2.getText().toString().equals("mmsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//29
        }else if (ed1.getText().toString().equals("anitababulal") &&
                ed2.getText().toString().equals("rcsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//30
        }else if (ed1.getText().toString().equals("seemamahendra") &&
                ed2.getText().toString().equals("smsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//31
        }else if (ed1.getText().toString().equals("pawanomprakash") &&
                ed2.getText().toString().equals("posikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//32
        }else if (ed1.getText().toString().equals("suakailash") &&
                ed2.getText().toString().equals("sksikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//33
        }else if (ed1.getText().toString().equals("rameshchandra") &&
                ed2.getText().toString().equals("rcsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//34
        }else if (ed1.getText().toString().equals("geetaomprakash") &&
                ed2.getText().toString().equals("gosikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//35
        }else if (ed1.getText().toString().equals("ujalaramesh") &&
            ed2.getText().toString().equals("ursikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//36
        }else if (ed1.getText().toString().equals("jhumamadan") &&
                ed2.getText().toString().equals("jmsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//37
        }else if (ed1.getText().toString().equals("sunitagirdhari") &&
                ed2.getText().toString().equals("sgsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//38
        }else if (ed1.getText().toString().equals("sumitramahendra") &&
                ed2.getText().toString().equals("smsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//39
        }else if (ed1.getText().toString().equals("radhakishan") &&
                ed2.getText().toString().equals("rksikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//40
        }else if (ed1.getText().toString().equals("tanbultulsa") &&
                ed2.getText().toString().equals("ttikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//41
        }else if (ed1.getText().toString().equals("pawantulsa") &&
                ed2.getText().toString().equals("ptsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//42
        }else if (ed1.getText().toString().equals("surjiprabhudayal") &&
                ed2.getText().toString().equals("spsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//43
        }else if (ed1.getText().toString().equals("rajumahadev") &&
                ed2.getText().toString().equals("rmsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//44
        }else if (ed1.getText().toString().equals("bhangirverma") &&
                ed2.getText().toString().equals("bvsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//45
        }else if (ed1.getText().toString().equals("bablimanoj") &&
                ed2.getText().toString().equals("bmsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//46
        }else if (ed1.getText().toString().equals("santoshnathuram") &&
                ed2.getText().toString().equals("snsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//47
        }else if (ed1.getText().toString().equals("rundilate") &&
                ed2.getText().toString().equals("rlsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//48
        }else if (ed1.getText().toString().equals("savitrimurlidhar") &&
                ed2.getText().toString().equals("smsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//49
        }else if (ed1.getText().toString().equals("saritarakesh") &&
                ed2.getText().toString().equals("srsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//50
        }else if (ed1.getText().toString().equals("jadavkailash") &&
                ed2.getText().toString().equals("jksikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//51
        }else if (ed1.getText().toString().equals("santoshrajendra") &&
                ed2.getText().toString().equals("srsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//52
        }else if (ed1.getText().toString().equals("bhagvatishravanlal") &&
                ed2.getText().toString().equals("bssikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//53
        }else if (ed1.getText().toString().equals("sarojdilip") &&
                ed2.getText().toString().equals("sdsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//54
        }else if (ed1.getText().toString().equals("ghinsmangesh") &&
                ed2.getText().toString().equals("gmsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//55
        }else if (ed1.getText().toString().equals("prakashrajendra") &&
                ed2.getText().toString().equals("prsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//56
        }else if (ed1.getText().toString().equals("gharuguman") &&
                ed2.getText().toString().equals("ggsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//57
        }else if (ed1.getText().toString().equals("bhagwatajeen") &&
                ed2.getText().toString().equals("basikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//58
        }else if (ed1.getText().toString().equals("bugalsangram") &&
                ed2.getText().toString().equals("bssikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);

//59
        }else if (ed1.getText().toString().equals("manjumahipal") &&
                ed2.getText().toString().equals("mmsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//60
        }else if (ed1.getText().toString().equals("shravaniram") &&
                ed2.getText().toString().equals("srsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//61
        }else if (ed1.getText().toString().equals("kokilasagarmal") &&
                ed2.getText().toString().equals("kssikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//62
        }else if (ed1.getText().toString().equals("pajjanhari") &&
                ed2.getText().toString().equals("phsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);
//63
        }else if (ed1.getText().toString().equals("sammatabakang") &&
                ed2.getText().toString().equals("sbsikar")) {
            Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
            i.putExtra("username", ed1.getText().toString());
            startActivity(i);}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//64

        else if (ed1.getText().toString().equals("antarsanwat") &&
            ed2.getText().toString().equals("askidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);


    }else if (ed1.getText().toString().equals("reshamisumer") &&
            ed2.getText().toString().equals("rskidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("sunitakrishan") &&
            ed2.getText().toString().equals("skkidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("sitapurn") &&
            ed2.getText().toString().equals("spkidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("vidhyahari") &&
            ed2.getText().toString().equals("vhkidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("gannileela") &&
            ed2.getText().toString().equals("glkidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("sarojashok") &&
            ed2.getText().toString().equals("sakidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("tijabhala") &&
            ed2.getText().toString().equals("tbkidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("premlatavijendra") &&
            ed2.getText().toString().equals("pvkidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("bimalamahabir") &&
            ed2.getText().toString().equals("bmkidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("sharadashankar") &&
            ed2.getText().toString().equals("sskidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("vinodraju") &&
            ed2.getText().toString().equals("vrkidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("sampatijagdish") &&
            ed2.getText().toString().equals("sjkidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("firdoshsharif") &&
            ed2.getText().toString().equals("fskidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("shardasandeep") &&
            ed2.getText().toString().equals("sskidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("akhtarmahboob") &&
            ed2.getText().toString().equals("amkidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);


    }else if (ed1.getText().toString().equals("javitrimansingh") &&
            ed2.getText().toString().equals("jmkidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("sahidaayub") &&
            ed2.getText().toString().equals("sakidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);

    }else if (ed1.getText().toString().equals("tasarimyunus") &&
            ed2.getText().toString().equals("tykidh")) {
        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);


    }else if (ed1.getText().toString().equals("aktarirafik") &&
            ed2.getText().toString().equals("arkidh")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   //Details - Dheendwa Aguna

    }else if (ed1.getText().toString().equals("Daya") &&
            ed2.getText().toString().equals("Shishpal")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

    else if (ed1.getText().toString().equals("Nimo") &&
            ed2.getText().toString().equals("Subhash")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

    else if (ed1.getText().toString().equals("Sarda") &&
            ed2.getText().toString().equals("Shersingh")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

    else if (ed1.getText().toString().equals("Suman") &&
            ed2.getText().toString().equals("Yogesh")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

    else if (ed1.getText().toString().equals("Mani") &&
            ed2.getText().toString().equals("Sagarmal")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

    else if (ed1.getText().toString().equals("Gayari") &&
            ed2.getText().toString().equals("Syodan")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Vimla") &&
            ed2.getText().toString().equals("Shishram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Shanti") &&
            ed2.getText().toString().equals("Puran")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Bhateri") &&
            ed2.getText().toString().equals("Daya")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Mamta") &&
            ed2.getText().toString().equals("Subhash")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Munesh") &&
            ed2.getText().toString().equals("Shankar")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Prem") &&
            ed2.getText().toString().equals("Laxman")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Laxmi") &&
            ed2.getText().toString().equals("Ramswroop")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Bed") &&
            ed2.getText().toString().equals("Rameshwar")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Sumitra") &&
            ed2.getText().toString().equals("Nagar")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Rukmini") &&
            ed2.getText().toString().equals("Liladhar")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Sarita") &&
            ed2.getText().toString().equals("Jaipal")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Parmesvari") &&
            ed2.getText().toString().equals("Dharmchand")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Risal") &&
            ed2.getText().toString().equals("Hoshiyar")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Bhajni") &&
            ed2.getText().toString().equals("Gurudayal")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Sunita") &&
            ed2.getText().toString().equals("Amarchand")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Lalitha") &&
            ed2.getText().toString().equals("Rajendra")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Imarti") &&
            ed2.getText().toString().equals("Amital")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("Sakila") &&
            ed2.getText().toString().equals("Mohmad")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}
    else if (ed1.getText().toString().equals("y") &&
            ed2.getText().toString().equals("y")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Details - JEENI

    else if (ed1.getText().toString().equals("Satyaprakash") &&
            ed2.getText().toString().equals("prakash")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}




    else if (ed1.getText().toString().equals("Praveenpanwar") &&
            ed2.getText().toString().equals("panwar")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}


    else if (ed1.getText().toString().equals("Pushpkanth") &&
            ed2.getText().toString().equals("kanth")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}


    else if (ed1.getText().toString().equals("Manojkumar") &&
            ed2.getText().toString().equals("kumar")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("Rohitash") &&
            ed2.getText().toString().equals("hitash")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("Ramphal") &&
            ed2.getText().toString().equals("mphal")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("Vijendrasingh") &&
            ed2.getText().toString().equals("drasingh")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}




    else if (ed1.getText().toString().equals("Dalip") &&
            ed2.getText().toString().equals("dalip")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("Swadesh") &&
            ed2.getText().toString().equals("wadesh")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}


    else if (ed1.getText().toString().equals("Sanjay") &&
            ed2.getText().toString().equals("anjay")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

    else if (ed1.getText().toString().equals("Hawasingh") &&
            ed2.getText().toString().equals("wasingh")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}


    else if (ed1.getText().toString().equals("Sunilkumar") &&
            ed2.getText().toString().equals("nilkumar")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}


    else if (ed1.getText().toString().equals("Seeshram") &&
            ed2.getText().toString().equals("shram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("Eeshwar") &&
            ed2.getText().toString().equals("eshwar")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

    else if (ed1.getText().toString().equals("Suresh") &&
            ed2.getText().toString().equals("uresh")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

    else if (ed1.getText().toString().equals("Sunilbharia") &&
            ed2.getText().toString().equals("nilbharia")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}


    else if (ed1.getText().toString().equals("Shyamveer") &&
            ed2.getText().toString().equals("yamveer")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("Sanjeevkumar") &&
            ed2.getText().toString().equals("jeevkumar")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}


    else if (ed1.getText().toString().equals("Dharmendar") &&
            ed2.getText().toString().equals("armendar")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////Details - Ramnathpura

    else if (ed1.getText().toString().equals("dharis") &&
            ed2.getText().toString().equals("dhrimnathpura")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

    else if (ed1.getText().toString().equals("ramris") &&
            ed2.getText().toString().equals("rariram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

    else if (ed1.getText().toString().equals("subris") &&
            ed2.getText().toString().equals("suriram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}


    else if (ed1.getText().toString().equals("dilris") &&
            ed2.getText().toString().equals("diriram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}


    else if (ed1.getText().toString().equals("hargan") &&
            ed2.getText().toString().equals("hagaram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("kargan") &&
            ed2.getText().toString().equals("kagaram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("rajgan") &&
            ed2.getText().toString().equals("ragaram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}


    else if (ed1.getText().toString().equals("dhahar") &&
            ed2.getText().toString().equals("dhgaram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("surgok") &&
            ed2.getText().toString().equals("sugoram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}




    else if (ed1.getText().toString().equals("daygok") &&
            ed2.getText().toString().equals("dagoram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}




    else if (ed1.getText().toString().equals("yogkan") &&
            ed2.getText().toString().equals("yokaram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}




    else if (ed1.getText().toString().equals("kriram") &&
            ed2.getText().toString().equals("krraram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}




    else if (ed1.getText().toString().equals("sandha") &&
            ed2.getText().toString().equals("sadhram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}




    else if (ed1.getText().toString().equals("mahmak") &&
            ed2.getText().toString().equals("mamram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}




    else if (ed1.getText().toString().equals("jaymah") &&
            ed2.getText().toString().equals("jamaram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("surmah") &&
            ed2.getText().toString().equals("sumaram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}




    else if (ed1.getText().toString().equals("jagmah") &&
            ed2.getText().toString().equals("jagmaram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}




    else if (ed1.getText().toString().equals("jaiama") &&
            ed2.getText().toString().equals("jaamram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}




    else if (ed1.getText().toString().equals("vijbha") &&
            ed2.getText().toString().equals("vibhram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("mohjag") &&
            ed2.getText().toString().equals("mojaram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("ashmew") &&
            ed2.getText().toString().equals("asmeram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}




    else if (ed1.getText().toString().equals("mansho") &&
            ed2.getText().toString().equals("mashram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("jaisukh") &&
            ed2.getText().toString().equals("jasuram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("surram") &&
            ed2.getText().toString().equals("suraram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}



    else if (ed1.getText().toString().equals("thahee") &&
            ed2.getText().toString().equals("thheram")) {
        Toast.makeText(getApplicationContext(), "Login Successfull.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(LoginActivity.this, LanguagesActivity.class);
        i.putExtra("username", ed1.getText().toString());
        startActivity(i);}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
            tx1.setVisibility(View.VISIBLE);
            tx1.setBackgroundColor(Color.RED);
            counter--;
            tx1.setText(Integer.toString(counter));
            if (counter == 0) {
                b1.setEnabled(false);
                Intent i = new Intent(LoginActivity.this, WelcomeActivity.class);
                startActivity(i);
            }
        }
    }
    public void Registration(View view) {
        Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }
    public void Back(View view) {
        Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
        startActivity(intent);
    }
}