package net.unadeca.mycalculator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Num1,Num2;
    Button Suma,Resta,Multi,Div;
    TextView Resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 =  findViewById(R.id.Num1);
        Num2 =  findViewById(R.id.Num2);

        Suma =  findViewById(R.id.sumar);
        Resta =  findViewById(R.id.restar);
        Multi =  findViewById(R.id.multi);
        Div =  findViewById(R.id.div);

        Suma.setOnClickListener(this);
        Resta.setOnClickListener(this);
        Multi.setOnClickListener(this);
        Div.setOnClickListener(this);

        Resultado = findViewById(R.id.Resultado);
    }

    @Override
    public void onClick(View v) {

        String N1 = Num1.getText().toString();
        String N2 = Num2.getText().toString();

        int entero1 = Integer.parseInt(N1);
        int entero2 = Integer.parseInt(N2);

       int rspt = 0;

        switch (v.getId()){
            case R.id.sumar:
                rspt = entero1 + entero2;
                break;

            case R.id.restar:
                rspt = entero1 - entero2;
                break;
            case R.id.multi:
                rspt = entero1 * entero2;
                break;
            case R.id.div:
                rspt = entero1 / entero2;
                break;
        }
    Resultado.setText(""+rspt);


    }
}
