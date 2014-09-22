import java.io.*;
import java.util.Scanner;
public class Queue {
public static void main( String args[]){
              Queue q = new Queue(); 
				System.out.println("			    Mobil 10 masuk dari pintu utara"); 
				q.enqueue( 10 );
				q.cetak();       
				System.out.println("			    Mobil 20 masuk dari pintu utara ");
				q.enqueue( 20 ); 
				q.cetak();      
				System.out.println("			    Mobil 30 masuk dari pintu utara");
				q.enqueue( 30 ); 
				q.cetak();      
				System.out.println("			    Mobil 40 masuk dari pintu utara");
				q.enqueue( 40 ); 
				q.cetak();
				System.out.println("			    Mobil 50 masuk dari pintu utara");
				q.enqueue( 50 ); 
				q.cetak();
				Object dtHapus = null;
				System.out.println("			    Mobil 10 keluar dari pintu selatan");
				q.dequeue();
				q.cetak();
				System.out.println("			    Ketika Mobil 30 Hendak ingin keluar");
				System.out.println("			    Maka Mobil 20 di keluarkan sementara");
				q.cetak();
				q.dequeue();
				q.cetak();
				System.out.println("			    Mobil 30 Keluar dari pintu selatan");
				q.dequeue();
				q.cetak();
				System.out.println("			    Mobil 20 masuk kembali dari pintu selatan");
				q.awal( 20 );
				q.cetak();
     }
public class Node {  
   Object data;
   Node next;

   Node( Object object ){this ( object, null );}

   Node( Object object, Node node ){
      data = object;
      next = node;
      }

   Object getObject(){return data;}

      Node getNext() {return next;}
}
public class List {
      private Node nodeAwal;
      private Node nodeAkhir;
      private String nama;
 
      public List(){    this( "list" ); }

   public List( String namaList ){
         nama = namaList;
         nodeAwal = nodeAkhir = null;
      }
     
   public void sisipDiAwal( Object dt ){
      if (kosong()) nodeAwal = nodeAkhir = new Node( dt );
      else nodeAwal = new Node( dt, nodeAwal );
      }
     
   public void sisipDiAkhir( Object dt ){
      if (kosong()) nodeAwal = nodeAkhir = new Node( dt );
      else nodeAkhir = nodeAkhir.next = new Node( dt );
   }
     
   public Object hapusDrDepan(){
      Object itemDihapus = null;
      if (!kosong()) {
              itemDihapus = nodeAwal.data;    
             if ( nodeAwal == nodeAkhir )
             nodeAwal = nodeAkhir = null;
             else nodeAwal = nodeAwal.next;    
      }

      return itemDihapus;
   }  

            public boolean kosong(){return nodeAwal == null;}
           
      public void cetak(){
        if ( kosong() ){
           System.out.printf( "Kosong \n", nama );
           return;
        }
     
        System.out.printf( "Isi Barisan Parkir Mobil  : ", nama );
        Node kini = nodeAwal;
     
        while ( kini != null ){
           System.out.printf( " %s ", kini.data );
           kini = kini.next;
        }
     
        System.out.println( "\n" );
      }
}


    private List listAntrian;
    public Queue() {
       listAntrian = new List( "queue" );
    }
    
    public void enqueue( Object object ){
       listAntrian.sisipDiAkhir( object );
    }
    
    public Object dequeue(){
       return listAntrian.hapusDrDepan();
    }
    
    public boolean kosong(){
       return listAntrian.kosong();
    }
	public void awal( Object object ){
		listAntrian.sisipDiAwal( object );
	}
   
    public void cetak(){listAntrian.cetak();}
   
       
 }