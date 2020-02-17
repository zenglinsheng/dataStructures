package structures.Arrays.AddElementInArray03;

public class Main {

    public static void main(String[] args){
        Array array = new Array();
        for (int i = 0;i < array.getCapacity() - 2;i++){
            array.add(i, i + 1);
        }

        System.out.println("初始化数组capacity: " + array.getCapacity());
        System.out.println("初始化数组size: " + array.getSize());

        System.out.print("初始化数组为：");
        for (int i = 0;i < array.getSize();i++) {
            System.out.print(array.get(i)+" ");
        }
        System.out.println();

        System.out.println("数组是否为空：" + array.isEmpty());

        array.addFirst(100);
        array.addLast(110);
        System.out.print("头尾插入元素后：");
        for (int i = 0;i < array.getSize();i++) {
            System.out.print(array.get(i)+" ");
        }

    }


}
