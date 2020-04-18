package com.gdapp.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("MainActivity", "Iniciando onCreate");

        //setContentView(R.layout.activity_main);


        Integer somaInteiro = (new Integer(5))+ (new Integer(99)) ;
        Log.d("MainActivity", somaInteiro.toString());
        Double somaFlutuante = (new Double(6.9)) + (new Double(67.2));
        Log.d("MainActivity", somaFlutuante.toString());
        Double multiplicacaoFlutuante = new Double(3.8) * new Double(43.3);
        Log.d("MainActivity", multiplicacaoFlutuante.toString());
        Double divisaoFlutuante = new Double(22.2) / new Double(2.0);
        Log.d("MainActivity", divisaoFlutuante.toString());
        Double divisaoFlutuanteZero;
        Integer divisaoInteriroZero;


        String resposta = somaInteiro.toString() + "\n" +
                String.format("%.2f\n", somaFlutuante.floatValue()) +
                String.format("%.2f\n", multiplicacaoFlutuante.floatValue()) +
                String.format("%.2f\n", divisaoFlutuante.floatValue());



        try{
            divisaoFlutuanteZero = new Double(409.2)/new Double(0);
            resposta += String.format("%.2f\n", divisaoFlutuanteZero.floatValue());
        }catch (Exception ex)
        {
            Log.e("MainActivity","Erro de divisão por 0.");
            resposta += "Erro de divisão\n";
        }

        try{
            divisaoInteriroZero = new Integer(39)/ new Integer(0);
            resposta += divisaoInteriroZero.toString();
        }catch (Exception ex){
            Log.e("MainActivity", "Erro divisao de inteiro por zero.");
            resposta += "Erro de divisão.";
        }

        TextView textoResultado = new TextView(this);
        textoResultado.setText(resposta);

        setContentView(textoResultado);

        Log.v("MainActivity", "Fim");
    }
}
