
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        PriorityQueue<paci> queue = new PriorityQueue<paci> ();
        Scanner scan = new Scanner(System.in);
        VectorHeap<paci> heap= new VectorHeap<paci>();
        String name=" ";
        String sint=" ";
        String pri=" ";
        String posit2=" ";
        int posit1=0;
        String p="";
        String s="";
        int op=0;
        
      String pacis= null;
      FileReader fileReader = new FileReader("pacis.txt");
      BufferedReader doc = new BufferedReader(fileReader);  
      while((pacis = doc.readLine()) != null) {
      
      
        name= pacis.substring(0, posit1=pacis.indexOf(","));
        p=pacis.replaceFirst(name, " ");
        s=p.replaceFirst(",", " ");
        sint=p.substring(p.indexOf(" ")+3, s.indexOf(",") );
        posit2=pacis.replaceFirst(",", "");
        pri=pacis.substring(posit2.indexOf(",")+2,pacis.length());
        paci pacient= new paci();
        pacient.setname(name);
        pacient.setsint(sint);
        pacient.setpri(pri);
        heap.add(paci);
        queue.add(paci);
        
      }
     
      
       System.out.println ("Bienvenido emergencias del Hospital");
       System.out.println ("Ingrese la opcion que desea realizar");
       System.out.println ("1 ordenar pacientes Priority Queue");
       System.out.println ("2 ordenar pacientes Priority Queue implementada por JFC");
       System.out.println ("3 paciente con mayor prioridad ha sido atendido");
       System.out.println ("4 Salir");
       op=scan.nextInt();
       scan.nextLine();
       while(op!=4){
       if (op==1){
           System.out.println (heap.toString());
       }
       else if (op==2){
           System.out.println (queue.toString());
       }
       else if(op==3){
           heap.remove();
           System.out.println (heap.toString());
       }
       System.out.println ("Ingrese de que manera desea ordenar la prioridas de emergencia");
       System.out.println ("1 Priority Queue");
       System.out.println ("2 Priority Queue implementada por JFC");
       System.out.println ("3 paciente con mayor prioridad ha sido atendido ");
       System.out.println ("4 salir");
       op=scan.nextInt();
       scan.nextLine();
       }
      
    
      
    }
    
}
