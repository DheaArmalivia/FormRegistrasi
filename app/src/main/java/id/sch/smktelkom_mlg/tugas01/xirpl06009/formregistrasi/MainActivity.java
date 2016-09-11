package id.sch.smktelkom_mlg.tugas01.xirpl06009.formregistrasi;

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

    EditText eTuser, eTln, eTemail, eTaddress, eTnumber;
    Button bSub;
    RadioButton rBB, rBM, rBE;
    RadioGroup rGLevel;
    TextView Res;
    Spinner spCity;
    CheckBox cBHtml, cBCss, cBJava, cBVB, cBC, cBDel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTuser = (EditText) findViewById(R.id.editTextUname);
        eTln = (EditText) findViewById(R.id.editTextLname);
        eTemail = (EditText) findViewById(R.id.editTextEmail);
        eTaddress = (EditText) findViewById(R.id.editTextAddress);
        eTnumber = (EditText) findViewById(R.id.editTextNumber);

        rBB = (RadioButton) findViewById(R.id.radioButtonB);
        rBM = (RadioButton) findViewById(R.id.radioButtonM);
        rBE = (RadioButton) findViewById(R.id.radioButtonE);

        rGLevel = (RadioGroup) findViewById(R.id.level);
        spCity = (Spinner) findViewById(R.id.spinnerKota);

        bSub = (Button) findViewById(R.id.buttonSub);

        Res = (TextView) findViewById(R.id.Result);

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname = eTuser.getText().toString();
                String ln = eTln.getText().toString();
                String email = eTemail.getText().toString();
                String address = eTaddress.getText().toString();
                int number = Integer.parseInt(eTnumber.getText().toString());
                String kota = spCity.getSelectedItem().toString();

                Res.setText("\nUsername    : " + uname +
                        "\nNama Lengkap: " + ln +
                        "\nEmail       : " + email +
                        "\nAlamat      : " + address +
                        "\nNo Telepon  : " + number +
                        "\nAsal Kota   : " + kota);

                //  doProccess();
            }
        });

    }

}

