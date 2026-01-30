package birds;

public class Birds {

    public static void main(String[] args) {
        int[] passarosPorDia = {2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1};

        int totalDePassaros = 0;
        int totalPassarosPrimeira = 0;
        int totalPassarosSegunda = 0;

        for (int i = 0; i < 14; i++) {
            totalDePassaros = totalDePassaros + passarosPorDia[i];
        }
        
        System.out.println(totalDePassaros);
        
        for (int p=0; p<7; p++){
            totalPassarosPrimeira = totalPassarosPrimeira + passarosPorDia[p];
            
        }
        System.out.println(totalPassarosPrimeira);
    
        for (int i=7; i<14; i++){
            totalPassarosSegunda = totalPassarosSegunda + passarosPorDia[i];
            
        }
            System.out.println(totalPassarosSegunda);
    }

}