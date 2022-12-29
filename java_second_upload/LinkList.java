import java.util.LinkedList;
class Student{
    private String name;
    private int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public String toString() {
        return "学生姓名"+this.name+", 学生分数："+this.score;
    }
}
public class LinkList {
    public static void main(String[] args){
        LinkedList<Student> stu = new LinkedList<>();

        Student s1 = new Student("刘德华",90);
        Student s2 = new Student("张学友",80);
        Student s3 = new Student("刘杰",65);
        Student s4 = new Student("章子怡",100);
        Student s5 = new Student("周迅",60);
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        stu.add(s5);
        System.out.println("一共有："+stu.size()+"个学生");
        for(Student s:stu){
            System.out.println(s);
        }
        System.out.println("删除姓名为刘杰的信息，并再次输出现有学生信息");
        stu.remove(s3);
        for(Student s:stu){
            System.out.println(s);
        }
        System.out.println("修改刘德华的成绩为：95");
        stu.set(0,new Student("刘德华",95));
        for(Student s:stu){
            System.out.println(s);
        }
        boolean result = false;
        for(int i=0;i<stu.size();i++){
            if(stu.get(i).getScore() < 60){
                System.out.println(stu.get(i).getName());
                result = true;
            }
        }
        if(!result){
            System.out.println("检索完毕，没有不及格的学生！");
        }
    }
}
