package id.sch.smktelkom_mlg.tugas01.xirpl6010.tugas1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvCM, tvK, tvJK, tvMT, tvHasil;
    CheckBox cbLT, cbSP, cbWR;
    RadioButton rbM, rbFM;
    EditText etNama;
    Spinner spKL;
    Button btSB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCM = (TextView) findViewById(R.id.textViewCM);
        tvK = (TextView) findViewById(R.id.textViewK);
        tvJK = (TextView) findViewById(R.id.textViewJK);
        tvMT = (TextView) findViewById(R.id.textViewMT);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        cbLT = (CheckBox) findViewById(R.id.checkBoxLT);
        cbSP = (CheckBox) findViewById(R.id.checkBoxSP);
        cbWR = (CheckBox) findViewById(R.id.checkBoxWR);

        rbM = (RadioButton) findViewById(R.id.radioButtonM);
        rbFM = (RadioButton) findViewById(R.id.radioButtonFM);

        etNama = (EditText) findViewById(R.id.editTextNama);

        spKL = (Spinner) findViewById(R.id.spinnerKL);

        btSB = (Button) findViewById(R.id.buttonSB);
        btSB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String name = etNama.getText().toString();
                tvHasil.setText("Name : " + name + "\n Class :" + spKL.getSelectedItem().toString());
            }
        });

    }
}
