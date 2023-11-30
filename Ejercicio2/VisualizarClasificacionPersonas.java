package Ejercicio2;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class VisualizarClasificacionPersonas {
    
    public static class Persona{
        String sexo;
        int edad;
        public Persona (String sexo, int edad){
            this.sexo = sexo;
            this.edad = edad;
        }
    }
    public static ArrayList<Persona> leerPersonas(){//*Nota al final del progrmaa */
        ArrayList<Persona> personas = new ArrayList<Persona>();
        
        String[]sexos = {"Masculino", "Femenino"};
        for(int i =0; i<50; i++){
            Persona nuevaPersona = new Persona(sexos[i%2], (int)(Math.random()*80) +1);//Creamos nuevas personas y las incluimos en el Array
            //El genero de la persona es masculino o femenino según su índice, y tiene una edad aleatoria entre 1 y 80 años.
            personas.add(nuevaPersona);
        }
        return personas;
    }

    public static void main(String[] args) {
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        //Cargamos los datos de las 50 personas
        ArrayList<Persona>personas = leerPersonas();
        //Inicializamos las variables 
        float personasTotales = personas.size();
        float personasMayoresDeEdad = 0;
        float personasMenoresDeEdad = 0;
        float personasMascMayoresDeEdad = 0;
        float personasFemMenoresDeEdad = 0;
        float personasFemeninas = 0;
        float porcentajeMayoresDeEdad = 0;
        float porcentajeMujeres= 0 ;
        //Asignamos valores a estas variables
        for(int i =0; i<personasTotales; i++){
            if(personas.get(i).edad>=18){
                personasMayoresDeEdad++;

                if(personas.get(i).sexo == "Masculino"){
                    personasMascMayoresDeEdad++;
                } 
            }else{//Son menores de edad
                if(personas.get(i).sexo == "Femenino"){
                    personasFemMenoresDeEdad++;
                }

            }
            if(personas.get(i).sexo=="Femenino" ){
                personasFemeninas++;
            }
        }
        personasMenoresDeEdad = personasTotales - personasMayoresDeEdad;
        porcentajeMayoresDeEdad = (personasMayoresDeEdad/personasTotales)*100;
        porcentajeMujeres = (personasFemeninas/personasTotales)*100;
        //Cambio el formato de los porcentajes para que sean más legibles 
        String porcentajeMayoresDeEdadStr= formatoDecimal.format(porcentajeMayoresDeEdad);
        float porcentajeMayoresDeEdadRedondeado = Float.parseFloat(porcentajeMayoresDeEdadStr);
        String porcentajeMujeresStr= formatoDecimal.format(porcentajeMujeres);
        float porcentajeMujeresRedondeado = Float.parseFloat(porcentajeMujeresStr);
        //Imprimo la clasificación de las personas
        System.out.println("Cantidad de personas mayores de edad: " + personasMayoresDeEdad);
        System.out.println("Cantidad de personas menores de edad: " + personasMenoresDeEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + personasMascMayoresDeEdad);
        System.out.println("Cantidad de personas femeninas menores de edad: " + personasFemMenoresDeEdad);
        System.out.println("Porcentaje de personas mayores de edad respecto al total: " + porcentajeMayoresDeEdadRedondeado + "%");
        System.out.println("Porcentaje de mujeres respecto al total: " + porcentajeMujeresRedondeado + "%");

    }
    //** Nota
    //En este caso la lista de personas se autogenera, para no tener que introducirlas manualmente 
    //Si quisiéramos incluirlas manualmente usaríamos un Scanner dentro de un bucle for que iterara 50 veces (para todas las personas de la lista)
    
}
