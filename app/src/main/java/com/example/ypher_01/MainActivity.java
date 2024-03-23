package com.example.ypher_01;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);

        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
    }

    public void btnclickchypher(View view){

                EditText editMainText = findViewById(R.id.editMainText);
                EditText editReturnText = findViewById((R.id.editReturnText));
                String s = editMainText.getText().toString();
                EditText editKlitch = findViewById(R.id.editKlitch);
                String klitch = editKlitch.getText().toString();
                Chypher k = new Chypher();
                try {
                    String result = k.zaschifr(s, klitch);
                    editReturnText.setText(result);
                }
                catch (IndexOutOfBoundsException e){
                    e.getMessage();

                }





        }



    public void btn2clikDechypher(View view){
        EditText editReturntext2 = findViewById(R.id.editReturnText2);
        EditText editdeschypherReturnText = findViewById(R.id.editDechifrReturnText);
        String f = editReturntext2.getText().toString();
        EditText editklitch2 = findViewById(R.id.editKlitsh2);
        String klitsch2 = editklitch2.getText().toString();
        Chypher b = new Chypher();
        try {
            String result2 = b.Dechypher(f, klitsch2);
            editdeschypherReturnText.setText(result2);
        }
        catch (IndexOutOfBoundsException e){
            e.getMessage();
        }

    }
}