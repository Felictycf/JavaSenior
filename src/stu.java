import java.util.Scanner;

public class stu {
    public static int main(String[] args) {





        Scanner sc = new Scanner(System.in);
        int mouth =sc.nextInt();
        int year = sc.nextInt();
        int day = sc.nextInt();
        int sum =0;

        {

            if (mouth == 1) {
                System.out.println(day);
			return 0;
            }
            if (mouth == 2) {
                System.out.println(31 + day);
            }

        }
        switch (mouth) {
            //2月平年28天，闰年29天，之后判断是闰年之后加一天
            case 3:
                sum = 59;
                break;
            case 4:
                sum = 90;
                break;
            case 5:
                sum = 120;
                break;
            case 6:
                sum = 151;
                break;
            case 7:
                sum = 151;
                break;
            case 8:
                sum = 212;
                break;
            case 9:
                sum = 243;
                break;
            case 10:
                sum = 273;
                break;
            case 11:
                sum = 304;
                break;
            case 12:
                sum = 333;
                break;

            default:
                sum = 0;
                break;

        }
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {

            sum++;

        }
        System.out.println(day+sum);
        return 0;
       }
     }

