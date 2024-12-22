import java.util.ArrayList;

class main2{
    public static void main(String[] args){
        String b = "Java";
        ArrayList<String> languages = new ArrayList<>();

        languages.add("java");
        languages.add("Python");
        languages.add("JavaScript");

        System.out.println("ArrayList: \n");

        languages.forEach((e) -> {
            System.out.println(e);
        });
        languages.forEach((n) ->{
            if(n.equals(b))
            System.out.println("Java is Found");
        });

    }
}