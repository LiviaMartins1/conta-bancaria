void main() {

    ContaCorrente cc = new ContaCorrente();
    //IO.println(cc);

    //IO.println(cc);
    cc.depositar(600);
    cc.sacar(50);
    IO.println(cc.MostrarSaldo());
    cc.taxa = 50;
    cc.taxaMensal();
    IO.println(cc.MostrarSaldo());
}