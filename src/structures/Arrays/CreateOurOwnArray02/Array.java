package structures.Arrays.CreateOurOwnArray02;

public class Array {

    //1. 定义数组元素和数组大小size
    private int[] data;
    private int size;

    //2. 构造函数，传入数组的容量capacity构造Array()
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    //3. 无参数的构造函数，默认数组的容量capacity=10
    public Array(){
        this(10);
    }

    //4. 获取数组的容量 getCapacity
    public int getCapacity(){
        return data.length;
    }

    //5. 获取数组中的元素个数 getSize
    public int getSize(){
        return size;
    }

    //6. 返回数组是否为空 isEmpty
    public boolean isEmpty(){
        return data == null;
    }

}
