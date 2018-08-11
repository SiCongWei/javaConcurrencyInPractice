package cw.study.concurrency.chapter3;

/**
 * mutableInteger 不是线程安全的，因为get和set都是在没有同步的情况下访问value的
 */
public class MutableInteger {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }



}
