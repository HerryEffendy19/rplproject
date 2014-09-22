import java.util.Scanner;
 
class Linear_Search 
{
  public static void main(String args[])
  {
    int c, n, cari,j, array[], indeks[];
 
    Scanner in = new Scanner(System.in);
		System.out.print("Masukan Banyaknya Data : ") ;
		n = in.nextInt(); 
		array = new int[n];
		indeks =new int[n];
 
	for (c = 0; c < n; c++)
		{
			System.out.print(" Input data ke "+c+" : ");
			array[c] = in.nextInt();
		}
      
 
    System.out.print("masukan nilai 'yang di cari = ");
	cari=in.nextInt();
	j=0;
	for (c=0;c<n;c++){
		if (array[c]==cari)
		{
			indeks[j]=c;
			j++;
		}
	 }
 
	if (j>0){
	System.out.print ("data ditemukan di indeks ke : ");
	for (c=0;c<j;c++)
	System.out.print (indeks[c]+" ");
	}
	else
	 System.out.print ("Data tidak ditemukan pada array");
	}
	}