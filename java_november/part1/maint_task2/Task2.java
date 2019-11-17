package com.primisen.java_november.part1.maint_task2;

/*
В молодом возрасте дракон каждый год отращивает по три головы, но после того,
как ему исполнится 200 лет – только по две, а после 300 лет – лишь по одной.
Предполагается, что дракон появляется на свет сразу с тремя головами.
Разработайте программу, которая высчитывала бы, сколько голов и глаз у дракона, которому N лет?
 */
public class Task2 {
    public static void main(String[] args) {

        int dragonAge = 150;
        int eyesOnHead = 2;

        System.out.println("Dragon age: " + dragonAge);
        System.out.println("Number of heads: " + getNumberOfHeads(dragonAge));
        System.out.println("Number of eyes: " + getNumberOfEyes(getNumberOfHeads(dragonAge), eyesOnHead));
    }

    public static int getNumberOfHeads(int age) {

        int heads = 3;

        if (age > 300){
            heads += age - 300;
            age = 300;
        }
        if (age > 200) {
            heads += (age - 200) * 2;
            age = 200;
        }
        heads += age * 3;

        return heads;
    }

    public static int getNumberOfEyes(int heads, int eyesOnHead) {
        return heads * eyesOnHead;
    }
}
