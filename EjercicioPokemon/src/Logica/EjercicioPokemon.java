package Logica;

public class EjercicioPokemon {

    public static void main(String[] args) {

        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidroBomba();
        
        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();
        
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarParalizar();
        
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();
        
    }
    
}
