package com.example.demo;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * @author renjing
 * @Description:
 * @date 2020/2/25下午3:32
 */
public class CreateXmlForDom4j {
    public static void main(String[] args) {
        Document document = DocumentHelper.createDocument();// 建立document对象，用来操作xml文件

        Element businessElement = document.addElement("business");// 建立根节点

        businessElement.addAttribute("id", "zzsfp");// 添加属性内容
        businessElement.addAttribute("comment", "业务系统单据编号");// 添加属性内容：业务系统单据编号

        Element bodyElement = businessElement.addElement("body");// 添加一个body节点
        bodyElement.addAttribute("yylxdm", "1");// 添加属性内容

        Element inputElement = bodyElement.addElement("input");// 添加一个input节点

        Element kpxxElement = inputElement.addElement("kpxx");// 添加一个kpxx节点

        Element gfmcElement = kpxxElement.addElement("gfmc");// 添加一个gfmc文本节点
        gfmcElement.setText("购方名称");// 添加文本内容
        Element shElement = kpxxElement.addElement("sh");
        shElement.setText("税号");
        Element yhzhElement = kpxxElement.addElement("yhzh");
        yhzhElement.setText("银行账号");
        Element dzdhElement = kpxxElement.addElement("dzdh");
        dzdhElement.setText("地址电话");
        Element emailElement = kpxxElement.addElement("email");
        emailElement.setText("邮箱");
        Element fpzlElement = kpxxElement.addElement("fpzl");
        fpzlElement.setText("t");//发票种类s专票 c普票 t 电子发票
        Element bzElement = kpxxElement.addElement("bz");
        bzElement.setText("备注");

        Element fpmxElement = inputElement.addElement("fpmx");
        fpmxElement.addAttribute("count", "1");

        Element groupElement = fpmxElement.addElement("group");
        groupElement.addAttribute("xh", "1");

        Element spmcElement = groupElement.addElement("spmc");
        spmcElement.setText("商品名称");
        Element ggxhElement = groupElement.addElement("ggxh");
        ggxhElement.setText("规格型号");
        Element jldwElement = groupElement.addElement("jldw");
        jldwElement.setText("单位");
        Element spslElement = groupElement.addElement("spsl");
        spslElement.setText("1商品数量");
        Element spdjElement = groupElement.addElement("spdj");
        spdjElement.setText("10.00单价");
        Element jeElement = groupElement.addElement("je");
        jeElement.setText("10.00金额");
        Element slvElement = groupElement.addElement("slv");
        slvElement.setText("0.06税率");
        Element seElement = groupElement.addElement("se");
        seElement.setText("0.60税额");
        Element hsbzElement = groupElement.addElement("hsbz");
        hsbzElement.setText("0含税标志 0-否 1是");
        Element spbmElement = groupElement.addElement("spbm");
        spbmElement.setText("商品税收编码19位(必填)");
        Element syyhzcbzElement = groupElement.addElement("syyhzcbz");
        syyhzcbzElement.setText("0优惠政策标志(0否1是)");
        Element yhzcsmElement = groupElement.addElement("yhzcsm");
        yhzcsmElement.setText("优惠政策内容");
        Element cezsjeElement = groupElement.addElement("cezsje");
        cezsjeElement.setText("0");
        Element lslbzElement = groupElement.addElement("lslbz");
        lslbzElement.setText("0零税率标志(0否，1是)");
        Element fphxzElement = groupElement.addElement("fphxz");
        fphxzElement.setText("0发票行性质2被折扣行，1折扣行，0正常(无折扣)");
        String xml = document.asXML();

        System.out.println(xml.substring(xml.lastIndexOf("\n") + 1));
    }
}