package challenge;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

	// Quantas nacionalidades (coluna `nationality`) diferentes existem no arquivo?
	public int q1() throws IOException {

		Jogadores jog = new Jogadores();
		jog.popularJogadores();
		return jog.countNationalities();

	}

	// Quantos clubes (coluna `club`) diferentes existem no arquivo?
	// Obs: Existem jogadores sem clube.
	public int q2() throws IOException {

		Jogadores jog = new Jogadores();
		jog.popularJogadores();
		return jog.countClubs();

	}

	// Liste o nome completo (coluna `full_name`) dos 20 primeiros jogadores.
	public List<String> q3() throws IOException {

		Jogadores jog = new Jogadores();
		jog.popularJogadores();
		return jog.getJogadores();
	}

	// Quem são os top 10 jogadores que possuem as maiores cláusulas de rescisão?
	// (utilize as colunas `full_name` e `eur_release_clause`)
	public List<String> q4() throws IOException {
		Jogadores jog = new Jogadores();
		jog.popularJogadores();
		return jog.getJogadoresClausulas();
	}

	// Quem são os 10 jogadores mais velhos (use como critério de desempate o campo `eur_wage`)?
	// (utilize as colunas `full_name` e `birth_date`)
	public List<String> q5() throws IOException {
		Jogadores jog = new Jogadores();
		jog.popularJogadores();
		return jog.getJogadoresOldest();
	}

	// Conte quantos jogadores existem por idade. Para isso, construa um mapa onde as chaves são as idades e os valores a contagem.
	// (utilize a coluna `age`)
	public Map<Integer, Integer> q6() throws IOException {
		Jogadores jog = new Jogadores();
		jog.popularJogadores();
		return jog.getJogadoresByAge();
	}

}
