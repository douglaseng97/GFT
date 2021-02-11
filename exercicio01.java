public class Exercicio01 {

    Scanner scan = new Scanner(System.in);

    public void run() {

        System.out.println("\nDigite o número a ser multiplicado: ");
        int multi = scan.nextInt();

        if ( (multi < 0) || (multi > 3000) ) {
            System.out.println("\nErro! o número multiplicador deve estar entre 0 e 3000!");
        }

        System.out.println("\nDigite o início do intervalo: ");
        int ini = scan.nextInt();

        System.out.println("\nDigite o fim do intervalo: ");
        int fi = scan.nextInt();

        int interv = fi - ini;

        if ( fi < ini ) {
            System.out.println("\nO início não pode ser maior do que o fim!");
        }

        if ( interv > 10 ) {
            System.out.println("\nA diferença do inervalo não pode ser superior a 10.");
        }

        System.out.println("\nMultiplicando: " + multi);
        System.out.println("\nInício do Intervalo: " + ini);
        System.out.println("\nFim do Intervalo: " + fi);

        for ( int i = ini; i <= fi; i++ ) {
            System.out.println(multi + " x " + i + " = " + (i * multi));
        }
    }
}