import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      
        
        ArrayList<String> nomes = new ArrayList(); // cria a lista
        nomes.add("Sofia");
         nomes.add("Junin");
        System.out.println(nomes.get(0)); 
        // imprime os indices - usar () ao ines de []
       // usa o metodo get para pegar (esse é o significado de get) os indices de nomes
       
       nomes.remove(0);
       System.out.println(nomes.get(0)); //indice 0 passa a ser junin
    }
}
