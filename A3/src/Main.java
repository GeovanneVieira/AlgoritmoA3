import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> volumesList = new ArrayList<>();

        System.out.println("Digite os volumes e pressionte enter, quando terminar digite 0 e pressione enter");
            Integer volumeInput = sc.nextInt();
            while (volumeInput != 0) {
                volumesList.add(volumeInput);
                volumeInput = sc.nextInt();
            }


        System.out.println("Digite a capacidade máxima dos armazéns:");
        Integer capacidadeMaximaArmazens = sc.nextInt();

        System.out.println("Digite a capacidade máxima dos caminhões:");
        Integer capacidadeMaximaCaminhoes = sc.nextInt();

        Integer volumeTotal = 0;
        for (Integer i : volumesList) {
            volumeTotal += i;
        }

        int numArmazens = (int) Math.ceil((double) volumeTotal / capacidadeMaximaArmazens);
        int numCaminhoes = (int) Math.ceil((double) volumeTotal / capacidadeMaximaCaminhoes);

        System.out.println("O número de armazens necessários é de: " + numArmazens);
        System.out.println("O número de caminhões necessários é de: " + numCaminhoes);
    }
}