package ao.co.isptec.aplm.exercise_1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        output = findViewById(R.id.outputTextView);

        String outputText = getIntent().getStringExtra("keyInput");

        output.setText(outputText);
    }
}