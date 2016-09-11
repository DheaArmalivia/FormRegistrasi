package id.sch.smktelkom_mlg.tugas01.xirpl06009.formregistrasi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText eTuser, eTln, eTemail, eTaddress, eTnumber;
    Button bSub, bRes;
    RadioButton rBB, rBM, rBE;
    CheckBox cBHtml, cBCss, cBJava, cBVB, cBC, cBDel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
