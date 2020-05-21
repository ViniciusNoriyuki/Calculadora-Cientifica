import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("########## Calculadora cientifica ###########");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Imprimir tabuada");
        System.out.println("6 - Calcular fatorial");
        System.out.println("#################### MENU ####################");
        System.out.println("Digite a opcao: ");

        int op = sc.nextInt();
        menu(op);
    }

    static void menu(int x){
        Scanner scan = new Scanner(System.in);
        switch (x){
            case 1:
                double resSoma = soma();
                System.out.printf("Soma = %.2f\n", resSoma);
                break;
            case 2:
                double resSub = subtracao();
                System.out.printf("Subtracao = %.2f\n", resSub);
                break;
            case 3:
                double resMul = multiplicacao();
                System.out.printf("Multiplicacao = %.2f\n", resMul);
                break;
            case 4:
                double resDiv = divisao();
                if(resDiv != 0)
                    System.out.printf("Divisao = %.2f\n", resDiv);
                break;
            case 5:
                System.out.println("Digite o numero da tabuada: ");
                int num = scan.nextInt();
                imprimeTabuada(num);
                break;
            case 6:
                System.out.println("Digite o o fatorial: ");
                int fat = scan.nextInt();
                double resFat = calculaFatorial(fat);
                System.out.printf("Fatorial de %d = %.2f\n", fat, resFat);
                break;
        }
    }

    static Double soma() {
        //Soma dos numeros inseridos pelo usuario.
        int aux = 1;
        double res = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a serem somados: ");
        int qtd = scan.nextInt();
        for(int i = 0; i < qtd; i++) {
            System.out.printf("Digite o %do numero a ser somado: ", aux++);
            double num = scan.nextInt();
            res += num;
        }
        return res;
    }

    static Double subtracao() {
        //subtracao dos numeros inseridos pelo usuario.
        int aux = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a serem subtraidos: ");
        int qtd = scan.nextInt();
        System.out.printf("Digite o %do numero a ser subtraido: ", aux++);
        double num = scan.nextInt();
        double res = num;
        for(int i = 0; i < qtd-1; i++) {
            System.out.printf("Digite o %do numero a ser subtraido: ", aux++);
            num = scan.nextInt();
            res -= num;
        }
        return res;
    }

    static Double multiplicacao() {
        //Multiplicacao dos numeros inseridos pelo usuario.
        int aux = 1;
        double res = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a serem multiplicados: ");
        int qtd = scan.nextInt();
        for(int i = 0; i < qtd; i++) {
            System.out.printf("Digite o %do numero a ser multiplicado: ", aux++);
            double num = scan.nextInt();
            res *= num;
        }
        return res;
    }

    static Double divisao() {
        //implementar divisao dos numeros inseridos pelo usuario.
        Scanner scan = new Scanner(System.in);
        double res = 0;
        System.out.println("Digite o divisor:");
        double div = scan.nextInt();
        System.out.println("Digite o quociente:");
        double quoc = scan.nextInt();
        if(quoc != 0){
            res = div / quoc;
        }
        else
            System.out.println("Divisao por zero nao permitido!");
        return res;
    }

    static void imprimeTabuada(Integer n){
        //Printa a tabuada do numero informado pelo usuário.
        for(int i = 1; i <= 10; i++){
            int res = n * i;
            System.out.printf("%d x %d = %d\n", n, i, res);
        }
    }

    static Integer calculaFatorial(Integer n){
        //Tentar utilizar recursividade.
        if(n == 0 || n == 1)
            return 1;
        else
            return calculaFatorial(n - 1) * n;
    }
}
