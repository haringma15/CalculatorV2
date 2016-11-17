package at.fh.swengb.calculatorv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayAbout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_about);

        Intent intent = getIntent();
        String result = intent.getStringExtra("Result");

        TextView view = (TextView) findViewById(R.id.lblOutput);

        view.setText(result);
    }
}
