package joao.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import joao.appminhaideia.R;
import joao.appminhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";
    Cliente objCliente;

    TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();

        Log.d(TAG, "onCreate: Tela Principal Carregada...");

        Log.d(TAG, "onCreate: Nome ......"+bundle.getString("nome"));
        Log.d(TAG, "onCreate: Email ......"+bundle.getString("email"));

        txtNome = findViewById(R.id.txtNome);
        txtNome.setText("Bem Vindo... "+bundle.getString("nome"));

    }
}