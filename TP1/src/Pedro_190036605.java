
import java.util.Scanner;

public class Pedro_190036605 {
    
    public static void menu(){
        System.out.println("\t**********Cadastro de dados meteorológicos.*********\n");
        System.out.println("1. Entrada das temperaturas");
        System.out.println("2. Cálculo da temperatura média");
        System.out.println("3. Cálculo da temperatura mínima");
        System.out.println("4. Cálculo da temperatura máxima");
        System.out.println("5. Relatório meteorológico");
        System.out.println("0. Saída do sistema");
        System.out.println("Opcao:");
    }

    public static void entrada(){
        System.out.println("Você entrou no menu Entrada de temperaturas");
    }
    
    public static void media(double[] v, double tam){
        System.out.println("Você entrou no menu Cálculo de temperatura média");
        double soma = 0;
        for(int dia = 0; dia < tam; dia++) soma = soma + v[dia];
        double media = soma/tam;
        System.out.println("A média de temperatura do mês é: " + media + "\n");
    }
    
    public static void minima(double[] v, double tam){
        System.out.println("Você entrou no menu Cálculo de temperatura mínima");
        int MAX_DIAS = 31;
        int INFINITO = 1000000000;
        double menor = INFINITO;
        int[] posicoes = new int[MAX_DIAS];
        for (int i = 0; i < tam; i++){
            if(v[i] < menor){
                menor = v[i];
                for (int j = 0; j < MAX_DIAS; j++){
                    posicoes[j] = -1;
                }
                posicoes[0] = i + 1; 
            }else if (v[i] == menor){
                for(int j = 0; j < MAX_DIAS; j++){
                    if(posicoes [j] != -1) continue;
                    if(posicoes[j] == -1){
                        posicoes[j] = i + 1;
                        break;
                    }
                }

        } 
        }
        System.out.print("A temperatura mínima foi de " + menor + " na data: " + posicoes[0] + "/\n");
    
    }
    
    public static void maxima(double[] v, double tam){
        System.out.println("Você entrou no menu Cálculo de temperatura mínima");
        int MAX_DIAS = 31;
        int INFINITO = 1000000000;
        double maior = -INFINITO;
        int[] posicoes = new int[MAX_DIAS];
        for (int i = 0; i < tam; i++){
            if(v[i] > maior){
                maior = v[i];
                for (int j = 0; j < MAX_DIAS; j++){
                    posicoes[j] = -1;
                }
                posicoes[0] = i + 1; 
            }else if (v[i] == maior){
                for(int j = 0; j < MAX_DIAS; j++){
                    if(posicoes [j] != -1) continue;
                    if(posicoes[j] == -1){
                        posicoes[j] = i + 1;
                        break;
                    }
                }

        } 
        }
        System.out.print("A temperatura máxima foi de " + maior + " na data: " + posicoes[0] + "/\n");
    }
    
    public static void relatorio(double[] v, double tam){
    	System.out.println("Você entrou no menu Relatório meterológico");
        
    	{double soma = 0;
        for(int dia = 0; dia < tam; dia++) soma = soma + v[dia];
        double media = soma/tam;
        System.out.println("A média de temperatura do mês é: " + media + "\n");	
    	}
    	
    	{
    		int MAX_DIAS = 31;
            int INFINITO = 1000000000;
            double menor = INFINITO;
            int[] posicoes = new int[MAX_DIAS];
            for (int i = 0; i < tam; i++){
                if(v[i] < menor){
                    menor = v[i];
                    for (int j = 0; j < MAX_DIAS; j++){
                        posicoes[j] = -1;
                    }
                    posicoes[0] = i + 1; 
                }else if (v[i] == menor){
                    for(int j = 0; j < MAX_DIAS; j++){
                        if(posicoes [j] != -1) continue;
                        if(posicoes[j] == -1){
                            posicoes[j] = i + 1;
                            break;
                        }
                    }

            } 
            }
            System.out.println("A temperatura mínima foi de " + menor + " na data: " + posicoes[0] + "\n");
    	}
    	{
    		int MAX_DIAS = 31;
            int INFINITO = 1000000000;
            double maior = -INFINITO;
            int[] posicoes = new int[MAX_DIAS];
            for (int i = 0; i < tam; i++){
                if(v[i] > maior){
                    maior = v[i];
                    for (int j = 0; j < MAX_DIAS; j++){
                        posicoes[j] = -1;
                    }
                    posicoes[0] = i + 1; 
                }else if (v[i] == maior){
                    for(int j = 0; j < MAX_DIAS; j++){
                        if(posicoes [j] != -1) continue;
                        if(posicoes[j] == -1){
                            posicoes[j] = i + 1;
                            break;
                        }
                    }

            } 
            }
            System.out.println("A temperatura máxima foi de " + maior + " na data: " + posicoes[0] + "\n");
    	}
    }
    
    public static void main(String[] args) {
        int opcao;
        int[] DIAS_MES = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                int FEV_BISS = 29;
                int FEV_NBISS = 28;
                int MAX_DIAS = 31;
                int INTERVALO_ANOS = 10;
                int MESES_NO_ANO = 12;
                int ANO_COMECO = 2011;
                
                
                int mes, ano, dia;
                double[][] temperatura_mes = new double[INTERVALO_ANOS * MESES_NO_ANO][MAX_DIAS];
                int media_mes;
                int ind_mes;
                
                
                Scanner leitor = new Scanner(System.in);
                Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                entrada();
                System.out.print("Digite mês e ano que deseja adicionar: ");
                mes = leitor.nextInt();
                ano = leitor.nextInt();
                ind_mes = (ano - ANO_COMECO)* 12 + (mes -1);
                
                System.out.println("Digite as temperaturas correspondentes ao mês " + mes + ":");
                
                if (mes == 1) {
                	for ( int i = 0; i < DIAS_MES[mes - 1]; i++ ) {
                	System.out.print("Temperatura do dia ");
                    System.out.print(i + 1);
                    System.out.print(": ");
                    System.out.print(i+"\n");
                    temperatura_mes[ind_mes][i] = i;
                	}
                }
                else if ( mes != 2) {
                    for ( int i = 0; i < DIAS_MES[mes - 1]; i++ ) {
                        System.out.print("Temperatura do dia ");
                        System.out.print(i + 1);
                        System.out.print(": ");
                        temperatura_mes[ind_mes][i] = leitor.nextInt();
                    }
                
                }else if (mes == 2 && (((ano % 400) == 0) || (((ano % 4) == 0) && ((ano % 100) != 0)))) {
               	 for ( int i = 0; i < FEV_BISS; i++ ) {
                        System.out.print("Temperatura do dia ");
                        System.out.print(i + 1);
                        System.out.print(": ");
                        temperatura_mes[ind_mes][i] = leitor.nextInt();
               	 }
                } else {
               	 for ( int i = 0; i < FEV_NBISS; i++ ) {
                        System.out.print("Temperatura do dia ");
                        System.out.print(i + 1);
                        System.out.print(": ");
                        temperatura_mes[ind_mes][i] = leitor.nextInt();
                } }
                break;
                
            case 2:
            	System.out.print("Digite mês e ano que deseja executar o cálculo da temperatura média: ");
            	mes = leitor.nextInt();
            	ano = leitor.nextInt();
                ind_mes = (ano - ANO_COMECO)* 12 + (mes -1);
                media(temperatura_mes[ind_mes], DIAS_MES[mes - 1]);
                break;
                
            case 3:
                System.out.print("Digite mês e ano que deseja executar o cálculo da temperatura mínima: ");
            	mes = leitor.nextInt();
            	ano = leitor.nextInt();
            	ind_mes = (ano - ANO_COMECO)* 12 + (mes -1);
                minima(temperatura_mes[ind_mes], DIAS_MES[mes - 1]);
                System.out.println("\t" + mes + "/" + ano);
                break;
                
            case 4:
            	
                System.out.print("Digite mês e ano que deseja executar o cálculo da temperatura máxima: ");
            	mes = leitor.nextInt();
            	ano = leitor.nextInt();
            	ind_mes = (ano - ANO_COMECO)* 12 + (mes -1);
                maxima(temperatura_mes[ind_mes], DIAS_MES[mes - 1]);
                System.out.println( mes + "/" + ano);
                break;
                
            case 5:
                System.out.print("Digite mês e ano que deseja emitir o relatório meteorológico: ");
            	mes = leitor.nextInt();
            	ano = leitor.nextInt();
            	ind_mes = (ano - ANO_COMECO)* 12 + (mes -1);
                relatorio(temperatura_mes[ind_mes], DIAS_MES[mes - 1]);
                for ( int i = 0; i < DIAS_MES[mes - 1]; i++ ) {
                	System.out.print("Temperatura do dia ");
                    System.out.print(i + 5);
                    System.out.print(": ");
                    System.out.print(i+"\n");
                    temperatura_mes[ind_mes][i] = i;
                }
                
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0 && opcao <=6);
    }
}