package br.com.una.apa.p02e01;

import java.security.SecureRandom;
import java.util.ArrayList;

import org.jfree.ui.RefineryUtilities;

import br.com.una.vetor.Vetor;

public class LenghtVector {

	public static ArrayList<Grafico> cordenadas(int tamVetores[]) {
		ArrayList<Grafico> lista = new ArrayList<>();
		Vetor vetor = new Vetor();
		SecureRandom random = new SecureRandom();
		int control = 0;

		for (int i = 0; i < tamVetores.length; i++) {
			int count = 0;
			int vet[] = new int[tamVetores[i]];
			for (int j = 0; j < 5; j++) {
				vet[j] = random.nextInt(100);
				count++;
			}

			Grafico grafico = new Grafico();
			grafico.setNome("Vetor" + control);
			grafico.setX(vet.length);
			grafico.setY(count);
			System.out.println(vetor.vectorPrint(vet, "Vetor"));
			System.out.println("Tamanho do vetor: " + vet.length);
			System.out.println("Tamanho do contador :" + count + "\n");
			control++;
			lista.add(grafico);

		}

		return lista;

	}

}
