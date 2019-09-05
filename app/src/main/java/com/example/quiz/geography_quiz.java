package com.example.quiz;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class geography_quiz extends AppCompatActivity implements TextToSpeech.OnInitListener {

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
        tts = new TextToSpeech(this,this);


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

                        question.setText("Q1. Which of the following countries shares the largest border length with India:");
                        rb1.setText("China");
                        rb2.setText("Bangladesh");
                        rb3.setText("Pakistan");
                        rb4.setText("Nepal");

                        n++;
                        break;
                    }

                    case 2 :

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

                        question.setText("Q2. Which of the following Mountain passes forms the ‘tri-junction’ of India,China and Myanmar?");
                        rb1.setText("Nathu La");
                        rb2.setText("Jelep La");
                        rb3.setText("Bomdi La");
                        rb4.setText("Diphu");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 3 :

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

                        question.setText("Q3. Which of the following mountain ranges form a dividing line between the Ganges Plain and the Deccan Plateau?");
                        rb1.setText("Aravalli");
                        rb2.setText("Vindhya");
                        rb3.setText("Satpura");
                        rb4.setText("Ajanta");


                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
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

                        question.setText("Q4. Murugappa Gold Cup is related to which among the following sports?");
                        rb1.setText("Football");
                        rb2.setText("Hockey");
                        rb3.setText("Cricket");
                        rb4.setText("Table Tennis");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 5 :

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

                        question.setText("Q5. The famous hill-station ‘Kodaikanal’ lies in : ");
                        rb1.setText("Nilgiri hills");
                        rb2.setText("Palani hills");
                        rb3.setText("Cardamom hills");
                        rb4.setText("Javadi hills");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 6 :

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

                        question.setText("Q6.Which of the following Indian States/UT has the maximum percentage of mangrove cover in the country ?");
                        rb1.setText("Gujarat");
                        rb2.setText("West Bengal");
                        rb3.setText("Andaman and Nicobar");
                        rb4.setText("Orissa");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 7 :

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

                        question.setText("Q7. Asia’s largest tulip garden is located in which state?");
                        rb1.setText("Jammu & Kashmir");
                        rb2.setText("Assam");
                        rb3.setText("Sikkim");
                        rb4.setText("Uttarakhand");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 8 :

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

                        question.setText("Q8. Which of the following states is/are not a part of Western Ghats?");
                        rb1.setText("Gujarat");
                        rb2.setText("Tamil Nadu");
                        rb3.setText("Andhra Pradesh");
                        rb4.setText("Both b and c");


                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 9 :

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

                        question.setText("Q9 How many states of India share its border with Bhutan?");
                        rb1.setText("2");
                        rb2.setText("3");
                        rb3.setText("4");
                        rb4.setText("5");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 10 :

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

                        question.setText("Q10.The Gandhi Sagar Dam is built on which river in Madhya Pradesh?");
                        rb1.setText("Narmada");
                        rb2.setText("Chambal");
                        rb3.setText("Son");
                        rb4.setText("Tapti");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
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
