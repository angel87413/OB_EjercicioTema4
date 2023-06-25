class Main {
    public static void main(String args[]) {
        /*
         * Usando un if, crear una condición que compare si la variable numeroIf es
         * positivo, negativo, o 0.
         */
        int numeroIf = -5;
        if (numeroIf == 0) {
            System.out.println("El número es 0");
        } else {
            if (numeroIf > 0) {
                System.out.println("El numero es Positivo");
            } else {
                System.out.println("El numero es negativo");
            }
        }
        /*
         * Crea un bucle While, este bucle tendrá que tener como condición que la
         * variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
         * bucle deberá:
         * Incrementar el valor de la variable en uno cada vez que se ejecute.
         * Mostrarlo por pantalla cada vez que se ejecute.
         */
        var numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        /*
         * Para el bucle Do While, deberás crear la misma estructura que en el While,
         * pero solo se debe ejecutar una vez.
         */
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);
        /*
         * Para el bucle For, crea una variable numeroFor, esta variable tendrá como
         * valor 0 y su condición será que la variable sea igual o menor que 3, se irá
         * incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
         * pantalla.
         */
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        /*
         * Por último, para el Switch, deberás crear la variable estacion, y distintos
         * case para las cuatro estaciones del año. Dependiendo del valor de la variable
         * estacion se deberá mandar un mensaje por consola informando de la estación en
         * la que está. También habrá que poner un default para cuando el valor de la
         * variable no sea una estación.
         */
        var estacion = "OTOÑO";
        switch (estacion) {
            case "VERANO":
                System.out.println("Estamos en VERANO");
                break;
            case "INVIERNO":
                System.out.println("Estamos en INVIERNO");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en PRIMAVERA");
                break;
            case "OTOÑO":
                System.out.println("Estamos en OTOÑO");
                break;
            default:
                System.out.println("Esa estacion no existe");
                break;
        }
    }
}