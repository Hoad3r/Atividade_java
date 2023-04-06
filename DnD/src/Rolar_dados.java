import java.util.Random;
import java.util.Scanner;

public class Rolar_dados{
    Random random;
    Scanner scanner=new Scanner(System.in);
    char action;
    float[] numero={0,0,0,0,0,0,0,0,0,0,0,0};
    float defence;
    float attack;
    float others;
    int dado;
    static int i=0;
    // showAtributes is just to see if it's right.
    void showAtributes(){
        System.out.println("defence ="+defence);
        System.out.println("atack ="+attack);
        System.out.println("Others ="+others);
    }
    void setAction(Character action){
        switch (Character.toUpperCase(action)){
            case 'D' :{
                setDefence();
                break;
            }
            case 'A' :{
                setAttack();
                break;
            }
            case 'O' :{
                setOthers();
                break;
            }
        }
    }
    void setDefence(){
        defence=numero[i];
    }
    void setAttack(){
        attack=numero[i];
    }
    void setOthers(){
        others=numero[i];
    }
    void rolar_d2(){
        dado=2;
        random=new Random();
        rolar(dado);
        setAction(action);
        i++;
    }
    void rolar_d4(){
        dado=4;
        random=new Random();
        rolar(dado);
        setAction(action);
        i++;
    }
    void rolar_d6(){
        dado=6;
        random=new Random();
        rolar(dado);
        setAction(action);
        i++;
    }
    void rolar_d8(){
        dado=8;
        random=new Random();
        rolar(dado);
        setAction(action);
        i++;
    }
    void rolar_d10(){
        dado=10;
        random=new Random();
        rolar(dado);
        setAction(action);
        i++;
    }
    void rolar_d12(){
        dado=12;
        random=new Random();
        rolar(dado);
        setAction(action);
        i++;
    }
    void rolar_d20(){
        dado=20;
        random=new Random();
        rolar(dado);
        setAction(action);
        i++;
    }
    void rolar_d100(){
        dado=100;
        random=new Random();
        rolar(dado);
        setAction(action);
        i++;
    }
    void rolar(int dado){
        System.out.println("This is attack or defense? write A or D if not just press O it will simulate others performer");
        action=scanner.next().charAt(0);
        numero[i] = random.nextInt(dado)+1;
        System.out.println("Você rolou "+numero[i]+".");
    }
    void shownumbers(){
        while(i>=0){
            if(numero[i]>0){
                System.out.println(numero[i]);
            }
            i--;
        }
    }
    //static int i because have to stack;
   // use in main Rolar_dados rolardados=new Rolar_dados();
}
