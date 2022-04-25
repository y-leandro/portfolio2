import java.util.Scanner;
public class Main 
{
    public static void main (String[] args) 
    {
        Scanner libano = new Scanner(System.in);
        System.out.println("Digite a nota");
        double nota1 = libano.nextDouble();
        System.out.println("Digite a nota");
        double nota2 = libano.nextDouble();
        System.out.println("Digite a nota");
        double nota3 = libano.nextDouble();
        System.out.println("Digite a nota");
        double nota4 = libano.nextDouble();
        
        double media = calcMedia(nota1, nota2, nota3, nota4);
        
        if(aprovado(media) == true)
        {
            System.out.println("O ALUNO PASSOU!!!! :D");
        }
        else
        {
            System.out.println("R E P R O V A D O . ಠ_ಠ");
        }
    }
    
    public static double calcMedia(double a, double b, double c, double d)
    {
        return (a+b+c+d)/4;
    }
    
    public static boolean aprovado(double m)
    {
        if(m >= 7)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
}

