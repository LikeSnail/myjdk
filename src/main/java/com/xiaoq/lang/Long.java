package com.xiaoq.lang;

/**
 * @program: myjdk
 * @description: 长整型数值包装对象
 * @author: snail
 * @create: 2020-09-29 11:46
 **/

public final class Long extends Number implements Comparable<Long> {

    /** 定义储存 long的变量*/
    private final long value;

    public Long(long value) { this.value = value; }



    @Override
    public int compareTo(Long other) {
        return 0;
    }

    @Override
    public int toInt() {
        return (int) value;
    }

    @Override
    public long toLong() {
        return (int) value;
    }

    @Override
    public float toFloat() {
        return (float) value;
    }

    @Override
    public double toDouble() {
        return (double) value;
    }

    @Override
    public short toShort() {
        return (short) value;
    }

    @Override
    public byte toByte() {
        return (byte) value;
    }
}
