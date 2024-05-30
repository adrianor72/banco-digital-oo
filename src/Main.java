public class Main {
    public static void main(String[] args){
        Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		cc.saldo = 400.00;
		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.sacar(50.00);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
