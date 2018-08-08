package gictitc.storygame.storygame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bHorror,bDrama,bSciFi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bHorror=findViewById(R.id.bHorror);
        bHorror.setOnClickListener(this);

        bDrama=findViewById(R.id.bDrama);
        bDrama.setOnClickListener(this);

        bSciFi=findViewById(R.id.bSciFi);
        bSciFi.setOnClickListener(this);
    }





}
