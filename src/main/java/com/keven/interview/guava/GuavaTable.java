package com.keven.interview.guava;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.Collection;
import java.util.Set;

/**
 * @author keven
 * @date 2018-05-24 下午4:29
 * @Description
 *
 * guava 中 提供了 table 的 概念。 类似2个key, 1 个 value
 *  第一个key 为： rowKey
 *  第二个key 为： columnKey
 *  第三个key 为： value
 *
 *
 * 所有行 数据： callSet()
 * 所有的第一个key 值:  rowKeySet()
 * 所有课程： columnKeySet
 * 所有成绩：values()
 * 课程成绩表：rowMap()  + get(stu)/ row(stu)
 * 学生成绩表 ： columnMap() + get(course) / column (course)
 *
 *
 */

public class GuavaTable {

    public static void main(String[] args) {

        Table<String, String, Integer> table = HashBasedTable.create();
        table.put("a", "javase", 80);
        table.put("b", "javaee", 90);
        table.put("c", "javame", 100);
        table.put("d", "guava", 70);

        // 得到所有行 数据 tables.callSet()
        Set<Table.Cell<String, String, Integer>> cellSet = table.cellSet();
        for (Table.Cell<String, String, Integer> temp: cellSet) {
            System.out.println(temp.getRowKey() + " " + temp.getColumnKey() + " " + temp.getValue());
        }


        //得到所有学生 rowKeySet()
        Set<String> students = table.rowKeySet();
        for (String str : students) {
            System.out.println(str + "\t");
        }

        //获取所有的课程 columnKeySet()
        Set<String> courses = table.columnKeySet();
        for (String str: courses) {
            System.out.println(str + "\t");
        }

        // 得到所有成绩：values
        Collection<Integer> scores = table.values();
        for (Integer score: scores) {
            System.out.println(score + "\t");
        }


        Integer course = table.get("a", "javase");
        System.out.println("根据 rowKey and columnKey 获取的 value = " +course);

    }

}
