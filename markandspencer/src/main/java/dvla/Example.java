package dvla;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Example {

    public String ab;

    public boolean containsChar(String s, char search) {
        if (s.length() == 0)
            return false;
        else
            return s.charAt(0) == search || containsChar(s.substring(1), search);
    }

    public Boolean validreg(String re, char i){
        String reg = "^[A-Za-z]{2}[0-9]{2}[A-Za-z]{3}$";
        Pattern p = Pattern.compile(reg);
        // return p.matcher(re).matches();
        boolean x =  p.matcher(re).matches();
        boolean y =  re.charAt(1) == i || containsChar(re.substring(1), i);

        return (x && y);

    }


    public Boolean validreg1(String re){
        String reg = "^[A-Za-z]{2}[0-9]{2}[A-Za-z]{3}$";
        Pattern p = Pattern.compile(reg);
        return p.matcher(re).matches();


    }



    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();


        Example e = new Example();

        System.out.println(e.validreg1(str));

        // System.out.println(e.validreg("BD11SMR"));

        boolean v = true;


        if(e.validreg1(str).equals(v)){

            String a = str.substring(0,1);
            String b = str.substring(2,4);
            String d = str.substring(4,7);

            System.out.println(a);
            System.out.println(b);
            System.out.println(d);

            char f = str.charAt(1);
            char c = str.charAt(0);
            int y = Integer.parseInt(b);

            SimpleDateFormat simpleformat = new SimpleDateFormat("yy");
            String strYear = simpleformat.format(new Date());
            System.out.println("Current Year = "+strYear);
            switch (f){
                case 'I':
                    System.out.println("Invalid area random code i present");
                    break;

                case 'i':
                    System.out.println("Invalid area random code displayed");
                    break;

                default:
                    break;
            }
            switch (c){

                case 'A':
                    System.out.println("Region of registration is :  Anglia");
                    break;

                case 'B':
                    System.out.println("Region of registration is :  Birmingham");
                    break;

                case  'C':
                    System.out.println("Region of registration is :  Cymru (Wales)");
                    break;
                case  'D':
                    System.out.println("Region of registration is :  Deeside");
                    break;
                case  'E':
                    System.out.println("Region of registration is :  Essex");
                    break;
                case  'F':
                    System.out.println("Region of registration is :  Forest and Fens");
                    break;
                case  'G':
                    System.out.println("Region of registration is :  Garden of England");
                    break;
                case  'H':
                    System.out.println("Region of registration is :  Hampshire");
                    break;
                case  'J':
                    System.out.println("Region of registration is :  ");
                    break;
                case  'K':
                    System.out.println("Region of registration is :  Milton Keynes");
                    break;
                case  'L':
                    System.out.println("Region of registration is :  London");
                    break;
                case  'M':
                    System.out.println("Region of registration is :  Manchester");
                    break;
                case  'N':
                    System.out.println("Region of registration is :  Newcastle");
                    break;
                case  'O':
                    System.out.println("Region of registration is :  Oxford");
                    break;
                case  'P':
                    System.out.println("Region of registration is :  Preston");
                    break;
                case  'R':
                    System.out.println("Region of registration is :  Reading");
                    break;
                case  'S':
                    System.out.println("Region of registration is :  Scotland");
                    break;
                case  'T':
                    System.out.println("Region of registration is :  ");
                    break;
                case  'U':
                    System.out.println("Region of registration is :  ");
                    break;

                case  'V':
                    System.out.println("Region of registration is :  Severn Valley");
                    break;

                case  'W':
                    System.out.println("Region of registration is :  West of England");
                    break;

                case  'Y':
                    System.out.println("Region of registration is :  Yorkshire");
                    break;

                case  'X':
                    System.out.println("Region of registration is :  Export");
                    break;


                default:
                    System.out.println("Region of registration is invalid with I and Q");
                    break;

            }

            System.out.println("year details "+ y);

            int cYear = Integer.parseInt(strYear);


            if(y==00){

                System.out.println("Registration year is invalid");
            }

            else if(y==32){
                System.out.println("Registration year is invalid");
            }

            else if(y==51){

                System.out.println("Registration year is between sep 22 and feb 22");

            }

            else {
                System.out.println("Registration year is:" +y );
            }








        }


    }
}
