public class whyClass {
    public static void main(String[] args) {
        student kshitiz=new student();
        kshitiz.r=1;
        kshitiz.p=99;
        student randomStudent= new student();
        randomStudent.r=2;
        randomStudent.p=98;
        kshitiz.display();
        randomStudent.display();
    }
}
class student{
    int r;
    float p;
    void display(){
        System.out.println("Roll No "+r+" Percentage "+p);
    }
}