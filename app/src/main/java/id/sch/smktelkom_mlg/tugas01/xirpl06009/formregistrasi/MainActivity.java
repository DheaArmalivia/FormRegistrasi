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
    Button bSub, bRes;
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
        bRes = (Button) findViewById(R.id.buttonRes);

        Res = (TextView) findViewById(R.id.Result);

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProccess();
            }
        });

    }

    private void doProccess() {

        if (isValid()) {
            Res.setText("Data Anda sudah terkirim \n" +
                    "\n Username : " + eTuser +
                    "\n Nama     : " + eTln +
                    "\n Email    : " + eTemail +
                    "\n Alamat   : " + eTaddress +
                    "\n Asal Kota: " +);
        }

    }

    private boolean isValid() {

        boolean valid = true;

        String uN = eTuser.getText().toString();
        String lN = eTln.getText().toString();
        String el = eTemail.getText().toString();
        String ad = eTaddress.getText().toString();
        String nt = eTnumber.getText().toString();
        String hasil = null;

        if (uN.isEmpty()) {
            eTuser.setError("Username belum diisi");
            valid = false;
        } else if (lN.isEmpty()) {
            eTln.setError("Nama Lengkap belum diisi");
            valid = false;
        } else if (el.isEmpty()) {
            eTemail.setError("Email belum diisi");
            valid = false;
        } else if (ad.isEmpty()) {
            eTaddress.setError("Alamat masih kosong");
            valid = false;
        } else if (nt.isEmpty()) {
            eTnumber.setError("Nomor Telepon belum diisi");
        } else {
            eTuser.setError(null);
            eTln.setError(null);
            eTaddress.setError(null);
            eTnumber.setError(null);
            eTemail.setError(null);
        }

        return valid;

    }

}
