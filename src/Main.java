public class Main {

    public static void main(String[] args) {
        // Criando um cliente
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");
        
        // Criando uma conta corrente para o cliente
        Conta cc = new ContaCorrente(lucas);
        // Criando uma conta poupança para o cliente
        Conta poupanca = new ContaPoupanca(lucas);

        // Realizando um depósito na conta corrente
        cc.depositar(100);
        // Transferindo dinheiro da conta corrente para a conta poupança
        cc.transferir(100, poupanca);
        
        // Imprimindo o extrato da conta corrente
        cc.imprimirExtrato();
        // Imprimindo o extrato da conta poupança
        poupanca.imprimirExtrato();
    }

}
