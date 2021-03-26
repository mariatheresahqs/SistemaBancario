package util;

public enum Opcoes {
    ABRIR ("Abrir conta"),
    DEPOSITAR("Realizar depósito"),
    SACAR("Realizar saque"),
    CONSULTAR("Realizar consulta"),
    ENCERRAR("Encerrar programa");

    private final String opcao;

    Opcoes(String opcao){
        this.opcao = opcao;
    }
    
    public String getOpcao(){
        return opcao;
    }

    public static void mostrarOpcoes() {
        Opcoes[] opcoes = Opcoes.values();
        for (Opcoes opcao : opcoes) {
            System.out.print(opcao.ordinal()+1 + "-" + opcao.getOpcao() + "\n");
        }
        System.out.println();
    }

    public static void opcoesCliente() {
        Opcoes[] opcoes = Opcoes.values();
        for (Opcoes opcao : opcoes) {
            if(opcao.ordinal()!=0)
                System.out.print(opcao.ordinal()+1 + "-" + opcao.getOpcao() + "\n");
        }
        System.out.println();
    }
}
