package structures.Arrays.AddElementInArray03;

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

    // Error prone
    //7. 在index索引的位置插入一个新元素e add(int index, int e)
    public void add(int index, int e){
        if (size == data.length){
            throw new IllegalArgumentException("Add failed. Array is full.");
        }

        if (index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }

        for (int i = size - 1;i >= index; i--){
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;

    }

    //8. 在所有元素前添加一个新元素 addFirst(int e)
    public void addFirst(int e){
        add(0, e);
    }

    //9. 向所有元素后添加一个新元素 addLast(size, e)
    public void addLast(int e){
        add(size, e);
    }

    //10. 获取index所在的元素并反悔
    public int get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("传入参数错误");
        }

        return data[index];
    }

}
