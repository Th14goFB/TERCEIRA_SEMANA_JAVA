/*For/Each estão correlacionados com a ideia de Array.*/

public class ForArray {

    //Cada elemento no "alunos" é separado por uma vírgula e fica entre chaves.
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
        //Forma abreviada de "x = 0; x < alunos; x++"
        for(String aluno : alunos){
          System.out.println(aluno);
        }
    }
}

