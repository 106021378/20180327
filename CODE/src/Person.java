public class Person {
    String name;
    String sex;
    float attack_power;

    Person(String name,String sex,float attack_power){
        setName(name);
        setSex(sex);
        setAttackPower(attack_power);
    }

    public float getAttackPower(){
        return attack_power;
    }

    public void setAttackPower(float attack_power){
        if (attack_power<0){
            System.out.println("攻擊力不能為負值\t自動設定攻擊力為10");
            this.attack_power = 10;
        }else{
            this.attack_power = attack_power;
        }
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
