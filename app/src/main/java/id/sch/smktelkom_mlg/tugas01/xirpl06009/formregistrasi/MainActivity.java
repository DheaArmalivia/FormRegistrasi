package id.sch.smktelkom_mlg.tugas01.xirpl06009.formregistrasi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    EditText eTuser, eTln, eTemail, eTaddress, eTnumber;
    Button bSub;
    RadioButton rBB, rBM, rBE;
    RadioGroup rGLevel;
    TextView Res, sub, lev, dur;
    Spinner spCity;
    CheckBox cBHtml, cBCss, cBJava, cBVB, cBC, cBDel;
    int nSub;
    private boolean valid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTuser = (EditText) findViewById(R.id.editTextUname);
        eTln = (EditText) findViewById(R.id.editTextLname);
        eTemail = (EditText) findViewById(R.id.editTextEmail);
        eTaddress = (EditText) findViewById(R.id.editTextAddress);
        eTnumber = (EditText) findViewById(R.id.editTextNumber);

        cBHtml = (CheckBox) findViewById(R.id.checkBoxHTML);
        cBCss = (CheckBox) findViewById(R.id.checkBoxCSS);
        cBJava = (CheckBox) findViewById(R.id.checkBoxJ);
        cBVB = (CheckBox) findViewById(R.id.checkBoxVB);
        cBC = (CheckBox) findViewById(R.id.checkBoxC);
        cBDel = (CheckBox) findViewById(R.id.checkBoxD);

        cBHtml.setOnCheckedChangeListener(this);
        cBCss.setOnCheckedChangeListener(this);
        cBJava.setOnCheckedChangeListener(this);
        cBC.setOnCheckedChangeListener(this);
        cBVB.setOnCheckedChangeListener(this);
        cBDel.setOnCheckedChangeListener(this);

        rBB = (RadioButton) findViewById(R.id.radioButtonB);
        rBM = (RadioButton) findViewById(R.id.radioButtonM);
        rBE = (RadioButton) findViewById(R.id.radioButtonE);

        rGLevel = (RadioGroup) findViewById(R.id.level);
        spCity = (Spinner) findViewById(R.id.spinnerKota);

        bSub = (Button) findViewById(R.id.buttonSub);

        Res = (TextView) findViewById(R.id.Result);
        sub = (TextView) findViewById(R.id.subject);
        lev = (TextView) findViewById(R.id.lvl);
        dur = (TextView) findViewById(R.id.wkt);

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname = eTuser.getText().toString();
                String ln = eTln.getText().toString();
                String email = eTemail.getText().toString();
                String address = eTaddress.getText().toString();
                String number = eTnumber.getText().toString();
                String kota = spCity.getSelectedItem().toString();

                if (uname.isEmpty()) {
                    eTuser.setError("Username belum diisi");
                    valid = false;
                } else if (ln.isEmpty()) {
                    eTln.setError("Nama Lengkap belum diisi");
                    valid = false;
                } else if (email.isEmpty()) {
                    eTemail.setError("Email belum diisi");
                    valid = false;
                } else if (address.isEmpty()) {
                    eTaddress.setError("Alamat masih kosong");
                    valid = false;
                } else if (number.isEmpty()) {
                    eTnumber.setError("Nomor Telepon belum diisi");
                    valid = false;
                } else {
                    Res.setText("\nUsername    : " + uname +
                            "\nNama Lengkap: " + ln +
                            "\nEmail       : " + email +
                            "\nAlamat      : " + address +
                            "\nNo Telepon  : " + number +
                            "\nAsal Kota   : " + kota);
                }

                String hasil = "Materi yang anda pilih:\n";
                int startlen = hasil.length();
                if (cBHtml.isChecked()) hasil += cBHtml.getText() + "\n";
                if (cBCss.isChecked()) hasil += cBCss.getText() + "\n";
                if (cBJava.isChecked()) hasil += cBJava.getText() + "\n";
                if (cBVB.isChecked()) hasil += cBVB.getText() + "\n";
                if (cBC.isChecked()) hasil += cBC.getText() + "\n";
                if (cBDel.isChecked()) hasil += cBDel.getText() + "\n";

                if (hasil.length() == startlen) hasil += "Anda belum memilih materi";

                sub.setText(hasil);


                String Rb = null;

                if (rBB.isChecked()) {
                    Rb = rBB.getText().toString();
                } else if (rBM.isChecked()) {
                    Rb = rBM.getText().toString();
                } else if (rBE.isChecked()) {
                    Rb = rBE.getText().toString();
                }

                if (Rb == null) {
                    lev.setText("Anda belum memilih level");
                } else {
                    lev.setText("Level yang Anda pilih untuk kegiatan ini : " +
                            Rb);
                }



            }
        });

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) nSub += 2;
        else nSub -= 2;

        dur.setText("Waktu untuk pembelajaran " + nSub + " minggu");

    }
}

