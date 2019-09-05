package com.example.quiz;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    int score = 0;
    int n =1;
    TextView question,title;
    EditText name;
    RadioGroup rdg;
    RadioButton rb1,rb2,rb3,rb4;
    Button submit,speak;
    TextToSpeech tts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question=findViewById(R.id.question);
        name=findViewById(R.id.name);
        title=findViewById(R.id.getname);
        rdg=findViewById(R.id.rdg);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        rb4=findViewById(R.id.rb4);
        submit=findViewById(R.id.submit);
        speak=findViewById(R.id.speak);

        tts=new TextToSpeech(this,this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setVisibility(View.GONE);
                submit.setText("Next");


                switch (n)
                {
                    case 1 :
                    {   title.setText(name.getText());
                        question.setVisibility(View.VISIBLE);
                        rdg.setVisibility(View.VISIBLE);
                        speak.setVisibility(View.VISIBLE);
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);

                        question.setText("Q1. Which Industry in India is the maximum consumer of water?");
                        rb1.setText("Textile");
                        rb2.setText("Engineering");
                        rb3.setText("Paper & Pulp");
                        rb4.setText("Thermal");

                        n++;
                        break;
                    }

                    case 2 :

                    {
                        if(rb4.isChecked())
                        {
                            score+=10;
                            Toast.makeText(getApplicationContext(),"Correct Answer \nScore : " +score,Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Incorrect Answer \nCorrect Answer : " +rb4.getText(),Toast.LENGTH_LONG).show();
                        }

                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);

                        question.setText("Q2. Which one of the following city is known as cottonopolis of India?");
                        rb1.setText("Ahmedabad");
                        rb2.setText("Mumbai");
                        rb3.setText("Surat");
                        rb4.setText("Kolkata");

                        n++;

                        break;
                    }

                    case 3 :

                    {
                       if(rb2.isChecked())
                        {
                            score+=10;
                            Toast.makeText(getApplicationContext(),"Correct Answer \nScore : " +score,Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Incorrect Answer \nCorrect Answer : " +rb2.getText(),Toast.LENGTH_LONG).show();
                        }

                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);

                        question.setText("Q3. Which one is India's largest city in population?");
                        rb1.setText("Delhi");
                        rb2.setText("Mumbai");
                        rb3.setText("Chennai");
                        rb4.setText("Pune");

                        n++;
                        break;
                    }

                    case 4 :

                    {
                      if(rb2.isChecked())
                        {
                            score+=10;
                            Toast.makeText(getApplicationContext(),"Correct Answer \nScore : " +score,Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Incorrect Answer \nCorrect Answer : " +rb2.getText(),Toast.LENGTH_LONG).show();
                        }

                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);

                        question.setText("Q4. Which state is known as India's Spice Garden?");
                        rb1.setText("Kerala");
                        rb2.setText("Karnataka");
                        rb3.setText("Assam");
                        rb4.setText("Andhra Pradesh");

                        n++;
                        break;
                    }

                    case 5 :

                    {
                        if(rb1.isChecked())
                        {
                            score+=10;
                            Toast.makeText(getApplicationContext(),"Correct Answer \nScore : " +score,Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Incorrect Answer \nCorrect Answer : " +rb1.getText(),Toast.LENGTH_LONG).show();
                        }

                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);

                        question.setText("Q5. Project Tiger in India was started in the year?");
                        rb1.setText("1984");
                        rb2.setText("1970");
                        rb3.setText("1965");
                        rb4.setText("1973");

                        n++;
                        break;
                    }

                    case 6 :

                    {
                        if(rb4.isChecked())
                        {
                            score+=10;
                            Toast.makeText(getApplicationContext(),"Correct Answer \nScore : " +score,Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Incorrect Answer \nCorrect Answer : " +rb4.getText(),Toast.LENGTH_LONG).show();
                        }

                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);

                        question.setText("Q6. In which year was the capital of India shifted from Calcutta to Delhi?");
                        rb1.setText("1918");
                        rb2.setText("1907");
                        rb3.setText("1911");
                        rb4.setText("1916");

                        n++;
                        break;
                    }

                    case 7 :

                    {
                        if(rb3.isChecked())
                        {
                            score+=10;
                            Toast.makeText(getApplicationContext(),"Correct Answer \nScore : " +score,Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Incorrect Answer \nCorrect Answer : " +rb3.getText(),Toast.LENGTH_LONG).show();
                        }

                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);

                        question.setText("Q7. Where the largest shipyard in India is located?");
                        rb1.setText("Mumbai");
                        rb2.setText("Vishakhapatnam");
                        rb3.setText("Kochi");
                        rb4.setText("Chennai");

                        n++;
                        break;
                    }

                    case 8 :

                    {
                      if(rb3.isChecked())
                        {
                            score+=10;
                            Toast.makeText(getApplicationContext(),"Correct Answer \nScore : " +score,Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Incorrect Answer \nCorrect Answer : " +rb3.getText(),Toast.LENGTH_LONG).show();
                        }

                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);

                        question.setText("Q8. Which one is the oldest mountain range in India?");
                        rb1.setText("Himalayas");
                        rb2.setText("Aravalli");
                        rb3.setText("Starupa");
                        rb4.setText("Nilgiri");

                        n++;
                        break;
                    }

                    case 9 :

                    {
                      if(rb2.isChecked())
                        {
                            score+=10;
                            Toast.makeText(getApplicationContext(),"Correct Answer \nScore : " +score,Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Incorrect Answer \nCorrect Answer : " +rb2.getText(),Toast.LENGTH_LONG).show();
                        }

                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);

                        question.setText("Q9 Which one is longest river in South India?");
                        rb1.setText("Kaveri");
                        rb2.setText("Krishna");
                        rb3.setText("Vaigai");
                        rb4.setText("Godavari");

                        n++;
                        break;
                    }

                    case 10 :

                    {
                        if(rb4.isChecked())
                        {
                            score+=10;
                            Toast.makeText(getApplicationContext(),"Correct Answer \nScore : " +score,Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Incorrect Answer \nCorrect Answer : " +rb4.getText(),Toast.LENGTH_LONG).show();
                        }

                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);

                        question.setText("Q10. Total number of spokes present in the Ashoka Chakra?");
                        rb1.setText("18");
                        rb2.setText("24");
                        rb3.setText("26");
                        rb4.setText("12");

                        n++;
                        break;
                    }

                    case 11 : {
                        if(rb2.isChecked())
                        {
                            score+=10;
                            Toast.makeText(getApplicationContext(),"Correct Answer \nScore : " +score,Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Incorrect Answer \nCorrect Answer : " +rb2.getText(),Toast.LENGTH_LONG).show();
                        }
                        n++;
                        rdg.setVisibility(View.INVISIBLE);
                        speak.setVisibility(View.GONE);
                        submit.setText("Go to Main Screen");
                        question.setText("Thanks " +name.getText()+ " for taking quiz. \n Total Score : " + score + "/100");
                        speakOut();
                    }

                    case 12 :
                    {
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(getApplicationContext(),Menu.class);
                                startActivity(i);
                            }
                        });
                        break;
                    }
                }
            }
        });
               speak.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       speakOut();
                   }
               });

    }

    @Override
    public void onInit(int status) {
        if(status==TextToSpeech.SUCCESS)
        {
            int result = tts.setLanguage(Locale.US);
            if(result==TextToSpeech.LANG_MISSING_DATA || result==TextToSpeech.LANG_NOT_SUPPORTED)
            {
                Log.e("TTS","This Language is not Supported");
            }else {
                speak.setEnabled(true);
                speakOut();
            }
        }
    }

    public void speakOut(){
     String data = question.getText().toString();
     tts.speak(data,TextToSpeech.QUEUE_FLUSH,null);
    }

    @Override
    protected void onDestroy() {
        if(tts!=null)
        {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
}
