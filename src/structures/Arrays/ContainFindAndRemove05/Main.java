package structures.Arrays.ContainFindAndRemove05;

public class Main {

    public static void main(String[] args){

        Array array = new Array();
        for (int i = 0;i < array.getCapacity() - 3;i++){
            array.add(i, i + 1);
        }
        System.out.print("初始化数组为：");
        for (int i = 0;i < array.getSize();i++) {
            System.out.print(array.get(i)+" ");
        }
        System.out.println();

        System.out.println("1的索引为： " + array.find(1));
        System.out.println("3的索引为： " + array.find(3));
        System.out.println("7的索引为： " + array.find(7));

        System.out.println("======移除元素=========");
        array.remove(1);
        array.removeFirst();
        array.removeLast();
        System.out.print("移除元素后数组为：");
        for (int i = 0;i < array.getSize();i++) {
            System.out.print(array.get(i)+" ");
        }
        System.out.println();



    }

}
