package realine.net.traditional;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final int YOUNG_LIMIT = 30;
    private static final int AGE_LIMIT = 100;

    private Button refreshButton;
    private TextView userName;
    private TextView userAge;
    private TextView userYoung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refreshButton = (Button) findViewById(R.id.refresh_button);
        userName = (TextView)findViewById(R.id.username);
        userAge = (TextView)findViewById(R.id.userage);
        userYoung = (TextView)findViewById(R.id.useryoung);

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onUpdateUI();
            }
        });
    }

    private void onUpdateUI(){
        //ser user name
        userName.setText("Yang is ");
        userYoung.setText("Yang is young!");

        //set user age & bkcolor
        int age = new Random().nextInt((AGE_LIMIT - 1) + 1) + 1;
        userAge.setText( String.valueOf(age) + " years old" );

        //check if user young
        boolean isYoung = age < YOUNG_LIMIT;

        if ( isYoung ){
            userAge.setBackgroundColor( Color.GREEN);
            userYoung.setVisibility(View.VISIBLE);
        }
        else{
            userAge.setBackgroundColor( Color.RED);
            userYoung.setVisibility(View.INVISIBLE);
        }
    }
}
