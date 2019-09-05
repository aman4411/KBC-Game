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

public class politics_quiz extends AppCompatActivity implements TextToSpeech.OnInitListener {

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
        setContentView(R.layout.activity_politics_quiz);

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

                        question.setText("Q1. How long a person should have practiced in a High Court to be eligible to be appointed as a Judge of Supreme Court of India?");
                        rb1.setText("10 Years");
                        rb2.setText("12 Years");
                        rb3.setText("15 Years");
                        rb4.setText("20 Years");

                        n++;
                        break;
                    }

                    case 2 :

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

                        question.setText("Q2. Which Indian State has the largest number of seats reserved for the Scheduled Tribes in the Lok Sabha?");
                        rb1.setText("Madhya Pradesh");
                        rb2.setText("Rajasthan");
                        rb3.setText("Andhra Pradesh");
                        rb4.setText("Gujarat");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 3 :

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

                        question.setText("Q3. The resolution for removing the Vice-President of India can be moved in :");
                        rb1.setText("Lok Sabha only");
                        rb2.setText("Rajya Sabha only");
                        rb3.setText("Either of the two houses of the Parliament");
                        rb4.setText("Joint Sitting of the two houses of the Parliament");


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

                        question.setText("Q4. Which of the following is the largest Lok Sabha constituency (Areawise)?");
                        rb1.setText("Arunachal Pradesh");
                        rb2.setText("Ladakh");
                        rb3.setText("Balmer");
                        rb4.setText("Kutch");

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

                        question.setText("Q5. The Election Commission of India is not concerned with the elections of the : ");
                        rb1.setText("President");
                        rb2.setText("Vice President");
                        rb3.setText("Panchayats and Municipalities in the State");
                        rb4.setText("All of the Above");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 6 :

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

                        question.setText("Q6.Legislature of the Union which is called ‘Parliament’ consists of :");
                        rb1.setText("Lok Sabha");
                        rb2.setText("Rajya Sabha");
                        rb3.setText("Rajya Sabha and Lok Sabha");
                        rb4.setText("President, Rajya Sabha and Lok Sabha");

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

                        question.setText("Q7. Poll Monitoring System was implemented in which among the following states of India for the first time?");
                        rb1.setText("Goa");
                        rb2.setText("Manipur");
                        rb3.setText("Assam");
                        rb4.setText("Tripura");

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

                        question.setText("Q8. What is the maximum number of candidates which EVMs (Electronic Voting Machine) can cater to?");
                        rb1.setText("32");
                        rb2.setText("64");
                        rb3.setText("78");
                        rb4.setText("100");


                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
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

                        question.setText("Q9 Normally, under the Election Commission’s norms, how far can a polling station be from your house?");
                        rb1.setText("1 Km");
                        rb2.setText("2 Km");
                        rb3.setText("3 Km");
                        rb4.setText("4 Km");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 10 :

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

                        question.setText("Q10. What has been the maximum number of candidates in any constituency in India at any election so far?");
                        rb1.setText("133");
                        rb2.setText("333");
                        rb3.setText("533");
                        rb4.setText("1033");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        break;
                    }

                    case 11 : {
                        if(rb4.isChecked())
                        {
                            score+=10;
                            Toast.makeText(getApplicationContext(),"Correct Answer \nScore : " +score,Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Incorrect Answer \nCorrect Answer : " +rb4.getText(),Toast.LENGTH_LONG).show();
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
