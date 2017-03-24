package br.com.una.apa.p02e03;

import org.jfree.ui.RefineryUtilities;

public class Execute {

	public static void main(String[] args) {
		int vet[] = {10};
		final Graph demo = new Graph("Teste", vet);
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);

	}

}
