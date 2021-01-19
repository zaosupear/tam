package com.rango.tam.util;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;

import java.util.List;
import java.util.Map;

/**
 * @author rango
 * @description 字符串工具类
 * @date 2020/12/22 10:40
 */
public class StringUtils {
    //连接器
    private static final Joiner joiner = Joiner.on(",").skipNulls();
    //分割器
    private static final Splitter splitter = Splitter.on(",").trimResults().omitEmptyStrings();
    //匹配器
    private static final CharMatcher charMatcherDigit = CharMatcher.inRange('0', '9');
    private static final CharMatcher charMatcherAny = CharMatcher.any();




    public static void main(String[] args) {
        Map<String, String> colSortMaps = Maps.newHashMap();
        colSortMaps.put("N1", "N1");
        colSortMaps.put("A1", "A1");
//        String join = joiner.join(Lists.newArrayList("a", null, "b"));
//        System.out.println("join=" + join);
//        for (String tmp: splitter.split("a, , b, ,")){
//            System.out.println("[" + tmp + "]");
//        }
//        //只保留匹配的字符串，其他移除
//        System.out.println(charMatcherDigit.retainFrom("abc2def134f-"));
//        //移除匹配的字符串
//        System.out.println(charMatcherDigit.removeFrom("yes,i love u 1314"));
//
//        System.out.println(charMatcherAny.inRange('a','f').or(charMatcherAny.is('n')).replaceFrom("zhangfengzhe","*"));
//
//        //快速完成到集合的转换
//        List<Integer> list = Ints.asList(1, 3, 5, 7, 9);
//        System.out.println(Ints.join(",",1, 3, 1, 4));
//
//        //原生类型数组快速合并
//        int[] newIntArray = Ints.concat(new int[]{1, 2}, new int[]{2, 3, 4});
//        System.out.println(newIntArray.length);
//
//        //最大 最小
//        System.out.println(Ints.max(newIntArray) + "," + Ints.min(newIntArray));
//
//        //是否包含
//        System.out.println(Ints.contains(newIntArray,6 ));
//
//        //集合到数组的转换
//        int[] someArray = Ints.toArray(list);
//
//        Multiset<String> multiset = HashMultiset.create();
//        multiset.add("a");
//        multiset.add("a");
//        multiset.add("b");
//        multiset.add("c");
//        multiset.add("b");
//        System.out.println(multiset.size());
//        System.out.println(multiset.count("a"));
    }
}
