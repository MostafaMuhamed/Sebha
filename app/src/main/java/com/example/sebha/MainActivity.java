package com.example.sebha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView textView;
    private CardView cardViewTasbeh,cardViewRefresh;
    private int numberCounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initalViews();
        getClick();
    }


    private void initalViews()
    {
        textView = findViewById(R.id.txt_tasbeh);
        cardViewTasbeh = findViewById(R.id.img_sebha);
        cardViewRefresh = findViewById(R.id.img_refresh);
    }

    private void getClick()
    {
        cardViewTasbeh.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                numberCounter = numberCounter + 1;
                textView.setText(numberCounter+"");
            }
        });
        cardViewRefresh.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                numberCounter = 0;
                textView.setText(numberCounter+"");
            }
        });
    }

}
