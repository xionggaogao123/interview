package com.keven.interview.list;


import org.assertj.core.util.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListPaging {


    /**
     * 对一个List  数据 进行 分页 线上
     */
    public static void listPaging(Integer pageNo, Integer pageSize) {
        List<Integer> list = Lists.newArrayList();
        for (int i =1; i<= 192 ; i++) {
            list.add(i);
        }

        int totalCount = list.size();

        int pageNum = getTotalPage(totalCount, pageSize);

        int m = totalCount % pageSize;
        List<Integer> subList;
        if (m == 0) {
             subList = list.subList((pageNo -1) * pageSize, pageSize * pageNo);
             System.out.println(subList);
        }else {
            if (pageNo == pageNum){
                subList= list.subList((pageNo - 1) * pageSize, totalCount);
                System.out.println(subList);
            }else {
                 subList= list.subList((pageNo - 1) * pageSize, pageSize*(pageNo));
                System.out.println(subList);
            }
        }
    }

    public static int getTotalPage(Integer totalCount, Integer pageSize) {
        if (totalCount % pageSize > 0) {
            return totalCount / pageSize + 1;
        } else {
            return totalCount / pageSize;
        }
    }

    public static void main(String[] args) {
        listPaging(10, 20);
    }

}
