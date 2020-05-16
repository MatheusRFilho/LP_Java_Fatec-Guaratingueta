import java.util.Random;
class exer26 {
    public static void main(String[] args) {
        Random random = new Random();
        int aux = 0, aux2 = 0, contador = 0, cont = 0, auxp = 0;
        int ag[] = new int[10];

        for (int i = 0; i < ag.length; i++) {
            ag[i] = random.nextInt(10);
            System.out.print(ag[i] + " ");
            for (int k = 2; k < ag.length; k++) {
                auxp = 0;
                for (int j = 1; j <= k; j++) {
                    if (k % j == 0) {
                        auxp++;
                    }
                }
                if (auxp == 2) {
                    contador++;
                }

            }

        }
        int primo[] = new int[contador];
        for (int i = 0; i < ag.length; i++) {

            if (ag[i] % 2 == 0) {
                primo[cont] = ag[i];
                cont++;
            }

        }

        for (int i = 0; i < primo.length; i++) {
            for (int j = 0; j < primo.length - 1; j++) {
                if (primo[j] > primo[j + 1]) {
                    aux = primo[j];
                    primo[j] = primo[j + 1];
                    primo[j + 1] = aux;

                }
            }
        }

        for (int i = 0; i < ag.length; i++) {
            for (int j = 1; j <= k; j++) {
                if (k % j == 0) {
                    auxp++;
                }
            }
            if (auxp == 2) {
                ag[i] = primo[aux2++];
            }
        }

        System.out.println("");
        for (int i = 0; i < primo.length; i++) {
            System.out.print(primo[i] + " ");
        }

        System.out.println("");
        for (int i = 0; i < ag.length; i++) {
            System.out.print(ag[i] + " ");
        }
    }
}