package joao.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import joao.appminhaideia.R;

public class SplashActivity extends AppCompatActivity {

    int tempoDeEspera = 1000 * 5;
    String TAG = "APP_MINHA_IDEIA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(TAG, "onCreate: Tela Splash Carregada...");

        trocarTela();
    }

    private void trocarTela() {
        Log.d(TAG, "trocarTela: Mudando de Tela");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "trocarTela: Esperando o Tempo......");

                Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(trocarDeTela);
                finish();
            }
        },tempoDeEspera);
    }
}