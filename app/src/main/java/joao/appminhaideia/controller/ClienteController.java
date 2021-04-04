package joao.appminhaideia.controller;

import android.util.Log;

import joao.appminhaideia.core.AppUtil;

public class ClienteController {
    String versaoApp;

    public ClienteController(){
        this.versaoApp = AppUtil.versaoDoAplicativo();
        Log.i(AppUtil.TAG, "ClienteController: Versão do Aplicativo: "+versaoApp);
    }
}
