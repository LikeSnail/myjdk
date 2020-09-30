package com.xiaoq.lang;

/**
 * @program: myjdk
 * @description: 数值类型抽象基类
 * @author: snail
 * @create: 2020-09-29 11:40
 **/

public abstract class Number implements java.io.Serializable {

    /**
     * 数值之间可以相互转换
     * @return
     */
    public abstract int toInt();
    public abstract long toLong();
    public abstract float toFloat();
    public abstract double toDouble();
    public byte toByte() {
        return (byte) toInt();
    };
    public short toShort() {
        return (short) toInt();
    };
}
