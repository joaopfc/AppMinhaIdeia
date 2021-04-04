package joao.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import joao.appminhaideia.R;
import joao.appminhaideia.model.Cliente;

public class SplashActivity extends AppCompatActivity {

    Cliente objCliente;

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

        objCliente = new Cliente("João Paulo",
                "joao@teste.com",
                "(34) 9 9695-6720",
                24,
                true);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "trocarTela: Esperando o Tempo......");



                Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("nome",objCliente.getNome());
                bundle.putString("email",objCliente.getEmail());

                trocarDeTela.putExtras(bundle);

                startActivity(trocarDeTela);
                finish();
            }
        },tempoDeEspera);
    }
}