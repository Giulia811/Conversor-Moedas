import java.io.IOException;
import java.util.Scanner;

class Opcao {
    public void testa(int opcaoSelecionada) throws IOException, InterruptedException {
        Scanner valor = new Scanner(System.in);
        double numero;
        ExchangeRate conv = new ExchangeRate();
        String endereco;
        double taxaConv;

        switch (opcaoSelecionada) {
            case 1 -> {
                endereco = "https://v6.exchangerate-api.com/v6/b45c43c84bd22d98d7abd823/pair/USD/ARS";
                System.out.println("Digite o valor em dólar a ser convertido em peso argentino");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.printf("O Valor convertido é %.2f\n", ConverterMoedas.converterDolarParaDemaisMoedas(numero, taxaConv));
            }
            case 2 -> {
                endereco = "https://v6.exchangerate-api.com/v6/b45c43c84bd22d98d7abd823/pair/ARS/USD";
                System.out.println("Digite o valor em peso argentino a ser convertido em dólar");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.printf("O Valor convertido é %.2f\n",ConverterMoedas.converterMoedaParaDolar(numero, taxaConv));
            }
            case 3 -> {
                endereco = "https://v6.exchangerate-api.com/v6/b45c43c84bd22d98d7abd823/pair/USD/BRL";
                System.out.println("Digite o valor em dólar a ser convertido em real");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.printf("O Valor convertido é %.2f\n",ConverterMoedas.converterDolarParaDemaisMoedas(numero, taxaConv));
            }
            case 4 -> {
                endereco = "https://v6.exchangerate-api.com/v6/b45c43c84bd22d98d7abd823/pair/BRL/USD";
                System.out.println("Digite o valor em real a ser convertido em dólar");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.printf("O Valor convertido é %.2f\n",ConverterMoedas.converterMoedaParaDolar(numero, taxaConv));
            }
            case 5 -> {
                endereco = "https://v6.exchangerate-api.com/v6/b45c43c84bd22d98d7abd823/pair/USD/COP";
                System.out.println("Digite o valor em dólar a ser convertido em peso colombiano");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.printf("O Valor convertido é %.2f\n",ConverterMoedas.converterDolarParaDemaisMoedas(numero, taxaConv));
            }
            case 6 -> {
                endereco = "https://v6.exchangerate-api.com/v6/b45c43c84bd22d98d7abd823/pair/COP/USD";
                System.out.println("Digite o valor em peso colombiano a ser convertido em dólar");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.printf("O Valor convertido é %.2f\n", ConverterMoedas.converterMoedaParaDolar(numero, taxaConv));
            }
            case 7 -> System.out.println("Saindo...");
            default -> System.out.println("Digite um número que corresponda a uma das opções acima.");
        }
    }
}