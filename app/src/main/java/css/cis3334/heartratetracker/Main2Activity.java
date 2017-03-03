package css.cis3334.heartratetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.R.attr.name;
import static css.cis3334.heartratetracker.R.id.textViewPulse;

public class Main2Activity extends AppCompatActivity {

    TextView tvPulse;
    TextView tvRange;
    String pulse;
    String range;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvPulse = (TextView) findViewById(R.id.textViewPulse);
        tvRange = (TextView) findViewById(R.id.textViewRange);


        Bundle extras = getIntent().getExtras();

        pulse = extras.getSerializable("MainPulse").toString();
        range = extras.getSerializable("MainRange").toString();

        tvPulse.setText("Pulse: " + pulse);
        tvRange.setText("Range: " + range);

    }


}


