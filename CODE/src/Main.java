import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Person> person = new ArrayList<>();
        String name;
        String sex;
        float attack_power;
        boolean boo1 = true;
        while (boo1) {
            System.out.println("\n***遊戲角色管理系統***\n=============================");
            System.out.println("1.新增角色");
            System.out.println("2.角色查詢");
            System.out.println("3.角色修改");
            System.out.println("4.刪除角色");
            System.out.println("角色總數");
            System.out.println("結束");
            int function = scn.nextInt();
            switch (function) {
                case 1:
                    System.out.print("角色名稱:\t");
                    name = scn.next();
                    System.out.print("性別:\t");
                    sex = scn.next();
                    System.out.print("攻擊力\t");
                    attack_power = scn.nextFloat();

                    Person person1 = new Person(name, sex, attack_power);
                    person.add(person1);
                    break;
                case 2:
                    System.out.println("1.以角色名稱查詢");
                    System.out.println("2.以性別查詢");
                    System.out.println("3.以攻擊力稱查詢");
                    System.out.println("輸入其他鍵返回");
                    int function1 = scn.nextInt();
                    boolean have = false;
                    switch (function) {
                        case 2:
                            System.out.print("請輸入性別:\t");
                            sex = scn.next();
                            for (int i = 0; i < person.size(); i++) {
                                String x = person.get(i).getSex();
                                if (x.equals(sex)) {
                                    have = true;
                                    System.out.println("角色名稱:" + person.get(i).getName());
                                    System.out.println("性別:" + person.get(i).getSex());
                                    System.out.println("攻擊力:" + person.get(i).getAttackPower());
                                }
                            }
                            if (!have) {
                                System.out.println("找不到相關角色");
                            }
                            break;
                        case 3:
                            System.out.print("請輸入攻擊力:\t");
                            attack_power = scn.nextFloat();
                            for (int i = 0; i < person.size(); i++) {
                                float x = person.get(i).getAttackPower();
                                if (x == attack_power) {
                                    have = true;
                                    System.out.println("角色" + person.get(i).getName());
                                    System.out.println("性別" + person.get(i).getSex());
                                    System.out.println("攻擊力" + person.get(i).getAttackPower());
                                }
                            }
                            if (!have) {
                                System.out.println("找不到相關角色");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 3://修改角色
                    System.out.println("要修改哪一位角色");
                    String x = scn.next();
                    int index = 0;
                    for (int i = 0; i < person.size(); i++) {
                        if (person.get(i).name.equals(x)) {
                            index = i;
                            break;
                        }
                    }
                    System.out.println("1.修改角色名稱");
                    System.out.println("2.修改性別");
                    System.out.println("3.修改攻擊力");
                    System.out.println("輸入其他鍵返回");
                    switch (scn.nextInt()) {
                        case 1:
                            System.out.println("請輸入新角色名稱:\t");
                            name = scn.next();
                            person.get(index).setName(name);
                            break;
                        case 2:
                            System.out.println("請輸入新的性別\t");
                            sex = scn.next();
                            person.get(index).setSex(sex);
                            break;
                        case 3:
                            System.out.println("請輸入新的攻擊力\t");
                            attack_power = scn.nextFloat();
                            person.get(index).setAttackPower(attack_power);
                        default:
                            break;
                    }
                    break;

                case 4://刪除角色
                    System.out.println("要刪除哪位角色");
                    String y = scn.next();

                    for (int i = 0; i < person.size(); i++) {
                        if (person.get(i).name.equals(y)) {
                            System.out.println("已刪除" + person.get(i).name);
                            person.remove(person.get(i));
                            break;
                        }
                    }
                    break;


                case 5://刪除角色
                    System.out.println("系統現在有" + person.size() + "個角色");
                    break;

                case 6://結束
                    System.out.println("Bye");
                    System.exit(0);
                    break;
                default:
                    boo1 = false;
                    break;
            }
        }
    }
}
