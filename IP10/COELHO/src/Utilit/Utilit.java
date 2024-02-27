package Utilit;

public class Utilit {
	public static void LimparTela() {
		if (System.console() == null) {
            System.out.println("O console não suporta sequências ANSI.");
            return;
        }

        System.out.print("\033[H\033[2J");
	}
	
}
