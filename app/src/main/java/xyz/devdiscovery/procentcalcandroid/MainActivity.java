package xyz.devdiscovery.procentcalcandroid;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

     //   if( number_proc.getText().toString().length() == 0 )
     //       number_proc.setError( "Поле не может быть пустым" );

        number = (TextView) findViewById(R.id.number);

     //   if( number.getText().toString().length() == 0 )
     //       number.setError( "Поле не может быть пустым" );

        result_btn = (Button) findViewById(R.id.result_btn);

    }

public void onClick (View view) {

        double a, b, c;

        //Считаем с editText и editText2 текстовые значения
        String S1 = number_proc.getText().toString();
    if (number_proc.getText().toString().isEmpty())
    {
        emptyField();
        //Toast.makeText(this, "Поле не может быть пустым ", Toast.LENGTH_SHORT).show();
        return;
    }
        String S2 = number.getText().toString();
    if (number.getText().toString().isEmpty())
    {
        emptyField();
        //Toast.makeText(this, "Поле не может быть пустым ", Toast.LENGTH_SHORT).show();
        return;
    }
        //Преобразуем текстовые переменные в числовые значения
        a = Double.parseDouble(S1);
        b = Double.parseDouble(S2);

        c = a * b / 100;

        //Преобразуем ответ в число
        String answer = Double.toString(c);

        //Выведем текст в textView
        result_number.setText(answer);


        //Сброс данных с полей, после получения результата
        number_proc.setText("");
        number.setText("");
}

public void emptyField () {
    Toast.makeText(getApplicationContext(), "Поля не могут быть пустыми, заполните их", Toast.LENGTH_LONG).show();

    };

}
