package id.sch.smktelkom_mlg.tugas01.xirpl6010.tugas1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvCM, tvK, tvJK, tvMT, tvHN, tvHC, tvGD, tvMR;
    CheckBox cbLT, cbSP, cbWR;
    RadioButton rbM, rbFM;
    EditText etNama;
    Spinner spKL;
    Button btSB;
    RadioGroup rgG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgG = (RadioGroup) findViewById(R.id.radioGroupG);

        tvCM = (TextView) findViewById(R.id.textViewCM);
        tvK = (TextView) findViewById(R.id.textViewK);
        tvJK = (TextView) findViewById(R.id.textViewJK);
        tvMT = (TextView) findViewById(R.id.textViewMT);
        tvHN = (TextView) findViewById(R.id.textViewHN);
        tvGD = (TextView) findViewById(R.id.textViewGD);
        tvHC = (TextView) findViewById(R.id.textViewHC);
        tvMR = (TextView) findViewById(R.id.textViewMR);

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
                doProcess();
                doClick();
            }
        });

    }

    private void doProcess() {
        String name = etNama.getText().toString();
        tvHN.setText("Name : " + name);
    }

    private void doClick() {
        tvHC.setText("Class : " + spKL.getSelectedItem().toString());

    }

    private boolean isValid() {
        boolean valid = true;

        String name = etNama.getText().toString();

        if (name.isEmpty()) {
            etNama.setError("You should fill your full name");
            valid = false;
        } else if (etNama.length() < 3) {
            etNama.setError("Fill your full name");
            valid = false;
        } else {
            etNama.setError(null);
        }
        return false;
    }
}
