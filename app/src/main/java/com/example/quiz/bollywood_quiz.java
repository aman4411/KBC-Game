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

public class bollywood_quiz extends AppCompatActivity implements TextToSpeech.OnInitListener {

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
        setContentView(R.layout.activity_bollywood_quiz);

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

                        question.setText("Q1. What are John Abraham and Akshay Kumar's professions in Garam Masala?");
                        rb1.setText("Reporters");
                        rb2.setText("Photographers");
                        rb3.setText("Prophesors");
                        rb4.setText("Lawyers");

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

                        question.setText("Q2. From where does Veeru propose to Basanti in Sholay?");
                        rb1.setText("Top of a roof");
                        rb2.setText("Top of a ladder");
                        rb3.setText("Top of hill");
                        rb4.setText("Top of a water tank.");

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

                        question.setText("Q3. Who apart from Aamir Khan, wants to marry Preity Zinta in Dil Chahta Hai?");
                        rb1.setText("Shahrukh Khan");
                        rb2.setText("Ayub Khan");
                        rb3.setText("Saif Ali Khan");
                        rb4.setText("Akshay Khanna");


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

                        question.setText("Q4. Madhuri Dixit's name in N Chandra's 'Tezaab' was...?");
                        rb1.setText("Mohini");
                        rb2.setText("Maya");
                        rb3.setText("Pooja");
                        rb4.setText("Sapna");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
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

                        question.setText("Q5. Which of these actors has never appeared in television advertisements?");
                        rb1.setText("Shah Rukh Khan");
                        rb2.setText("Govinda");
                        rb3.setText("Anil Kapoor");
                        rb4.setText("Akshay Kumar");

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

                        question.setText("Q6. In which film did Aishwarya Rai pretended to play twins?");
                        rb1.setText("Josh");
                        rb2.setText("Jeans");
                        rb3.setText("Dhoom2");
                        rb4.setText("Devdas");

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

                        question.setText("Q7. Who played Mrs Khiladi in Mr And Mrs Khiladi?");
                        rb1.setText("Raveena Tondon");
                        rb2.setText("Karishma Kapoor");
                        rb3.setText("Juhi Chawla");
                        rb4.setText("Manisha Koirala");

                        n++;
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                        rb4.setChecked(false);
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

                        question.setText("Q8. Before Akshay Kumar became an actor, he worked as a...?");
                        rb1.setText("Clerk");
                        rb2.setText("Reporter");
                        rb3.setText("Waiter");
                        rb4.setText("Journalist");


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

                        question.setText("Q9  Who does Salman want to marry in Hum Aapke Hain Kaun?");
                        rb1.setText("Bhbhi's Sister");
                        rb2.setText("Friend's Sister");
                        rb3.setText("Mama's Daughter");
                        rb4.setText("A Friend");

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

                        question.setText("Q10. In which year did Amitabh Bachchan debut in Hindi cinema?");
                        rb1.setText("1960");
                        rb2.setText("1965");
                        rb3.setText("1969");
                        rb4.setText("1972");

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

    public void speakOut(){
        String data = question.getText().toString();
        tts.speak(data,TextToSpeech.QUEUE_FLUSH,null);
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
