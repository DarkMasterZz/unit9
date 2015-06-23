/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9;

/**
 *
 * @author Agustín Erkiletlian Battista
 */
public class CadenasAlumno 
{
    public boolean sonIguales(String cadena1, String cadena2)
    {
        if (cadena1 == cadena2)
            return true;
        return false;
    }
    
    public boolean esMayor(String cadena1, String cadena2)
    {
        int contador = 1;
        
        while (true)
        {
            char char1 = cadena1.charAt(contador);
            char char2 = cadena2.charAt(contador);

            if (char1 > char2)
                return true;
            else if (char1 < char2)
                return false;
            contador++;
        }
    }
    
    public boolean esMenor(String cadena1, String cadena2)
    {
        int contador = 1;
        
        while (true)
        {
            char char1 = cadena1.charAt(contador);
            char char2 = cadena2.charAt(contador);

            if (char1 < char2)
                return true;
            else if (char1 > char2)
                return false;
            contador++;
        }
    }
    
    public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2)
    {
        String[] minus = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
            "n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] mayus = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        for (int i = 0; i < cadena1.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (cadena1.substring(i,1) == minus[j] || cadena1.substring(i,1) == mayus[j])
                    if (cadena2.substring(i,1) != minus[j] || cadena2.substring(i,1) != mayus[j])
                        return false;
            }
        }
        return true;
    }

    public String reemplazaTodos(String cadena, String regla, String cambio)
    {
        String texto = "";
        for (int i = 0; i < cadena.length() - regla.length(); i++)
        {
            if (cadena.substring(i,i + regla.length()) == regla)
            {
                texto += cambio;
                i += cambio.length()-1;
            }
            else
                texto += cadena.substring(i);
        }
        return texto;
    }

    public String reemplazaPrimero(String cadena, String regla, String cambio)
    {
        String texto = "";
        boolean remplazado = false;
        for (int i = 0; i < cadena.length() - regla.length(); i++)
        {
            if (cadena.substring(i,i + regla.length()) == regla && remplazado == false)
            {
                texto += cambio;
                i += cambio.length()-1;
                remplazado = true;
            }
            else
                texto += cadena.substring(i);
        }
        return texto;
    }
    
    public String convertirMayusculas(String cadena)
    {
        String[] minus = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
            "n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] mayus = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String texto = "";
        
        for (int i = 0; i < cadena.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (cadena.substring(i,1) == minus[j] || cadena.substring(i,1) == mayus[j])
                    texto += mayus[j];
            }
        }
        return texto;
    }
    
    public String convertirMinusculas(String cadena)
    {
        String[] minus = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
            "n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] mayus = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String texto = "";
        
        for (int i = 0; i < cadena.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (cadena.substring(i,1) == minus[j] || cadena.substring(i,1) == mayus[j])
                    texto += minus[j];
            }
        }
        return texto;
    }
    
    public static void main(String[] args)
    {
        
    }
}
