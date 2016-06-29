package com.ccf.client;

import com.ccf.idcard.domain.Idcard;
import com.ccf.mypackage.CardImgrecon;
import com.google.gson.Gson;
import com.wintone.Adaptor.CipherAdaptor;
import org.dom4j.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dell on 2016/6/27.
 */
public class ClientSPlain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:beans.xml"});

        CardImgrecon cardImgreconAll = (CardImgrecon) context.getBean("client");
//		DataPackage data = new DataPackage();
        System.out.println("-----------------------------------证件识别-----------------------------------" + "\n");
        String result = "";
        //		String input = "/home/wintone/kuaizhengtong/erdai.jpg";
        String input = "D:/3.jpg";
        //		Date beginDate = new Date();
        CipherAdaptor clientAdaptor = new CipherAdaptor();//详细说明见单用户证件识别服务系统客户端开发手册.doc文档中2.1.1 PC客户端识别服务接口
        //clientAdaptor.setRecgnPlainParam("图片路径", "证件类型","默认为空", 默认为空)
        String strsrc = clientAdaptor.setRecgnPlainParam(input, "3", "", null);
        // doAllCardRecon("用户名"，图片加密，默认为null，图片类型)
        result = cardImgreconAll.doAllCardRecon("test", strsrc, null, "jpg");
        //		Date DateEnd = new Date();
//		String date = String.valueOf(DateEnd.getTime()- DateBegin.getTime());
//		Integer time = Integer.parseInt(date);
//		System.out.println("-------------本次服务耗时" + (time)+ "毫秒-------------");
        String[] encData = result.split("==@@");
        System.out.println(encData[0]);
        String name = null;
        String xb = null;
        String mz = null;
        String csrq = null;
        String zz = null;
        String sfzh = null;
        String tx = null;
        try {
            Document document = DocumentHelper.parseText(encData[0]);
            Element root = document.getRootElement();
            listNodes(root);
            List list = root.elements();
            list = root.selectNodes("//value");
            if (list.size() > 0) {
                if ("识别成功".equals(((Element) list.get(0)).getText())) {
                    list = root.selectNodes("//item");
                    if (list.size() > 0) {
                        Iterator iterator = list.iterator();
                        while (iterator.hasNext()) {
                            Element element = (Element) iterator.next();
                            if ("姓名".equals(element.attribute("desc").getText())) {
                                name = element.getText();
                            }
                            if ("性别".equals(element.attribute("desc").getText())) {
                                xb = element.getText();
                            }
                            if ("民族".equals(element.attribute("desc").getText())) {
                                mz = element.getText();
                            }
                            if ("出生".equals(element.attribute("desc").getText())) {
                                csrq = element.getText();
                            }
                            if ("住址".equals(element.attribute("desc").getText())) {
                                zz = element.getText();
                            }
                            if ("公民身份证号".equals(element.attribute("desc").getText())) {
                                sfzh = element.getText();
                            }
                            if ("头像".equals(element.attribute("desc").getText())) {
                                tx = element.getText();
                            }
                        }
                    } else {
                        return;
                    }
                    System.out.println(tx);
                    GenerateImage(tx);
                } else
                    return;
            } else {
                return;
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static void listNodes(Element node) {
        System.out.println("当前节点的名称：：" + node.getName());
        // 获取当前节点的所有属性节点
        List<Attribute> list = node.attributes();
        // 遍历属性节点
        for (Attribute attr : list) {
            System.out.println(attr.getText() + "-----" + attr.getName()
                    + "---" + attr.getValue());
        }

        if (!(node.getTextTrim().equals(""))) {
            System.out.println("文本内容：：：：" + node.getText());
        }

        // 当前节点下面子节点迭代器
        Iterator<Element> it = node.elementIterator();
        // 遍历
        while (it.hasNext()) {
            // 获取某个子节点对象
            Element e = it.next();
            // 对子节点进行遍历
            listNodes(e);
        }
    }

    public static boolean GenerateImage(String imgStr) {   //对字节数组字符串进行Base64解码并生成图片
        if (imgStr == null) //图像数据为空
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            //Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {//调整异常数据
                    b[i] += 256;
                }
            }
            //生成jpeg图片
            String imgFilePath = "d://222.jpg";//新生成的图片
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String  idcardRecon(String flag, String path){
        Idcard idcard = new Idcard();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:beans.xml"});

        CardImgrecon cardImgreconAll = (CardImgrecon) context.getBean("client");
//		DataPackage data = new DataPackage();
        //System.out.println("-----------------------------------证件识别-----------------------------------" + "\n");
        String result = "";
        String input = path;
        CipherAdaptor clientAdaptor = new CipherAdaptor();//详细说明见单用户证件识别服务系统客户端开发手册.doc文档中2.1.1 PC客户端识别服务接口
        String strsrc = clientAdaptor.setRecgnPlainParam(input,flag , "", null);
        // doAllCardRecon("用户名"，图片加密，默认为null，图片类型)
        result = cardImgreconAll.doAllCardRecon("test", strsrc, null, "jpg");
        //		Date DateEnd = new Date();
//		String date = String.valueOf(DateEnd.getTime()- DateBegin.getTime());
//		Integer time = Integer.parseInt(date);
//		System.out.println("-------------本次服务耗时" + (time)+ "毫秒-------------");
        String[] encData = result.split("==@@");
        System.out.println(encData[0]);
        try {
            Document document = DocumentHelper.parseText(encData[0]);
            Element root = document.getRootElement();
            listNodes(root);
            List list = root.elements();
            list = root.selectNodes("//value");
            if (list.size() > 0) {
                if ("识别成功".equals(((Element) list.get(0)).getText())) {
                    list = root.selectNodes("//item");
                    if (list.size() > 0) {
                        Iterator iterator = list.iterator();
                        while (iterator.hasNext()) {
                            Element element = (Element) iterator.next();
                            if ("姓名".equals(element.attribute("desc").getText())) {
                                idcard.setName(element.getText());
                            }
                            if ("性别".equals(element.attribute("desc").getText())) {
                                idcard.setXb(element.getText());
                            }
                            if ("民族".equals(element.attribute("desc").getText())) {
                                idcard.setMz(element.getText());
                            }
                            if ("出生".equals(element.attribute("desc").getText())) {
                                idcard.setCsrq(element.getText());
                            }
                            if ("住址".equals(element.attribute("desc").getText())) {
                               idcard.setZz(element.getText());
                            }
                            if ("公民身份证号".equals(element.attribute("desc").getText())) {
                                idcard.setIdnum(element.getText());
                            }
                            if ("头像".equals(element.attribute("desc").getText())) {
                                idcard.setImg(element.getText());
                            }
                            if ("签发机关".equals(element.attribute("desc").getText())) {
                                idcard.setQfjg(element.getText());
                            }
                            if ("有效期限".equals(element.attribute("desc").getText())) {
                                idcard.setYxqx(element.getText());
                            }
                            if ("签发日期".equals(element.attribute("desc").getText())) {
                                idcard.setQfrq(element.getText());
                            }
                        }
                    } else {
                        return "1003";//识别到的信息为空
                    }

                } else
                    return "1001";//识别失败
            } else {
                return "1002";//找不到value节点
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        //response.setCharacterEncoding("UTF-8");//解决了返回值乱码问题
        return gson.toJson(idcard);
    }

}
