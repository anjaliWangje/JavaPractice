package inheritance;


class parent1{

    int age=100;
     String name = "java program";

 void methodofparent1(){

     System.out.println("this method belongs to class parent");
 }
  void show(){

     System.out.println("this method  is test");
  }

}


public class inheritanceintro extends parent1{

    public static void main(String[]arge){

        inheritanceintro obj=new inheritanceintro();
        obj.show();
        obj.methodofparent1();

        System.out.println("Accesing variable of parent class:" +obj.age );
        System.out.println("this method belong to class parent:"+obj.name);





    }
}


