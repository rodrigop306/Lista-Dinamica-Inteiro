import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		int opc = 0;
		ListaLigada l1 = new ListaLigada();
		int elem;
		int pos;
		while(opc!=8){
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Inicio \n"
					+ "2 - Adicionar posicao especifica \n"
					+ "3 - Adicionar final \n"
					+ "4 - Remover inicio \n"
					+ "5 - Remover posicao especifica \n"
					+ "6 - Remover final \n"
					+ "7 - Visualizar lista \n"
					+ "8 - Sair"));
			switch(opc){
			case 1:
				elem = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do elemento: "));
				l1.adicionaInicio(elem);
				break;
			case 2:
				elem = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do elemento: "));
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
				l1.adicionaPosicao(elem, pos);
				break;
			case 3:
				elem = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do elemento: "));
				l1.adicionaFinal(elem);
				break;
			case 4:
				l1.removeInicio();
				break;
			case 5:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
				l1.removePos(pos);
				break;
			case 6:
				l1.removeFinal();
				break;
			case 7:
				JOptionPane.showMessageDialog(null, l1.toString());
				break;
			case 8:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida");
				break;
			}
		}
	}
}
