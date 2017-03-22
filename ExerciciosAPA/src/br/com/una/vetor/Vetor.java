package br.com.una.vetor;

import java.security.SecureRandom;

public class Vetor {
	public int[] createRandonVector(int lenght, int lenghtRandom) {
		int vet[] = new int[lenght];
		SecureRandom random = new SecureRandom();

		for (int i = 0; i < lenghtRandom; i++) {
			vet[i] = random.nextInt(100);
		}

		return vet;

	}

	public String vectorPrint(int[] vet, String title) {
		String result = "";
		System.out.println(title);
		for (int vets : vet) {
			result += vets + " ";
		}
		return result;

	}
}
