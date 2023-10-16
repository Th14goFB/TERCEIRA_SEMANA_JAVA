
public class switchcase {
	public static void main(String[] args) {
		String plano = "T";

        switch (plano) {
            case "S":{
                System.out.print("5GB de internet");
                break;
            }
            case "M":{
                System.out.print("Whatsapp e Instagram liberados");
                break;
            }
            case "B":{
                System.out.print("100 minutos de ligação");
                break;
            }   

            default:{
                System.out.print("Serviço invalido");
            }
        }
	}
}