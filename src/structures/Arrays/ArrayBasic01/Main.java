package structures.Arrays.ArrayBasic01;

public class Main {

    public static void main(String[] args){

        //1. 创建int数组，使用for循环遍历赋值
        int[] data = new int[10];
        for (int i = 0;i < data.length;i++){
            data[i] = i + 1;
            System.out.println(data[i]);
        }

        System.out.println("=====================");

        //2. 创建int型的scores初始化赋值的数组，使用for循环遍历输出
        int[] scores = new int[]{98,99,100};
        System.out.println("for循环遍历scores");
        for (int i = 0;i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        //使用foreach遍历输出
        System.out.println("foreach遍历scores");
        for (int score:scores) {
            System.out.println(score);
        }

        //3. 为scores数组的第一个元素赋值后，循环遍历输出
        scores[0] = 110;
        System.out.println("重新赋值之后");
        for (int score:scores) {
            System.out.println(score);
        }



    }

}
