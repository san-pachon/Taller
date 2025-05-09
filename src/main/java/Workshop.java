import java.util.List;
import java.util.Random;
public class Workshop{
    public static void main(String[] args){
    }
    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b){
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a+b;
    }
    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c){
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
        if (a > b && a > c){
            return a;
        }
        else if (b > c && b > a){
            return b;
        }
        else{
            return c;
        }
    }
    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite){
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++){
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }
    // Método que calcula el factorial de un número entero
    public int factorial(int n){
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.
        if (n == 0){
            return 1;
        }
        else{
            for (int i = n - 1; i > 0; i--){
                n = n * i;
            }
            return n;
        }
    }
    // Método que verifica si un número es primo
    public boolean esPrimo(int numero){
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i <= numero / 2; i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n){
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        // Lanzar IllegalArgumentException si n es negativo.
        if (n == 0){
            return new int[0];
        }
        int[] serie = new int[n];
        int a = 0, b = 1;
        for (int i = 0; i < n; i++){
            serie[i] = a;
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        return serie;
    }
    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo){
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.
        int suma = 0;
        for (int num : arreglo){
            suma += num;
        }
        return suma;
    }
    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo){
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        int suma = 0, contador = 0;
        for (int num : arreglo){
            suma += num;
            contador++;
        }
        if (contador == 0){
            return 0;
        }
        double promedio = (double) suma / contador;
        return promedio;
    }
    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo){
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++){
            if (arreglo[i] > mayor){
                mayor = arreglo[i];
            }
        }
        return mayor;
    }
    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo){
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++){
            if (arreglo[i] < menor){
                menor = arreglo[i];
            }
        }
        return menor;
    }
    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento){
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == elemento){
                return true;
            }
        }
        return false;
    }
    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo){
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].
        int[] invertido = new int[arreglo.length];
        int n = 0;
        for (int i = arreglo.length - 1; i >= 0; i--){
            invertido[n] = arreglo[i];
            n++;
        }
        return invertido;
    }
    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo){
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
        for (int i = 0; i < arreglo.length - 1; i++){
            for (int n = 0; n < arreglo.length - 1 - i; n++){
                if (arreglo[n] > arreglo[n + 1]){
                    int cambio = arreglo[n];
                    arreglo[n] = arreglo[n + 1];
                    arreglo[n + 1] = cambio;
                }
            }
        }
        return arreglo;
    }
    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo){
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        int[] temp = new int[arreglo.length];
        int tamaño = 0;
        for (int i = 0; i < arreglo.length; i++){
            boolean repetido = false;
            for (int n = 0; n < tamaño; n++){
                if (arreglo[i] == temp[n]){
                    repetido = true;
                    break;
                }
            }
            if (!repetido){
                temp[tamaño] = arreglo[i];
                tamaño++;
            }
        }
        int[] resultado = new int[tamaño];
        for (int i = 0; i < tamaño; i++){
            resultado[i] = temp[i];
        }
        return resultado;
    }
    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2){
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].
        int[] combinado = new int[arreglo1.length + arreglo2.length];
        int i = 0;
        for (int n = 0; n < arreglo1.length; n++){
            combinado[i] = arreglo1[n];
            i++;
        }
        for (int n = 0; n < arreglo2.length; n++){
            combinado[i] = arreglo2[n];
            i++;
        }
        return combinado;
    }
    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones){
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        int n = arreglo.length;
        int[] rotado = new int[n];
        if (n == 0)
            return rotado;
        posiciones = ((posiciones % n) + n) % n;
        for (int i = 0; i < n; i++){
            rotado[i] = arreglo[(i - posiciones + n) % n];
        }
        return rotado;
    }
    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena){
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
        if (cadena == null){
            return 0;
        }
        return cadena.length();
    }
    // Método que invierte una cadena
    public String invertirCadena(String cadena){
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".
        if (cadena == null)
            return null;
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--){
            invertida += cadena.charAt(i);
        }
        return invertida;
    }
    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena){
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
        cadena = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int izquierda = 0;
        int derecha = cadena.length() - 1;
        while (izquierda < derecha){
            if (cadena.charAt(izquierda) != cadena.charAt(derecha)){
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena){
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
        if (cadena == null) return 0;
        int contador = 0;
        boolean enPalabra = false;
        for (int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);
            if (c != ' '){
                if (!enPalabra){
                    contador++;
                    enPalabra = true;
                }
            }
            else{
                enPalabra = false;
            }
        }
        return contador;
    }
    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena){
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
        if (cadena == null)
            return null;
        return cadena.toUpperCase();
    }
    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena){
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        if (cadena == null)
            return null;
        return cadena.toLowerCase();
    }
    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena){
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        if (cadena == null || antiguaSubcadena == null || nuevaSubcadena == null){
            return null;
        }
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }
    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena){
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        if (cadena == null || subcadena == null){
            return -1;
        }
        return cadena.indexOf(subcadena);
    }
    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo){
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        if (!correo.contains("@"))
            return false;
        if (correo.contains(" "))
            return false;
        String[] partes = correo.split("@");
        if (partes.length != 2)
            return false;
        String local = partes[0];
        String dominio = partes[1];
        if (local.isEmpty() || dominio.isEmpty())
            return false;
        if (!dominio.contains(".")) return false;
        if (!local.matches("[a-zA-Z0-9._-]+"))
            return false;
        return true;
    }
    // Método que calcula el promedio de una lista de números
    public double promedioLista(List<Integer> lista){
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        if (lista == null || lista.isEmpty())
            return 0.0;
        int suma = 0;
        for (int numero : lista){
            suma += numero;
        }
        return (double) suma / lista.size();
    }
    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero){
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        if (numero < 0)
            return "-" + Integer.toBinaryString(-numero);
        return Integer.toBinaryString(numero);
    }
    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero){
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        if (numero < 0)
            return "-" + Integer.toHexString(-numero).toUpperCase();
        return Integer.toHexString(numero).toUpperCase();
    }
    // Método para el juego de piedra, papel, tijera
    public String jugarPiedraPapelTijeraLagartoSpock(String usuario){
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera.
        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        String[] opciones = {"piedra", "papel", "tijera"};
        String user = usuario.toLowerCase();
        String comp = opciones[new Random().nextInt(3)];
        if (user.equals(comp)) return "Empate";
        if ((user.equals("piedra") && comp.equals("tijera")) || (user.equals("tijera") && comp.equals("papel")) ||
                (user.equals("papel") && comp.equals("piedra")))
            return "Ganaste";
        return "Perdiste";
    }
    public String pptls2(String game[]){
        //Retornar player ganador o empate
        //Rock = R
        // Paper = P
        // Scissors = S
        //Lizard = L
        //Spock = V
        //Scissors cuts Paper
        //Paper covers Rock
        //Rock crushes Lizard
        //Lizard poisons Spock
        //Spock smashes Scissors
        //Scissors decapitates Lizard
        //Lizard eats Paper
        //Paper disproves Spock
        //Spock vaporizes Rock
        //Rock crushes Scissors
        String p1 = game[0];
        String p2 = game[1];
        if (p1.equals(p2)){
            return "Empate";
        }
        if ((p1.equals("S") && (p2.equals("P") || p2.equals("L"))) ||
                        (p1.equals("P") && (p2.equals("R") || p2.equals("V"))) ||
                        (p1.equals("R") && (p2.equals("L") || p2.equals("S"))) ||
                        (p1.equals("L") && (p2.equals("V") || p2.equals("P"))) ||
                        (p1.equals("V") && (p2.equals("S") || p2.equals("R")))){
            return "Player 1";
        }
        else{
            return "Player 2";
        }
    }
    public double areaCirculo(double radio){
        double area =  radio * radio * Math.PI ;
        return area;
    }
    public String zoodiac(int day, int month){
        if (day >= 20 && month == 1 || day <= 18 && month == 2){
            return "Acuario";
        }
        else if (day >= 19 && day <= 29 && month == 2 || day <= 29 && month == 3){
            return "Pisces";
        }
        else if (day >= 21 && month == 3 || day <= 19 && month == 4){
            return "Aries";
        }
        else if (day >= 20 && day <= 30 && month == 4 || day <= 20 && month == 5){
            return "Tauro";
        }
        else if (day >= 21 && month == 5 || day <= 20 && month == 6){
            return "Gemini";
        }
        else if (day >= 21 && day <= 30 && month == 6 || day <= 22 && month == 7){
            return "Cancer";
        }
        else if (day >= 23 && month == 7 || day <= 22 && month == 8){
            return "Leo";
        }
        else if (day >= 23 && month == 8 || day <= 22 && month == 9){
            return "Virgo";
        }
        else if (day >= 23 && day <= 30 && month == 9 || day <= 22 && month == 10){
            return "Libra";
        }
        else if (day >= 23 && month == 10 || day <= 21 && month == 11){
            return "Escorpio";
        }
        else if (day >= 22 && day <= 30 && month == 11 || day <= 21 && month == 12){
            return "Sagitario";
        }
        else if (day >= 22 && month == 12 || day <= 10 && month == 1){
            return "Capricornio";
        }
        else{
            return "Invalid Date";
        }
    }
}