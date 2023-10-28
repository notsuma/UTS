import java.util.Scanner;
public class utsno2 {
    public static void main(String[]args){

        int honorTetap = 3000000;
        Scanner input = new Scanner(System.in);
        // Input Line
        System.out.println("==Layar Masukkan==");
        System.out.println("Program Hitung Honor Karyawan Kontrak");
        System.out.println("PT. XYZ ");
        System.out.print("Nama Karyawan : ");
        String nama = input.nextLine();
        System.out.print("Golongan : ");
        int gol = input.nextInt();
        System.out.print("Pendidikan (1 untuk SMU/2 untuk D3/3 untuk S1) : ");
        int pend = input.nextInt();
        System.out.print("Jumlah Jam Kerja : ");
        int jam = input.nextInt();

        if(gol==1){
            System.out.println("\n");
            System.out.println("==Layar Keluaran==");
            System.out.println("Karyawan yang bernama :" +nama);
            System.out.println("\n");
            System.out.println("Honor yang diterima ");
            
            if(pend==1){
                if (jam>8){
                    int honorLembur=(jam-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*5/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*5/200);
                    System.out.println("Honor Lembur : " + honorLembur*2500);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+ (honorTetap+honorTetap*5/100+honorTetap*5/200+honorLembur*2500));
                }else if (jam<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*5/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*5/200);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+(honorTetap+honorTetap*5/100+honorTetap*5/200));;
                }
    
            }else if(pend==2){
                if (jam>8){
                    int honorLembur=(jam-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*10/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*5/100);
                    System.out.println("Honor Lembur : " + honorLembur*2500);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+ (honorTetap+honorTetap*10/100+honorTetap*5/100+honorLembur*2500));
                }else if (jam<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*10/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*5/100);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+(honorTetap+honorTetap*10/100+honorTetap*5/100));;
                }
            }else if(pend==3){
                if (jam>8){
                    int honorLembur=(jam-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*15/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*15/200);
                    System.out.println("Honor Lembur : " + honorLembur*2500);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+ (honorTetap+honorTetap*15/100+honorTetap*15/200+honorLembur*2500));
                }else if (jam<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*15/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*15/200);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+(honorTetap+honorTetap*15/100+honorTetap*15/200));;
                }
            }
        }else if(gol==2){
            System.out.println("\n");
            System.out.println("==Layar Keluaran==");
            System.out.println("Karyawan yang bernama :" +nama);
            System.out.println("Honor yang diterima ");
            
            if(pend==1){
                if (jam>8){
                    int honorLembur=(jam-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*5/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*5/200);
                    System.out.println("Honor Lembur : " + honorLembur*2500);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+ (honorTetap+honorTetap*5/100+honorTetap*5/200+honorLembur*2500));
                }else if (jam<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*5/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*5/200);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+(honorTetap+honorTetap*5/100+honorTetap*5/200));;
                }
    
            }else if(pend==2){
                if (jam>8){
                    int honorLembur=(jam-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*10/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*5/100);
                    System.out.println("Honor Lembur : " + honorLembur*2500);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+ (honorTetap+honorTetap*10/100+honorTetap*5/100+honorLembur*2500));
                }else if (jam<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*10/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*5/100);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+(honorTetap+honorTetap*10/100+honorTetap*5/100));;
                }
            }else if(pend==3){
                if (jam>8){
                    int honorLembur=(jam-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*15/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*15/200);
                    System.out.println("Honor Lembur : " + honorLembur*2500);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+ (honorTetap+honorTetap*15/100+honorTetap*15/200+honorLembur*2500));
                }else if (jam<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*15/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*15/200);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+(honorTetap+honorTetap*15/100+honorTetap*15/200));;
                }
            }    
        }else if(gol==3){
            System.out.println("\n");
            System.out.println("==Layar Keluaran==");
            System.out.println("Karyawan yang bernama :" +nama);
            System.out.println("Honor yang diterima ");
            
            if(pend==1){
                if (jam>8){
                    int honorLembur=(jam-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*5/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*5/200);
                    System.out.println("Honor Lembur : " + honorLembur*2500);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+ (honorTetap+honorTetap*5/100+honorTetap*5/200+honorLembur*2500));
                }else if (jam<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*5/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*5/200);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+(honorTetap+honorTetap*5/100+honorTetap*5/200));;
                }
    
            }else if(pend==2){
                if (jam>8){
                    int honorLembur=(jam-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*10/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*5/100);
                    System.out.println("Honor Lembur : " + honorLembur*2500);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+ (honorTetap+honorTetap*10/100+honorTetap*5/100+honorLembur*2500));
                }else if (jam<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*10/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*5/100);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+(honorTetap+honorTetap*10/100+honorTetap*5/100));;
                }
            }else if(pend==3){
                if (jam>8){
                    int honorLembur=(jam-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*15/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*15/200);
                    System.out.println("Honor Lembur : " + honorLembur*2500);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+ (honorTetap+honorTetap*15/100+honorTetap*15/200+honorLembur*2500));
                }else if (jam<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honorTetap*15/100);
                    System.out.println("Tunjangan Pendidikan : " + honorTetap*15/200);
                    System.out.println("--------------------------------------+");
                    System.out.println("Total Honor yang diterima : "+(honorTetap+honorTetap*15/100+honorTetap*15/200));;
                }
            }
        }
        input.close();
    }
}
