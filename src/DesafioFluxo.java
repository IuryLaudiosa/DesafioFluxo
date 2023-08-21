import java.util.Scanner;

public class DesafioFluxo {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(" O segundo parmetro deve ser maior que o primeiro");
		}

    }

        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            
            if(parametroUm > parametroDois)
            {
                throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
            }
            
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            
            int contagem = parametroDois - parametroUm + 1;
            //realizar o for para imprimir os números com base na variável contagem

            for(int i = 0; i < contagem; i++)
            {
                System.out.print("contagem atualizada:" + (parametroUm + i));
            }

        }
    }
