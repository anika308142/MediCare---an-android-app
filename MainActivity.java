package com.rbf.technology.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxQuesn1;
    TextView textViewDisplayAnswer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxQuesn1 = findViewById(R.id.checkBoxFruit1);
        checkBoxQuesn1 = findViewById(R.id.checkBoxFruit2);
        checkBoxQuesn1 = findViewById(R.id.checkBoxFruit3);
        checkBoxQuesn1 = findViewById(R.id.checkBoxFruit4);

        textViewDisplayAnswer1 = findViewById(R.id.textViewAnswerQ1);


    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBoxFruit1:
                if (checked){
                    textViewDisplayAnswer1.setText("Right");
                }
                // Put some meat on the sandwich
            //else if (checked){ }
                // Remove the meat

                break;
            case R.id.checkBoxFruit2:
                if (checked){
                    textViewDisplayAnswer1.setText("Wrong");
                }
                // Cheese me
            //else
                // I'm lactose intolerant
                break;
            case R.id.checkBoxFruit3:
                if (checked){
                    textViewDisplayAnswer1.setText("Yes");
                }
                break;
            case R.id.checkBoxFruit4:
                if (checked){
                    textViewDisplayAnswer1.setText("No");
                }
                break;

            // TODO: Veggie sandwich
        }
    }
}
