package com.lvzhi.clone;

import java.io.*;

/**
 * Created by lvzhi on 2018/1/14
 */
public class Husband implements Cloneable, Serializable {
    private String name;
    private int age;
    private Wife wife;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Husband husband = null;
        try{
            husband = (Husband)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }finally{
            return husband;
        }
    }

    /**
     * 利用串行化深克隆一个对象，把对象以及它的引用读到流里，在写入其他的对象
     * 深克隆在clone方法中也可实现，只要是属性是对象的，都要单独调用clone方法，
     * 如果对象属性很多，显得很麻烦，所以一般都是用序列化方式来实现（不理解的
     * 可以单独交流）
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException,ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wife=" + wife +
                '}';
    }
}
