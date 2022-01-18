public class MonApplication9 {

   public static void main (String arg[]) {
      System.out.println ("bienvenue dans mon application de gestion des ressources humaiines");
	  
	  String employe1 = "yves";
	  
	  int salaire1 ;
	  
	  ServicePaye servicePaye1 ;
	  
	  servicePaye1 = new ServicePaye();                           // Instanciation classe = création objet mémoire
	   
	  salaire1 = servicePaye1.calculerSalaire ( employe1);         // Utilisation du savoir-faire de l'objet
	   
	  System.out.println (employe1 + " a un salaire de " + salaire1);
	   
                                          }
                              }	   