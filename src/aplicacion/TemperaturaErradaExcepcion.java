
package aplicacion;


public class TemperaturaErradaExcepcion extends Exception {//llamo a la superclase Exception (extende de exception)
    public TemperaturaErradaExcepcion(){
        super("mensaxe por defecto:temperatura ten que ser naior que 80ºC");//mensaxe por defecto
    }
    public TemperaturaErradaExcepcion(String mensaxe){//usamolo cando queremos dar unha mensaxe personalizada
        super(mensaxe);
    }
}
