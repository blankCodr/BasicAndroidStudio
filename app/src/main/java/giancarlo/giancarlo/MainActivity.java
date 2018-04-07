package giancarlo.giancarlo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText firstint;
    private EditText secondint;
    private Button myButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
        firstint = findViewById(R.id.firstint);
        secondint = findViewById(R.id.secondint);
        myButt = findViewById(R.id.myButt);
        myButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(firstint.getText().toString());
                int num2 = Integer.parseInt(secondint.getText().toString());
                int sol=num1+num2;

                Toast.makeText( MainActivity.this, "Sum of Both Numbers: " + String.valueOf(sol).toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}