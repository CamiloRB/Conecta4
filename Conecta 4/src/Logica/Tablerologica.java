/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JOptionPane;

public class Tablerologica {
	int[][] matriz = new int[7][6];
	int numeroca;
	Jugador jugador;

	public Tablerologica() {

		this.numeroca = 0;

	}

	public void Numero(String dato) {
		numeroca = Integer.parseInt(dato);

	}

	public void inicializarjuego(int[][] matri) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length - 1; j++) {

				matri[i][j] = 0;

			}

		}

		this.matriz = matri;

	}

	public void setMatriz(int[][] matriz) {

		this.matriz = matriz;
	}

	public int validarfila(int numero, int cont) {

		if (matriz[numero][cont] != 0) {
			cont = cont - 1;
			return cont;
		} else if (cont < 0) {
			cont = 5;
			return cont;
		} else {
			return cont;
		}

	}

	public void validarjugada(int n) {
		int cont = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = matriz.length - 2; j > 0; j--) {
				if (matriz[i][j] == n) {
					if (matriz[i][j - 1] == n) {
						if (matriz[i][j - 2] == n) {
							if (matriz[i][j - 3] == n) {
								JOptionPane.showMessageDialog(null, "Has Ganado");
							}
						}
					}
				}
				{

					if (matriz[i][j] == n) {
						if (matriz[i + 1][j] == n) {
							if (matriz[i + 2][j] == n) {
								if (matriz[i + 3][j] == n) {

									JOptionPane.showMessageDialog(null, "Has Ganado");

								}
							}
						}
					}
				}

			}

		}

	}

	public int[][] getMatriz() {
		return matriz;
	}

}
