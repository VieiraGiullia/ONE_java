package HoraDaPratica.parteTres.Carro;

import HoraDaPratica.parteTres.Carro.model.modeloCarro;

public class Carro {
    public static void main(String[] args) {
        
        modeloCarro carro1 = new modeloCarro();
        carro1.setModelo("mitsubishi");
        carro1.setAnoDoCarro(2022);
        carro1.setPrecoInicial(380.000);
        carro1.InformacaoCarro();
    }
    
}
