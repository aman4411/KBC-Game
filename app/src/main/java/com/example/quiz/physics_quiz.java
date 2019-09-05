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

public class physics_quiz extends AppCompatActivity implements TextToSpeech.OnInitListener {

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
        setContentView(R.layout.activity_physics_quiz);

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

                        question.setText("Q1. Which of the following pairs represent two scalar quantities?");
                        rb1.setText("Mass, Acceleration");
                        rb2.setText("Temperature, Torque");
                        rb3.setText("Distance, Speed");
                        rb4.setText("Gravitational Intansity, Work");

                        n++;
                        break;
                    }

                    case 2 :

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

                        question.setText("Q2. The motion of an object under free fall is an example of which of the following?");
                        rb1.setText("Uniform Velocity");
                        rb2.setText("Uniform Acceleration");
                        rb3.setText("Zero Acceleration");
                        rb4.setText("Non-Uniform Acceleration");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
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

                        question.setText("Q3. Kepler's second law is also known as:");
                        rb1.setText("Law of Periods");
                        rb2.setText("Law of Planets");
                        rb3.setText("Law of Orbits");
                        rb4.setText("Law of Areas");


                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 4 :

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

                        question.setText("Q4. The value of acceleration due to gravity is minimum on which of these planets?");
                        rb1.setText("Mars");
                        rb2.setText("Mercury");
                        rb3.setText("Jupiter");
                        rb4.setText("Neptune");

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

                        question.setText("Q5. Which of the following is the commercial unit of electric power? ");
                        rb1.setText("Joule");
                        rb2.setText("KWh");
                        rb3.setText("Watt");
                        rb4.setText("Ampere");

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

                        question.setText("Q6.What is the work done to move a unit charge from point to another called as?");
                        rb1.setText("Current");
                        rb2.setText("Resistance");
                        rb3.setText("Conductance");
                        rb4.setText("Potential Difference");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 7 :

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

                        question.setText("Q7. What is the total charge of the electric dipole?");
                        rb1.setText("0");
                        rb2.setText("-1");
                        rb3.setText("+1");
                        rb4.setText("None of the Above");

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

                        question.setText("Q8. What is the refractive index of water?");
                        rb1.setText("1");
                        rb2.setText("1.54");
                        rb3.setText("1.33");
                        rb4.setText("1.78");


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

                        question.setText("Q9 What causes the twinkling of stars?");
                        rb1.setText("Atmospheric Refraction of Starlight");
                        rb2.setText("Dispersion of Starlight");
                        rb3.setText("Scattering of Starlight");
                        rb4.setText("None Of the Above");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 10 :

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

                        question.setText("Q10. Which of the following is correct about Pressure?");
                        rb1.setText("Pressure is Scalar Quantity.");
                        rb2.setText("Pressure is Vector Quantity.");
                        rb3.setText("Pressure is Scalar Quantity but obeys vector law.");
                        rb4.setText("None of the Above");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 11 : {
                        if(rb1.isChecked())
                        {
                            score+=10;
                            Toast.makeText(getApplicationContext(),"Correct Answer \nScore : " +score,Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Incorrect Answer \nCorrect Answer : " +rb1.getText(),Toast.LENGTH_LONG).show();
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
