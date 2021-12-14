package com.stto.examenfinal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox CHEC_SUMA,CHEC_Resta,CHEC_divid,CHEC_Multi;
        Spinner N1,N2;
        Button BTN_CALCULAR;
        N1=(Spinner) findViewById(R.id.spinner2);
        N2=(Spinner) findViewById(R.id.spinner3);
        BTN_CALCULAR=(Button) findViewById(R.id.button);
        CHEC_SUMA=(CheckBox) findViewById(R.id.checkBox);
        CHEC_Resta=(CheckBox) findViewById(R.id.checkBox2);
        CHEC_divid=(CheckBox) findViewById(R.id.checkBox3);
        CHEC_Multi=(CheckBox) findViewById(R.id.checkBox4);

        BTN_CALCULAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(N1.getSelectedItemPosition()==0||(N2.getSelectedItemPosition()==0))
                {
                    Toast.makeText(getApplicationContext(), "Porfavor eliga un numero", Toast.LENGTH_SHORT).show();


                }
                else if (CHEC_SUMA.isChecked()==false&&CHEC_Resta.isChecked()==false&&CHEC_Multi.isChecked()==false&&CHEC_divid.isChecked()==false) {

                    Toast.makeText(getApplicationContext(), "Seleccione por lo menos un tipo de operacion", Toast.LENGTH_SHORT).show();
                }


                else
                    {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setMessage("ESTA SEGURO DE Continuar")
                                .setPositiveButton("SI", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        Intent I = new Intent(getApplicationContext(),MainActivity2.class);

                                        startActivity(I);
                                 //       String numero1 = N1.getSelectedItem().toString();
                                   //     String numero2 = N2.getSelectedItem().toString();
                                     //   I.putExtra("Numero1",numero1);
                                        //I.putExtra("Numero2",numero2);
                                    }

                                })
                                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                    }
                                });
                        builder.create();
                        builder.show();
                    }
            }
        });






    }
}