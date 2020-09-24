package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class mystudentmanger {
        public StudentMangerTest() {
        }

        public static void main(String[] args) {
            ArrayList array = new ArrayList();

            while (true) {
                while (true) {
                    System.out.println("--------欢迎来到学生管理系统--------");
                    System.out.println("1 查看所有学生");
                    System.out.println("2 添加学生");
                    System.out.println("3 删除学生");
                    System.out.println("4 修改学生");
                    System.out.println("5 退出");
                    System.out.println("请输入你的选择：");
                    Scanner sc = new Scanner(System.in);
                    String choiceString = sc.nextLine();
                    switch (choiceString.hashCode()) {
                        case 49:
                            if (choiceString.equals("1")) {
                                findAllStudent(array);
                                continue;
                            }
                            break;
                        case 50:
                            if (choiceString.equals("2")) {
                                addStudent(array);
                                continue;
                            }
                            break;
                        case 51:
                            if (choiceString.equals("3")) {
                                deleteStudent(array);
                                continue;
                            }
                            break;
                        case 52:
                            if (choiceString.equals("4")) {
                                updateStudent(array);
                                continue;
                            }
                            break;
                        case 53:
                            if (!choiceString.equals("5")) {
                            }
                    }

                    System.out.println("谢谢你的使用");
                    System.exit(0);
                }
            }
        }

        public static void updateStudent(ArrayList<Student> array) {
            if(array.size()==0)
            {
                System.out.println("清闲添加数据");
            }
            else
            {
                Scanner sc=new Scanner(System.in);
                boolean flag=false;
                System.out.println("请输入你想要输入的学号");
                String  id=sc.nextLine();
                for(int x=0;x<array.size();x++)
                {
                    Student s=array.get(x);
                    if(s.getId().equals(id))
                    {
                        flag=true;
                        System.out.println("请输入学生的新id");
                        String s1=sc.nextLine();
                        System.out.println("姓名");
                        String s2=sc.nextLine();
                        System.out.println("年龄");
                        String s3=sc.nextLine();
                        System.out.println("居住地");
                        String  s4=sc.nextLine();
                        Student s5=new Student();
                        s5.setId(s1);
                        s5.setName(s2);
                        s5.setAge(s3);
                        s5.setAddress(s4);
                        array.set(x,s5);
                    }
                }
                if(flag)
                {
                    System.out.println("修改学生成功");
                }
                else
                {
                    System.out.println("你输入的学号有误，请检查");
                }
            }

        }

        public static void deleteStudent(ArrayList<Student> array) {
            if(array.size()==0)
            {
                System.out.println("请先添加数据");
                return;
            }
            else
            {
                System.out.println("请输入你想要删除的学号");
                Scanner sc=new Scanner(System.in);
                String  id=sc.nextLine();
                boolean flag=false;
                for(int i=0;i<array.size();i++)
                {
                    Student s=array.get(i);
                    if(s.getId().equals(id))
                    {
                        flag=true;
                        array.remove(i);
                        break;

                    }
                }
                if(flag)
                {
                    System.out.println("删除成功");
                }
                else
                {
                    System.out.println("您输入的学号有误");
                }
            }

        }

        public static void addStudent(ArrayList<Student> array) {

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入学号");
                String id = sc.nextLine();
                boolean flag = false;
                for (int x = 0; x < array.size(); x++) {
                    Student s = array.get(x);
                    if (s.getId().equals(id)) {
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    System.out.println("请输入学生姓名：");
                    String name = sc.nextLine();
                    System.out.println("请输入学生年龄：");
                    String age = sc.nextLine();
                    System.out.println("请输入学生居住地：");
                    String address = sc.nextLine();
                    Student s = new Student();
                    s.setId(id);
                    s.setName(name);
                    s.setAge(age);
                    s.setAddress(address);
                    array.add(s);
                    System.out.println("添加学生成功");
                    return;
                }

                System.out.println("你输入的学号已经被占用,请重新输入");
            }
        }


        public static void findAllStudent(ArrayList<Student> array) {
            if(array.size()==0)
            {
                System.out.println("没有数据请输入数据");
                return;
            }

            else
            {
                System.out.println("学号"+"    "+"姓名"+"    "+"年龄"+"    "+"地址");
                for(int i=0;i<array.size();i++)
                {
                    Student s=array.get(i);
                    System.out.println(s.getId()+"     "+s.getName()+"      "+s.getAge()+"      "+s.getAddress());
                }
            }
            System.out.println("学生信息已经全部输出");
        }
    }
