package dumobile.com.diosgrafis.konvertersuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText fieldCelsius;
    EditText fieldFarenheit;
    Button buttonConvert;
    private int masukan;
    private float tampungan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fieldCelsius = (EditText)findViewById(R.id.field_celcius);
        fieldFarenheit = (EditText)findViewById(R.id.field_farenheit);
        buttonConvert = (Button)findViewById(R.id.button_convert);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fieldCelsius.getText().toString().length()== 0){
                    Toast.makeText(v.getContext(),"Ojo kosong to!",Toast.LENGTH_LONG).show();
                }else{
                    masukan = Integer.parseInt(fieldCelsius.getText().toString());
                    tampungan = ((masukan*9)/5)+32;
                    fieldFarenheit.setText(String.valueOf(tampungan));
                }
            }
        });

    }
}
