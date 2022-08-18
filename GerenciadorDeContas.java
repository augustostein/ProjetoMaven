package cursoDev;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GerenciadorDeContas {

	static List<Conta> listagemDeContas = new ArrayList<>();

	public void adicionaContas(Integer agencia, Integer numeroDaConta, Double saldoConta, Enum tipoDeConta,
			Titular titular, Banco banco) {

		Conta conta = new Conta(agencia, numeroDaConta, saldoConta, tipoDeConta, titular, banco);

		listagemDeContas.add(conta);
	}

	public String buscaContaPorCpf(String cpf) throws ContaNaoEncontradaException {
		List<Conta> contasComCpf = listagemDeContas.stream().filter(conta -> conta.getTitular().getCpf().equals(cpf))
				.collect(Collectors.toList());
		if (contasComCpf.isEmpty()) {
			throw new ContaNaoEncontradaException("A conta não foi encontrada.");
		} else {
			System.out.println(contasComCpf);
		}
		return cpf;
	}


	public Optional<Conta> consultaConta(String nomeBanco, Integer agencia, 
			Integer numeroDaConta) throws ContaNaoEncontradaException {
	return Optional.of(this.listagemDeContas
				.stream().filter(conta -> conta.getBanco().getNomeBanco().equals(nomeBanco))
			.filter(conta -> conta.getAgencia().equals(agencia))
			.filter(conta -> conta.getNumeroDaConta().equals(numeroDaConta)).findFirst()
			.orElseThrow(() -> new ContaNaoEncontradaException("A conta não foi encontrada.")));
		}
}
	