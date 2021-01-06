package strategy;

import java.util.Arrays;

/**
 * 同一种行为的不同表现形式  可以使用策略模式
 * 1、如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。
 * 2、一个系统需要动态地在几种算法中选择一种。
 * 3、如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。
 * 可以避免大量的if  else
 */
public class main {

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 2, 9};
        sort sort = new sort();
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));

        cat cat = new cat(10, 20);
        cat cat1 = new cat(20, 10);
        int i = cat.compareTo(cat1);

    }
}
