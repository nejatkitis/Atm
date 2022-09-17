import javax.script.ScriptEngine;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String username,password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select,price;
        while (right>0){
            System.out.print("Kullanıcı adınızı Giriniz :");
            username = input.nextLine();
            System.out.print("Şifrenizi giriniz :");
            password = input.nextLine();

            if (username.equals("patika")&&password.equals("java123")){
                System.out.println("Merhaba Patikabank'a hoşgeldiniz.");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1 : Para Çekme\n2 : Para Yatırma\n3 : Bakiye Sorgulama\n4 : Çıkış");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Lütfen yatırmak istediğiniz miktarı giriniz : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Lütfen çekmek istediğiniz miktarı giriniz : ");
                            price = input.nextInt();
                            balance -= price;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance + " TL");
                            break;
                        case 4:
                            System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");
                            break;
                    }
                } while (select!=4);
            }else {
                right--;
                System.out.println("Hatalı giriş yaptınız.\nLütfen tekrar deneyiniz.");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur.\nLütfen bankanız ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan giriş hakkınız : "+right);
                }
            }
        }
    }
}
