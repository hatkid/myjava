package com.lvzhi.collection;

import org.junit.Test;

import java.util.HashMap;


/**
 * Created by lvzhi on 2017/12/3
 */
public class MapTest {

    /**
     * 测试map的容量问题
     */
    @Test
    public void testMapSize() {
        HashMap<Object, Object> map = new HashMap<>(16,1);
        for (int i = 0; i < 13; i ++) {
            map.put(i, i);
        }
        System.out.println(map.size());



    }


}
