package com.niar.myappli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtNama;
    TextView txtNpm;
    TextView txtAlamat;
    TextView txtprogramstudi;
    EditText edtNama;
    EditText edtNpm;
    EditText edtAlamat;
    EditText edtprogramstudi;
    Button btnSubmit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtNpm = (TextView) findViewById(R.id.txtNpm);
        txtAlamat = (TextView) findViewById(R.id.txtAlamat);
        txtprogramstudi = (TextView) findViewById(R.id.txtprogramstudi);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtAlamat = (EditText) findViewById(R.id.edtAlamat);
        edtprogramstudi = (EditText) findViewById(R.id.edtprogramstudi);
        btnSubmit = (Button) findViewById(R.id.btnsubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNama = edtNama.getText().toString();
                String strNpm = edtNpm.getText().toString();
                String strAlamat = edtAlamat.getText().toString();
                String strprogramstudi = edtprogramstudi.getText().toString();

                txtNama.setText(strNama);
                txtNpm.setText(strNpm);
                txtAlamat.setText(strAlamat);
                txtprogramstudi.setText(strprogramstudi);

            }
        });
    }
}
