import java.io.FileWriter;
import java.io.IOException;
public class Program {
    public static void main(String[] args) {

        double temperatura = 999;
        boolean ventiladortabom = false;

        try{
         //mano isso verifica a temp do sensoseer
            if (temperatura > 60|| temperatura < -20){
                throw new LeiturainscostenteExeption
                        ("ixi o sensor ta com uma incositencia na leitura");
            }
            System.out.println("Temperatura de agr: "+ temperatura);
            //vai dizerr se a temp ta alta men wild
            if (temperatura >30){
                System.out.println("Ventila ligandoooo");

                if (ventiladortabom){
                    throw new FalhaAtuadorException
                            ("ixi ventilador ta falhando");
                }
                System.out.println("Ventilador ligado viu com sucesso rsrsrs");
            }
          //vai marcar a temp baaixa
            else if (temperatura < 15){
                System.out.println("Ligando aquecedorf");
                System.out.println("o aquecedor ta ligado com sucesso");
            }
            else{
                System.out.println("Tempertaura ta no ponto");
            }
        } catch (LeiturainscostenteExeption e){
            System.out.println(e.getMessage());
        } catch (FalhaAtuadorException e){
            System.out.println(e.getMessage());
        }
    }
}