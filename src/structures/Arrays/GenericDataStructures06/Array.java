package structures.Arrays.GenericDataStructures06;

//范型数组
public class Array<E> {

    //1. 定义数组元素和数组大小size
    private E[] data;
    private int size;

    //2. 构造函数，传入数组的容量capacity构造Array()
    public Array(int capacity){
        data = (E[])new Object[capacity];
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
    public void add(int index, E e){
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
    public void addFirst(E e){
        add(0, e);
    }

    //9. 向所有元素后添加一个新元素 addLast(size, e)
    public void addLast(E e){
        add(size, e);
    }

    //10. 获取index索引位置的元素 get(int index)
    public E get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("传入参数错误");
        }

        return data[index];
    }

    //11. 修改index索引位置的元素为e set(int index, int e)
    public void set(int index, E e){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Add failed. Index is illegal.");
        }

        data[index] = e;
    }


    //12. toString()
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

    //13. 查找数组中是否有元素e contains(int e)
    public boolean contains(E e){
        for (int i = 0;i < size;i++){
            if (data[i] == e){
                return true;
            }
        }
        return false;
    }

    //14. 查找数组中元素e所在的索引，如果不存在元素e，则返回-1 find(int e)
    public int find(E e){
        for (int i = 0;i < size;i++){
            if (data[i] == e){
                return i;
            }
        }
        return -1;
    }

    //15. 从数组中删除index位置的元素, 返回删除的元素 remove(int index)
    public E remove(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Add failed. Index is illegal.");
        }

        E ret = data[index];
        for (int i = index;i < size - 1; i++){
            data[i] = data[i+1];
        }

        size--;
        return ret;
    }

    //16. 从数组中删除第一个元素, 返回删除的元素 removeFirst()
    public E removeFirst(){
        return remove(0);
    }

    //17. 从数组中删除最后一个元素, 返回删除的元素 removeLast()
    public E removeLast(){
        return remove(size - 1);
    }

    //18. 从数组中删除元素e removeElement(int e)
    public int removeElement(E e){
        int index = find(e);
        remove(index);
        return index;
    }

}
