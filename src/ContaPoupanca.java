public class ContaPoupanca {
    public String nmrConta;
    public String cliente;
    public String nrmAgencia;
    private double saldo;


    public void sacar(double saque){
        if (saldo - saque <0) {
            IO.println("Saldo insuficiente ");
        }else{
            saldo = saldo - saque;

        }
    }


    @Override
    public String toString() {
        return "ContaCorrente" +
                "nmrConta='" + nmrConta + '\'' +
                ", cliente='" + cliente + '\'' +
                ", nrmAgencia='" + nrmAgencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String MostrarSaldo(){
        return "0 seu saldo é: "  + saldo;

    }


    public void depositar(double deposito){
        saldo = saldo + deposito;
    }






}

