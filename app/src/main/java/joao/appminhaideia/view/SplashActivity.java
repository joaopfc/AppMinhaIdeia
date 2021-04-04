package joao.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import joao.appminhaideia.R;
import joao.appminhaideia.controller.ClienteController;
import joao.appminhaideia.core.AppUtil;
import joao.appminhaideia.model.Cliente;

public class SplashActivity extends AppCompatActivity {

    Cliente objCliente;
    ClienteController clienteController;

    int tempoDeEspera = 1000 * 5;

    TextView textAppVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(AppUtil.TAG, "onCreate: Tela Splash Carregada...");

        textAppVersion = findViewById(R.id.textAppVersion);
        textAppVersion.setText(AppUtil.versaoDoAplicativo());

        clienteController = new ClienteController();

        trocarTela();
    }

    private void trocarTela() {
        Log.d(AppUtil.TAG, "trocarTela: Mudando de Tela");


        objCliente = new Cliente("João Paulo",
                "joao@teste.com",
                "(34) 9 9695-6720",
                24,
                true);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(AppUtil.TAG, "trocarTela: Esperando o Tempo......");



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