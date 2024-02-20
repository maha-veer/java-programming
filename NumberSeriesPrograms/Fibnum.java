class Fibnum{
    public static void main(String s[]){
        int firstNumber = 0;
        int secondNumber =1;
        int secondLastNumber=0;
        int LastNumber=1;
        System.out.println("First 10 Fib number");

        for(int i=0; i<10;i++){
            if(i==0){
                System.out.print(i + " ");
            }else if(i==1){
                System.out.print(i + " ");
            }else{
                int currentNumber =secondLastNumber+LastNumber;
                System.out.print(currentNumber + " ");
                secondLastNumber=LastNumber;
                LastNumber= currentNumber;
            }
        }
    }
}