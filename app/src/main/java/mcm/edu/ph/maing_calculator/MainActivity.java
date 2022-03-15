package mcm.edu.ph.maing_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button op1,op2,op3,op4,op5;
    EditText in1,in2;
    double d1,d2;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op1 = (Button) findViewById(R.id.buttonPlus);
        op2 = (Button) findViewById(R.id.buttonMinus);
        op3 = (Button) findViewById(R.id.buttonMultiply);
        op4 = (Button) findViewById(R.id.buttonDivide);
        op5 = (Button) findViewById(R.id.buttonModulo);
        op1.setOnClickListener(this);
        op2.setOnClickListener(this);
        op3.setOnClickListener(this);
        op4.setOnClickListener(this);
        op5.setOnClickListener(this);

        in1 = findViewById(R.id.firstVar);
        in2 = findViewById(R.id.secondVar);

        answer = findViewById(R.id.answer);
    }

    @Override
    public void onClick(View v) {

        d1 = Double.parseDouble(in1.getText().toString());
        d2 = Double.parseDouble(in2.getText().toString());

        switch (v.getId()) {
            case R.id.buttonPlus:
                calculate(d1, d2, answer,0);
                break;
            case R.id.buttonMinus:
                calculate(d1, d2, answer,1);
                break;
            case R.id.buttonMultiply:
                calculate(d1, d2, answer,2);
                break;
            case R.id.buttonDivide:
                calculate(d1, d2, answer,3);
                break;
            case R.id.buttonModulo:
                calculate(d1, d2, answer,4);
                break;
        }
    }
    public void calculate(double d1,double d2,TextView answer, int op) {
        switch (op) {
            case 0:
                answer.setText(Double.toString(d1 + d2));
                break;
            case 1:
                answer.setText(Double.toString(d1 - d2));
                break;
            case 2:
                answer.setText(Double.toString(d1 * d2));
                break;
            case 3:
                answer.setText(Double.toString(d1 / d2));
                break;
            case 4:
                answer.setText(Double.toString(d1 % d2));
                break;
        }
    }
}
