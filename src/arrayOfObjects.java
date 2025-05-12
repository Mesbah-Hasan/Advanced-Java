class A {
    String name;
    int roll;
    int marks;

    A(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
}
 class B {
    String name;
    int roll;
    int marks;
 }
public class arrayOfObjects {
    public static void main(String[] args) {
        B[] obj4 = new B[5];
        for (int i = 0; i < 5; i++) {
            obj4[i] = new B();
            obj4[i].marks = i;
            obj4[i].roll = i;
            obj4[i].name = "Hasan sdsd " + i;
        }
        for (B obj : obj4) {
            System.out.println(obj.name + " " + obj.roll + " " + obj.marks);
        }
        A[] obj = new A[5];
        for (int i = 0; i < 5; i++) {
            obj[i] = new A("Measdasbah " + i, i, i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(obj[i].name + " " + obj[i].roll + " " + obj[i].marks);
        }
        A[] obj1 = new A[5];
        for (int i = 0; i < 5; i++) {
            obj1[i] = new A("adas " + i, i, i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(obj1[i].name + " " + obj1[i].roll + " " + obj1[i].marks);
        }
        A[] obj2 = new A[5];
        for (int i = 0; i < 5; i++) {
            obj2[i]= new A("Hasan " + i, i, i+1);
            System.out.println(obj2[i].name + " " + obj2[i].roll + " " + obj2[i].marks);
        }
    }
}
