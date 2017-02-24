package com.bestlinmufeng.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class NSUI extends JFrame {

    public static void main(String[] args) {
        NSUI nsui = new NSUI();
    }

    private static int X1_Y = 100;
    private static int X2_Y = 1700;
    private static int X3_Y = 1900;
    private static int X4_Y = 2100;

    private static int X_Y1 = 100;
    private static int X_Y2 = 150;
    private static int X_Y3 = 250 + 100;
    private static int X_Y4 = 350 + 100;
    private static int X_Y5 = 450 + 100;
    private static int X_Y6 = 550 + 100;
    private static int X_Y7 = 700 + 100;

    private static int LEN_LBL_TXT_WIG = 200;
    private static int LEN_LBL_TXT_HIG = 50;
    private static int LEN_ICO_WIG_HIG = 50;

    private JPanel panelNU; // 底层面板
    private JPanel panelNU2; // 上层面板

    private JLabel lblImgMap; // 地图
    private Vehicle lblImgVehicle; // 车图标
    private Base lblImgBase; // 基站图标

    private JLabel lblTxtVehicle; // 车
    private JLabel lblTxtVNumb; // 车数目
    private JLabel lblTxtVPriority; // 宽
    private JLabel lblTxtVRandom; // 是否随机
    private JLabel lblTxtBase; // 基站

    private JComboBox cboxVNum; // 车数目选项
    private JComboBox cboxVPriority; // 车优先级
    private JComboBox cboxVRandom; // 车优先级

    private JButton btnMap; // 车辆生成按钮

    public NSUI() {
        panelNU = new JPanel();
        panelNU2 = new JPanel();

        lblImgMap = new JLabel();
        lblImgVehicle = new Vehicle();
        lblImgBase = new Base();

        lblTxtVehicle = new JLabel();
        lblTxtVNumb = new JLabel();
        lblTxtVPriority = new JLabel();
        lblTxtVRandom = new JLabel();
        lblTxtBase = new JLabel();

        cboxVNum = new JComboBox();
        cboxVPriority = new JComboBox();
        cboxVRandom = new JComboBox();

        btnMap = new JButton();

        initNU();
    }

    private void initNU() {
        Container container = this.getContentPane();

        panelNU.setBounds(0, 0, 2400, 1500);
        this.panelNU.setLayout(null);
        panelNU.setBackground(Color.WHITE);
        
        panelNU2.setBounds(0, 0, 2100, 1000);
        panelNU2.setBackground(null);
        panelNU2.setOpaque(false);
        this.panelNU2.setLayout(null);


        // 控件内容
        lblImgMap.setIcon(new ImageIcon("images/map.png"));
        lblImgVehicle.setIcon(new ImageIcon("images/vehicle.png"));
        lblImgBase.setIcon(new ImageIcon("images/base.png"));

        lblTxtBase.setText("基　站：");
        lblTxtVehicle.setText("汽　车：");
        lblTxtVNumb.setText("数　目：");
        lblTxtVPriority.setText("优先级：");
        lblTxtVRandom.setText("随　机：");
        btnMap.setText("生成汽车");

        cboxVNum.addItem("5");
        cboxVNum.addItem("10");
        cboxVNum.addItem("15");
        cboxVNum.addItem("20");
        cboxVNum.addItem("25");

        cboxVPriority.addItem("1");
        cboxVPriority.addItem("2");
        cboxVPriority.addItem("3");
        cboxVPriority.addItem("4");
        cboxVPriority.addItem("5");

        cboxVRandom.addItem("是");
        cboxVRandom.addItem("否");

        // 设置控件大小
        lblImgMap.setBounds(X1_Y, X_Y1, 1500, 1000);
        lblImgBase.setBounds(X3_Y, X_Y2, LEN_ICO_WIG_HIG, LEN_ICO_WIG_HIG);
        lblImgVehicle.setBounds(X3_Y, X_Y3, LEN_ICO_WIG_HIG, LEN_ICO_WIG_HIG);

        lblTxtBase.setBounds(X2_Y, X_Y2, LEN_LBL_TXT_WIG, LEN_LBL_TXT_HIG);
        lblTxtVehicle.setBounds(X2_Y, X_Y3, LEN_LBL_TXT_WIG, LEN_LBL_TXT_HIG);
        lblTxtVNumb.setBounds(X3_Y, X_Y4, LEN_LBL_TXT_WIG, LEN_LBL_TXT_HIG);
        lblTxtVPriority.setBounds(X3_Y, X_Y5, LEN_LBL_TXT_WIG, LEN_LBL_TXT_HIG);
        lblTxtVRandom.setBounds(X3_Y, X_Y6, LEN_LBL_TXT_WIG, LEN_LBL_TXT_HIG);

        cboxVNum.setBounds(X4_Y, X_Y4, 200, 50);
        cboxVPriority.setBounds(X4_Y, X_Y5, 200, 50);
        cboxVRandom.setBounds(X4_Y, X_Y6, 200, 50);

        btnMap.setBounds(X4_Y, X_Y7, 200, 100);

        lblTxtBase.setFont(new Font("微软雅黑", Font.PLAIN, 40));
        lblTxtVehicle.setFont(new Font("微软雅黑", Font.PLAIN, 40));
        lblTxtVNumb.setFont(new Font("微软雅黑", Font.PLAIN, 40));
        lblTxtVPriority.setFont(new Font("微软雅黑", Font.PLAIN, 40));
        lblTxtVRandom.setFont(new Font("微软雅黑", Font.PLAIN, 40));
        btnMap.setFont(new Font("微软雅黑", Font.PLAIN, 40));

        cboxVNum.setFont(new Font("微软雅黑", Font.PLAIN, 40));
        cboxVPriority.setFont(new Font("微软雅黑", Font.PLAIN, 40));
        cboxVRandom.setFont(new Font("微软雅黑", Font.PLAIN, 40));

        // 控件加载到面板
        this.panelNU.add(lblImgMap);

        this.panelNU.add(lblTxtBase);
        this.panelNU.add(lblTxtVehicle);
        this.panelNU.add(lblTxtVNumb);
        this.panelNU.add(lblTxtVPriority);
        this.panelNU.add(lblTxtVPriority);
        this.panelNU.add(lblTxtVRandom);

        this.panelNU.add(cboxVNum);
        this.panelNU.add(cboxVPriority);
        this.panelNU.add(cboxVRandom);

        this.panelNU.add(btnMap);

        this.panelNU2.add(lblImgBase);
        this.panelNU2.add(lblImgVehicle);
        
        container.add(panelNU2);
        container.add(panelNU);

        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置关闭框架的同时结束程序
        this.setSize(2400, 1500);
        this.setLocation(500, 500);
        this.setResizable(false);// 设置框架不可以改变大小
        this.setTitle("2D|3D网络仿真软件");
        this.setVisible(true);
        // Base test = new Base();
        // test.setIcon(new ImageIcon("images/base.png"));
        // test.setBounds(1900, 755, 50, 50);
        // this.panelNU.add(test);

        // JMenuBar menuBar = new JMenuBar();
        // setJMenuBar(menuBar);
        // JMenu menuFile = new JMenu("File");
        // //JMenuItem openItem = new JMenuItem("open");
        // //JMenuItem exitItem = new JMenuItem("exit");
        // JMenu menuEdit = new JMenu("File");
        // JMenu menuHelp = new JMenu("Help");
        //
        // //menu.add(exitItem);
        // menuBar.add(menuFile);
        // menuBar.add(menuEdit);
        // menuBar.add(menuHelp);
        
        // labelImgMap.setIcon(new ImageIcon(""));
        //// labelImgMap.setIcon(null);
        // labelTextCenter.setText("中心点坐标：");
        //// labelTextCenter.setFont();
        // labelTextLength.setText("长：");
        // labelTextWeight.setText("宽：");
        // btnMap.setText("生成地图");

        // //设置控件
        // this.labelImgMap.setBounds(30, 30, 1000, 700);
        // this.labelTextCenter.setBounds(1000, 100, 100, 100);
        // this.labelTextCenter.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        // this.labelTextLength.setBounds(1000, 120, 100, 100);
        // this.labelTextWeight.setBounds(1000, 120, 100, 100);

    }

}
