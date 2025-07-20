public class Armstrong {
    public static void main(String[] args) {
        int number =153;
        int additionnum=0;
        int temp=number;
        if(number<0){
            System.out.println("Not Armstrong");
        } else {
            while(temp>0){
                int lastdigit = temp % 10;
                int cube = lastdigit * lastdigit * lastdigit;
                additionnum = additionnum + cube;
                temp = temp / 10;
            }
            if(additionnum == number){
                System.out.println("Armstrong");
            } else {
                System.out.println("Not Armstrong");
            }
    }
}
}
