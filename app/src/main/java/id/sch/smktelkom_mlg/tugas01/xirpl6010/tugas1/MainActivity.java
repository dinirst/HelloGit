package id.sch.smktelkom_mlg.tugas01.xirpl6010.tugas1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvCM, tvK, tvJK, tvMT, tvHasil;
    CheckBox cbLT, cbSP, cbWR;
    RadioButton rbM, rbFM;
    Button btSB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
