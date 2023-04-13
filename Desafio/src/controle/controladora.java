package controle;

import visualisacao.EntradaSaida;

public class controladora {

	public void exibeMenu() {
		int opcao;

		// Escolha desafio Target

		do {

			opcao = EntradaSaida.solicitaOpcao();
			switch (opcao) {
			// Desafio 01
			case 0:
				int indice = 13;
				int soma = 0;
				int k = 0;

				for (int i = 0; i < 13; i++) {
					k += 1;
					soma += k;
				}

				EntradaSaida.resultadoDesafioUm(soma);
				break;
			// Desafio 02
			case 1:
				int limite = EntradaSaida.solicitaValor();
				double fibonachi[] = new double[limite];
				Boolean validaFibo = false;
				for (int i = 0; i < limite; i++) {

					if (i <= 1) {
						fibonachi[i] = 1;
					} else {
						fibonachi[i] = fibonachi[i - 1] + fibonachi[i - 2];
					}
				}

				for (int i = 0; i < limite; i++) {
					if (fibonachi[i] == limite) {
						validaFibo = true;
					}
				}

				if (validaFibo == true) {
					EntradaSaida.resultadoDesafioDoisTrue(limite);
				} else {
					EntradaSaida.resultadoDesafioDoisFalse(limite);
				}

				break;

			case 2:
				String palavra = EntradaSaida.solicitaString();
				String novaPalavra = "";
				char origem[] = palavra.toCharArray();
				int limitechar = origem.length;
				int tamanho = 0;
				for (int i = 0; i < limitechar; i++) {
					if (i == 0) {
						tamanho = limitechar - 1;
						novaPalavra += origem[tamanho];
					} else {
						tamanho = tamanho - 1;
						novaPalavra += origem[tamanho];
					}
				}

				EntradaSaida.resultadoDesafioTres(palavra, novaPalavra);

				System.out.print(novaPalavra);
			}

		} while (opcao != 3);

		EntradaSaida.exibeMsgEncerraPrograma();

	}

}
