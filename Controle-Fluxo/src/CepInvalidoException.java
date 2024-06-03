public class CepInvalidoException extends Exception{
  public static void main(String[] args) {
    try{
        String cep = formataCep("6311000");
        System.out.println(cep);
    } 
    catch (CepInvalidoException cepInvalidoException){
        System.out.println("O cpf não apresenta as caracteristicas definidas na regra de negócio.");
        cepInvalidoException.printStackTrace();
    }
}

  static String formataCep(String cep) throws CepInvalidoException{
    if (cep.length() != 8){
        throw new CepInvalidoException();
    }
    return "63110-000";
  }
  
}
    

