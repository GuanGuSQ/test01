package demo02;
/*
对于基本类型中的boolean值，Getter方法一定要写成 isXXX 的形式
而 setXXX 规则不变。
 */
public class Student {
    private String name;
    private int age;
    private boolean male;//是不是爷们儿
    public boolean isMale() {//注意这里是 isMale！！
        return male;
    }
    public void setMale(boolean male) {
        this.male = male;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
