package aplicacion;

import javax.swing.JOptionPane;

public class Aplicacion {    


    public static void main(String[] args) {
       
      float  celsius=0;
       int opcion;        
       
        ConversorTemperaturas info = new ConversorTemperaturas();
        do{
          opcion= Integer.parseInt(JOptionPane.showInputDialog("A que desxas convertilos:\n1.Farenheit\n2.reamur\n3.sair"));
          if(opcion == 1 ||opcion == 2)// se premo 3  non pide a temperatura 
           celsius =Float.parseFloat( JOptionPane.showInputDialog("introduce a temperatura en grados celsius"));

        switch (opcion) {
            case 1:
                try {
                    JOptionPane.showMessageDialog(null,+celsius+" ºC son "+ info.centigradosAFharenheit(celsius)+" ºF");
                } catch (TemperaturaErradaExcepcion e2) {
                    System.out.println(" erro1 "+ e2.getMessage());
                }
                break;

            case 2:                              
             info.centigradosAReamur(celsius);
                break;
              
            case 3: 
                System.exit(0);
            default:
                System.out.println(" ****  opcion errada***");   
           
        }
        }while(opcion<3);
    }
}
