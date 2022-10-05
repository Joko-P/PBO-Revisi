package PBO_3_Constructor;

import java.util.*;

public class Main_Program {
    
    private static boolean IsNumeric(String str){
        try {
        Double.parseDouble(str);
        return true;
        } catch(NumberFormatException e) {
        return false;
        }
    }
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean kondisi = false;
        String test, uname, pword;
        int choice;
        Account admin = new Account();
        Account newAcc = new Account("","");
        do {
            System.out.println("\n=== MAIN MENU ===\n");
            System.out.println("1. Login Admin");
            System.out.println("2. Buat Akun Baru");
            System.out.println("3. Lihat Akun");
            System.out.println("4. Ubah Password");
            System.out.println("5. EXIT");
            System.out.println("\nPilih dari menu di atas!");
            do {
                test = sc.nextLine();
                if (IsNumeric(test) == true) {
                    choice = Integer.parseInt(test);
                } else {
                    System.out.println(ANSI_RED + "Harap masukkan angka!" + ANSI_RESET);
                    choice = 0;
                }
            } while (IsNumeric(test)==false);
            
            switch(choice) {
                case 1 :
                    System.out.println("\n=== LOGIN ADMIN ===\n");
                    do {
                        System.out.println("Enter Username!");
                        uname = sc.nextLine();
                        System.out.println("Enter Password!");
                        pword = sc.nextLine();
                        
                        if (uname.equalsIgnoreCase(admin.getUsername()) && pword.equals(admin.getUsername())) {
                            kondisi = true;
                            System.out.println(ANSI_GREEN + "Login admin berhasil!");
                            System.out.println("Press enter to continue!" + ANSI_RESET);
                            sc.nextLine();
                        } else {
                            System.out.println(ANSI_RED + "Username atau Password Salah!");
                            System.out.println("Ingin mengulangi lagi? (Y/N)" + ANSI_RESET);
                            test = sc.nextLine();
                            if (test.equalsIgnoreCase("y")) {
                                kondisi = false;
                            } else if (test.equalsIgnoreCase("n")) {
                                System.out.println("Anda akan dikembalikan ke main menu!");
                                System.out.println("Press enter to continue!");
                                sc.nextLine();
                                kondisi = true;
                            }
                        }
                    } while (kondisi == false);
                    break;
                case 2 :
                    System.out.println("\n=== BUAT AKUN BARU ===\n");
                    System.out.println("Masukkan Username yang diinginkan!");
                    uname = sc.nextLine();
                    System.out.println("Masukkan Password yang diinginkan!");
                    pword = sc.nextLine();
                    
                    newAcc = new Account(uname, pword);
                    System.out.println("\nAkun berasil dibuat!");
                    System.out.println("Press enter to continue!");
                    sc.nextLine();
                    break;
                case 3 :
                    System.out.println("\n=== LIHAT AKUN ===\n");
                    System.out.println("\n1. Akun Admin");
                    System.out.println("Username = " + admin.getUsername());
                    System.out.println("Password = " + admin.getPassword());
                    System.out.println("\n2. Akun Baru");
                    System.out.println("Username = " + newAcc.getUsername());
                    System.out.println("Password = " + newAcc.getPassword());
                    System.out.println("\nPress enter to continue!");
                    sc.nextLine();
                    break;
                case 4 :
                    System.out.println("\n=== UBAH PASSWORD ===\n");
                    kondisi = false;
                    do {
                        System.out.println("Masukkan Password lama!");
                        String pword2 = sc.nextLine();
                        if (pword2.equals(newAcc.getPassword())) {
                            do {
                                System.out.println("Masukkan Password baru!");
                                pword2 = sc.nextLine();
                                System.out.println("Masukkan ulang Password baru!");
                                pword = sc.nextLine();
                                
                                if (pword2.equals(pword)) {
                                    newAcc.setPassword(pword);
                                    System.out.println(ANSI_GREEN + "Password berhasil diganti!" + ANSI_RESET);
                                    System.out.println("Press enter to continue!");
                                    sc.nextLine();
                                    kondisi = true;
                                } else {
                                    System.out.println(ANSI_RED + "Password tidak cocok!" + ANSI_RESET);
                                    System.out.println("Harap ulangi!");
                                    kondisi = false;
                                }
                            } while (kondisi == false);
                        } else {
                            System.out.println(ANSI_RED + "Password lama salah!" + ANSI_RESET);
                            System.out.println("Ulangi lagi? (Y/N)");
                            test = sc.nextLine();
                            if (test.equalsIgnoreCase("y")) {
                                kondisi = false;
                            } else if (test.equalsIgnoreCase("n")) {
                                System.out.println("Anda akan dikembalikan ke main menu!");
                                System.out.println("Press enter to continue!");
                                sc.nextLine();
                                kondisi = true;
                            }
                        }
                    } while (kondisi == false);
                    break;
                case 5 :
                    System.out.println("Good Bye!");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Mohon masukkan pilihan yang benar!");
            }
        } while (true);
    }
    
}
