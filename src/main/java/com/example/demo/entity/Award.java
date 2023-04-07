package com.example.demo.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author renjing
 * @Description: 配置概率抽奖
 * @date 2023/4/713:45
 */
@Data
public class Award {

    /**奖品ID**/
    private String awardId;

    /**奖品名**/
    private String awardTitle;

    /**中奖概率**/
    private double probability;

    public Award(String awardTitle,double probability){
        this.awardTitle = awardTitle;
        this.probability = probability;
    }

    /**
     * 抽奖，获取中奖奖品
     * @param awardList 奖品及中奖概率列表
     * @return 中奖商品
     */
    public static Award lottery(List<Award> awardList) throws Exception {
        if(awardList.isEmpty()){
            throw new Exception("奖品池为空");
        }
        //奖品总数
        int size = awardList.size();
        //计算总概率
        double sumProbability = 0d;
        for (Award award : awardList) {
            sumProbability += award.getProbability();
        }
        //计算每个奖品的概率区间
        //例如奖品A概率区间0-0.1 奖品B概率区间 0.1-0.2 奖品C概率区间0.2-1
        //每个奖品的中奖率越大，所占的概率区间就越大
        List sortAwardProbabilityList = new ArrayList(size);
        Double tempSumProbability = 0d;
        for (Award award : awardList) {
            tempSumProbability += award.getProbability();
            sortAwardProbabilityList.add(tempSumProbability / sumProbability);
        }
        //产生0-1之间的随机数
        //随机数在哪个概率区间内，则是哪个奖品
        double randomDouble = Math.random();
        //加入到概率区间中，排序后，返回的下标则是awardList中中奖的下标
        sortAwardProbabilityList.add(randomDouble);
        Collections.sort(sortAwardProbabilityList);
        int lotteryIndex = sortAwardProbabilityList.indexOf(randomDouble);
        return awardList.get(lotteryIndex);
    }

    public static void main(String[] args) throws Exception {
        List<Award> awardList = new ArrayList();
        awardList.add(new Award("20元话费",0.1d));
        awardList.add(new Award("京东100元购物卡",0.1d));
        awardList.add(new Award("未中奖",0.8d));

        Award award = lottery(awardList);
        System.out.println("抽到的奖品是：" + award.getAwardTitle());
    }
}