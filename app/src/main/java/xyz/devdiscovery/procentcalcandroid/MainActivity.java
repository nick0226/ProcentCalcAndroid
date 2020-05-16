package xyz.devdiscovery.procentcalcandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result_number;
    private TextView number_proc;
    private TextView number;
    private Button result_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result_number = (TextView) findViewById(R.id.result_number);
        number_proc = (TextView) findViewById(R.id.number_proc);
        number = (TextView) findViewById(R.id.number);
        result_btn = (Button) findViewById(R.id.result_btn);

    }

public void onClick (View view) {

        double a, b, c;

        //Считаем с editText и editText2 текстовые значения
        String S1 = number_proc.getText().toString();
        String S2 = number.getText().toString();

        //Преобразуем текстовые переменные в числовые значения
        a = Double.parseDouble(S1);
        b = Double.parseDouble(S2);

        c = a * b / 100;

        //Преобразуем ответ в число
        String answer = Double.toString(c);

        //Выведем текст в textView
        result_number.setText(answer);
}

}
