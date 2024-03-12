
import java.util.Scanner;

public class POO {
    public static void main(String[] args) 
    {
        boolean repetir=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nBienvenido al programa que calcula factoriales N!");
        do
        {
            int res=1, N=0;
            try
            {
                System.out.print("Escriba el valor de N: ");
                N = Integer.parseInt(sc.nextLine());
                if(N<=0)
                {
                    System.out.println("Error, escriba un numero positivo\n");
                    continue;
                }
            }
            catch(Exception ex)
            {
                System.out.println("Error, escriba un numero entero\n");
                continue;
            }
            for(int i=N; i>0; i--)
            {
                res = res*i;
            }
            System.out.print("\n" + N + "! = " + res + "\n\n");
            do
            {
                System.out.print("Desea calcular otro numero? [Y/N]: ");
                String opcion = sc.nextLine();
                char op = opcion.charAt(0);
                if(op == 'Y' || op == 'y')
                {
                    break;
                }
                else if(op == 'N' || op =='n')
                {
                    repetir = false;
                    break;
                }
                else
                {
                    System.out.println("Opcion incorrecta [Y/N]");
                }
            }while(true);

        }while(repetir);
        System.out.println("\nGracias, vuelva pronto!!\n\n");
        sc.close();
    }
}
