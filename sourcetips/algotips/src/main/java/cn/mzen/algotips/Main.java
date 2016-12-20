package cn.mzen.algotips;

import cn.mzen.algotips.leetcode.LeetCode;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by itrek on 11/18/16.
 */
public class Main {
    public static void main(String[] args) {
        LeetCode leetCode = new LeetCode();
        try {
            leetCode.callAlgorithm(args);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Could not find the calss");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            System.out.println("Could not call the function");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("Could not access the object");
        }
    }
}
