package com.basic.annotations;

public class Test4 {

}

class TestA
{
    public void test()
    {

    }

    public static void main(String[] args) {
        TestB  b  = new TestB();
    }
}
class TestB extends TestA
{
    @Deprecated
    @Override
    public void test()
    {

    }
}