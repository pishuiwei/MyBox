package com.pw.box;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Box {

    /**
     * 窗口宽
     */
    private int boxWidth;

    /**
     * 窗口高
     */
    private int boxHeight;

    public Box() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        this.boxWidth = (int)(width - width/2.5);
        this.boxHeight = (int)(height - height/4);
    }

    /**
     * 初始化盒子
     * @throws IOException
     */
    public  void initBox() throws IOException {
        JFrame jf = new JFrame("MyBox");
        jf.setSize(boxWidth, boxHeight);
        jf.setLocationRelativeTo(null);

        // 设置菜单栏
        Menu menu = new Menu();
        jf.setJMenuBar(menu);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        File file = new File(Box.class.getResource("/").getPath() + "/img/box.jpg");
        jf.setIconImage(ImageIO.read(file));

        JPanel jp=new JPanel();    //创建一个JPanel对象

        JLabel jl=new JLabel("Hello World!");    //创建一个标签

        jp.add(jl);    //将标签添加到面板
        jf.add(jp);    //将面板添加到窗口

        jf.setVisible(true);    //设置窗口可见

    }



}
