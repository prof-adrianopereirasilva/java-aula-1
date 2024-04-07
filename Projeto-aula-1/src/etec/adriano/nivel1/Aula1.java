package etec.adriano.nivel1;

        /*Conteúdo disponível nessa aula: Classe, Tipo de dados, Variaveis, package, métodos, concatenação
         * conversão de tipo de dados, saida de dados
         */
public class Aula1 {
 
    public static void main(String[] args) {
        
       
             
        // Compreendendo as variáveis: 
        //Tipo        NomeBemDefinido   =  Atribuição
          String      MeuPrimeiroNome   =  "Adriano ";
          String      MeuSobrenome      =  "Pereira ";
          String      AlunoProfessor    =  "Professor ";
          int         MinhaIdade        =  38; 
          double      MinhaAltura       =  1.76;
          int         MeuNumeroEscolar  =  00007;

          String      Cabeçalho         = "Cabeçalho Variavel: " + MeuPrimeiroNome + MeuSobrenome + AlunoProfessor + MeuNumeroEscolar;

          System.out.println("Bem-vindo, alunos da ETEC Ermelinda");
          System.out.println(Cabeçalho);
          System.out.println("Meu nome é : " + MeuPrimeiroNome);
          System.out.println("Minha idade é : " + MinhaIdade + " Anos");
          System.out.println("Minha altura é :" + MinhaAltura + " Metros");
          System.out.println(cabeçalhoCompleto(MeuPrimeiroNome, MeuSobrenome, AlunoProfessor, MeuNumeroEscolar));
      
    }
        //Compreendendo métodos
        //Tipo de Retorno             NomeObjetivoNoInfinitivo   Parametros(s)

        public static String          cabeçalhoCompleto         (String MeuPrimeiroNome, String MeuSobrenome, String AlunoProfessor, int MeuNumeroEscolar ){
           
            return "Resultado do cabeçalho pelo método : ".concat(MeuPrimeiroNome).concat(" ").concat(MeuSobrenome).concat(AlunoProfessor).concat(Integer.toString(MeuNumeroEscolar));
            
        }


    }

