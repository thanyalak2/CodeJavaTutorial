public class testdowhile {
    public static void main(String[] args) {
        int i;
        for(i =1; i <= 10; i++){
            System.out.println("i in for : " +i);
            System.out.println();
        }
        int iWhile = 1;
        while(iWhile <= 10){
            System.out.println("iwhile in while : " +iWhile);
            iWhile++;  
        }
        int counter = 1;
        do{
            System.out.println("counter in dowhile : " +counter);
            counter++;
        }while(counter <= 10);
    }
}
