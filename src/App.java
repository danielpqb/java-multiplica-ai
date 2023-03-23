public class App {
    public static void main(String[] args) throws Exception {
        Integer input = 2;  // Read user input

        System.out.println("Tabela de multiplicação de " + input);

        for (int i = 0; i <= 10; i++) {
            System.out.println(input + " x " + i + " = " + input*i);
        }
    }
}
