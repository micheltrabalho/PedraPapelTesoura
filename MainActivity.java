package br.com.michel.android.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra (View view){
        this.opcaoSelecionada("pedra");

    }

    public void selecionadoPapel (View view){
        this.opcaoSelecionada("papel");

    }

    public void selecionadoTesoura (View view){
        this.opcaoSelecionada("tesoura");

    }

    public void  opcaoSelecionada(String opcaoSelecionada){

        ImageView imagemResultado = findViewById(R.id.imagemResultado);
        ImageView imagemResultadoj = findViewById(R.id.imageResultadoj);
        TextView resultado = findViewById(R.id.resultado);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra","papel","tesoura"};
        String opcoesApp = opcoes[ numero ];

        switch (opcaoSelecionada){

            case "pedra":
                imagemResultadoj.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                imagemResultadoj.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imagemResultadoj.setImageResource(R.drawable.tesoura);
                break;
        }

        switch (opcoesApp){
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
        }



        if (    opcaoSelecionada == "pedra" && opcoesApp == "tesoura" ||
                opcaoSelecionada == "papel" && opcoesApp == "pedra"   ||
                opcaoSelecionada == "tesoura" && opcoesApp == "papel"    ){

            resultado.setText("Você Venceu");
        }


        else if (opcaoSelecionada == "pedra" && opcoesApp == "papel"   ||
                 opcaoSelecionada == "papel" && opcoesApp == "tesoura" ||
                 opcaoSelecionada == "tesoura" && opcoesApp == "pedra"){

            resultado.setText("Você Perdeu");
        }

        else if (opcaoSelecionada == "pedra" && opcoesApp == "pedra" ||
                 opcaoSelecionada == "papel" && opcoesApp == "papel"  ||
                 opcaoSelecionada == "tesoura" && opcoesApp == "tesoura"){

            resultado.setText("Jogar Novamente");
        }

    }

}
