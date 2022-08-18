package cursoDev;

public class Main {
    public static void main(String[] args) {

        GerenciadorDeContas GerenciadorDeContas = new GerenciadorDeContas();

        Titular titular1 = new Titular("Augusto Stein", "02414185007");
        Titular titular2 = new Titular("Jonatham, Matheus", "123612365467");
        Titular titular3 = new Titular("Rafael Silva", "63412316734");

        Banco banco1 = new Banco("ITAU", 582);
        Banco banco2 = new Banco("CAIXA", 316);
        Banco banco3 = new Banco("NUBANK", 832);
        Banco banco4 = new Banco("C6", 712);
        Banco banco5 = new Banco("SANTANDER", 832);
        
        
        GerenciadorDeContas.adicionaContas(582, 8719, 294.00, TipoDeConta.CORRENTE, titular1, banco1);
        GerenciadorDeContas.adicionaContas(582, 9124, 5694.00, TipoDeConta.POUPANCA, titular1, banco1);

        GerenciadorDeContas.adicionaContas(316, 2716, 6791.00, TipoDeConta.SALARIO, titular2, banco2);
        
        GerenciadorDeContas.adicionaContas(832, 7613, 12594.00, TipoDeConta.SALARIO, titular3, banco3);
        GerenciadorDeContas.adicionaContas(712, 9389, 78.00, TipoDeConta.CORRENTE, titular3, banco4);
        GerenciadorDeContas.adicionaContas(832, 3023, 594.00, TipoDeConta.SALARIO, titular3, banco5);



       try {
		GerenciadorDeContas.buscaContaPorCpf("02414185007");
	} catch (ContaNaoEncontradaException e) {
		e.printStackTrace();
	}
//
//        try {
//			System.out.println(GerenciadorDeContas.consultaConta("BB", 582, 8719).get());
//		} catch (ContaNaoEncontradaException e) {
//			e.printStackTrace();
//		}
    }
}
