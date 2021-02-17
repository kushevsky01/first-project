public class Main {

    public static void main(String[] args) {
        int [] a = new int[10];
        int tmp;
        for(int i = 0; i < a.length; i++)
            a[i] = (int)(Math.random()*100);
        System.out.println("Сгенерированный массив");
        for(int i = 0; i < a.length; i++)
            System.out.println("a["+i+"]"+ a[i]);
        for(int i = 0; i < a.length; i++)
            for(int j = i+1; j < a.length; j++)
                if (a[i]>a[j]){
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
        System.out.println("Отсортированный  массив");
        for(int i = 0; i < a.length; i++)
            System.out.println("a["+i+"]"+ a[i]);
    }
}