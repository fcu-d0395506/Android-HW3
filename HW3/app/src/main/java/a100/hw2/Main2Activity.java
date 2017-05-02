package a100.hw2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.id.input;

public class Main2Activity extends AppCompatActivity {
    private EditText etname;
    private Button buttonname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        etname = (EditText) findViewById(R.id.et_name);
        buttonname = (Button)findViewById(R.id.button_back);

        buttonname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  String input =  etname.getText().toString();
                  Toast.makeText(Main2Activity.this, "Hello   " + input , Toast.LENGTH_LONG).show();

                Intent intent = new Intent();
                intent.setClass(Main2Activity.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
