package com.lvzhi.clone;

/**
 * Created by lvzhi on 2018/1/14
 */
public class Test {

    //浅克隆
    @org.junit.Test
    public void testShadowClone() throws Exception {
        Wife wife = new Wife();
        wife.setName("韩梅梅");
        wife.setAge(19);
        Husband husband = new Husband();
        husband.setName("李雷");
        husband.setAge(20);
        husband.setWife(wife);

        //克隆一个对象
        Husband husband1 = (Husband) husband.clone();

        System.out.println("husband,husband1是否为同一个对象：" + (husband == husband1));

        husband1.setAge(21);
        System.out.println(husband);
        System.out.println(husband1);
        System.out.println("以上结果看出，原对象的基本属性值age，并没有改变。");

        husband1.getWife().setAge(21);
        System.out.println(husband);
        System.out.println(husband1);
        System.out.println("以上结果可以看出，原对象和被克隆对象的对象属性都改动了,wife的年龄都是21了。");
        System.out.println("不能做错误的测试，譬如：直接又new了一个wife对象，然后,husband1.setWife(newWife),这样" +
                "husband中对象wife是不会改变的，想不明白的，再问我吧，呵呵");

    }

    //深克隆
    @org.junit.Test
    public void testDeepClone() throws Exception {
        Wife wife = new Wife();
        wife.setName("韩梅梅");
        wife.setAge(19);
        Husband husband = new Husband();
        husband.setName("李雷");
        husband.setAge(20);
        husband.setWife(wife);

        //克隆一个对象
        Husband husband1 = (Husband) husband.deepClone();

        System.out.println("husband,husband1是否为同一个对象：" + (husband == husband1));

        husband1.setAge(21);
        System.out.println(husband);
        System.out.println(husband1);
        System.out.println("以上结果看出，原对象的基本属性值age，并没有改变。");

        husband1.getWife().setAge(21);
        System.out.println(husband);
        System.out.println(husband1);
        System.out.println("以上结果可以看出，原对象什么都没变动");

    }

}
