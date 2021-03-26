package entities;

public class Conta {
    private String conta;
    private String nome;
    private double saldo;

    /*
        CONSTRUTOR
    */
    public Conta() {
    }

    public Conta(String conta, String nome, double deposito) {
        this.conta = conta;
        this.nome = nome;
        depositar(deposito);
    }

    public Conta(String conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }
    
    /*
        SETTERS
    */  
    public void setNome(String nome) {
        this.nome = nome;
    }


    /*
        GETTERS
    */
    public String getConta() {
        return conta;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }

    /*
        OPERACOES BANCARIAS
    */
    public void depositar(double valor){
        saldo+=valor;
    }
    public void sacar(double valor){
        if(saldo<=0){
            System.out.println("Você não possui saldo!");
        }else if(valor>saldo){
            System.out.println("Valor declarado é maior que seu saldo disponível!");
        }else{
            saldo-=valor+5.0;
        }
    }

    /*
        INFORMAÇÕES DA CONTA
    */
    public String toString(){
        return "Dados da conta: \n"
        + "Nome do titular: "
        + getNome()
        + "\nConta:"
        + getConta()
        + "\nSaldo: "
        + getSaldo()
        + "\n";
    }

}
