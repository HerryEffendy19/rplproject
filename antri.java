import java.io.*;
import java.util.*;
class uutama {
BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
Scanner a = new Scanner (System.in);
int atas;
int bawah;
String nama[] = new String[10];

boolean kosong() {
if (atas==-1) {
return (true);
}
else {
return (false);
}
}

boolean penuh() {
if (atas==10) {
return (true);
}
else {
return (false);
}
}

void masuk() {
atas=0;
bawah=0;
for(int i=atas; i<11; i++) {
if (penuh()) {
System.out.println("Antrian Penuh, silahkan cari kasir lainnya....lanjutkan?...(tekan 1 untuk melanjutkan)");
int hlp= a.nextInt();
if (hlp!=1) {
System.out.println("mada mah...takan 1...tapi takan atau indak takan tetap lanjut juo nyo...");
}
}
else {
System.out.println("anda menempati antrian ke "+(i+1) +".....masukkan nama anda");
nama[atas] =a.nextLine();
}
atas=atas+1;
}
atas=atas-2;
}

void keluar() throws Exception {

for(int i=bawah; i<11; i++) {
if (kosong()) {
System.out.println("Antrian Kosong...lanjutkan?...(tekan 1 untuk melanjutkan)");
int help =a.nextInt();
if (help!=1) {
System.out.println("mada mah...takan 1...tapi takan atau indak takan programnyo lah habis...");
}
else
{
System.out.println("Programnyo lah hebis....");
}
}
else{

System.out.println("antrian ke " +(i+1) +" dengan nama\t: "+nama[bawah]);
System.out.println("Tekan enter untuk antrian beriktnya\n");

String bntuu=input.readLine();
}

bawah=bawah+1;
atas = atas-1;
}
}
}

public class antri
{
public static void main (String []args) throws Exception
{
System.out.println("\n\n=================================================\nProgram Antrian Supermarket ASSAKAJADI\n========================================================\n");
uutama bantu = new uutama();
bantu.masuk();
System.out.println("\n\nSekarang proses keluaran \n");
bantu.keluar();
}
}