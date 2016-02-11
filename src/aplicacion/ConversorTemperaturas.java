
package aplicacion;

import javax.swing.JOptionPane;

public class ConversorTemperaturas {
    
    public final static float TLIMITE=80;//CONSTANTES EN MAYUSCULAS E STATIC
    public float faren,reamur;

    public float centigradosAFharenheit(float centi) throws TemperaturaErradaExcepcion{ //propagamos excepción
        if (centi<TLIMITE)
            throw new TemperaturaErradaExcepcion(" a temperatura ten que ser maior de 80 ");//Creamos un obxecto da nosa clase. non capturo a excepción, pero aviso de que vai e de que tipo é.Lanzo mensaxe personalizado
        else{          
        faren=(float)(9.0/5.0*centi+32);
        return faren;
        }
    }
    
    public void centigradosAReamur(float centi){
    
        try{
        reamur=(float)(4.0/5.0*centi);
              
        if (centi<TLIMITE){throw new TemperaturaErradaExcepcion();}//lanzo mensaxe por defecto
            System.out.println(" temperatura  : "+ reamur);
        }catch(TemperaturaErradaExcepcion e1){             
            
            System.out.println("erro2 "+ e1.getMessage());       
        } 
    }
    
  

}