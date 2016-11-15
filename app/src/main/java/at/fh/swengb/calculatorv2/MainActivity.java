package at.fh.swengb.calculatorv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textSideA;
    EditText textSideB;
    EditText textHeight;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textSideA = (EditText) findViewById(R.id.txtbxSideA);
        textSideB = (EditText) findViewById(R.id.txtbxSideB);
        textHeight = (EditText) findViewById(R.id.txtbxHeight);
        resultView = (TextView) findViewById(R.id.lblResult);
    }

    public void calcSurfaceArea(View view){

        String SideAString = textSideA.getText().toString();
        String SideBString = textSideB.getText().toString();
        String HeightString = textHeight.getText().toString();

        double sideA = 0;
        double sideB = 0;
        double height = 0;

        try {

            sideA = Double.parseDouble(SideAString);
            sideB = Double.parseDouble(SideBString);
            height = Double.parseDouble(HeightString);

            double result = 2 * sideA * sideB + 2 * sideA * height + 2 * sideB * height;

            resultView.setText(String.format("" + result));

        } catch (NumberFormatException e) {
            resultView.setText("WRONG INPUT");
            e.printStackTrace();
        }
    }
}