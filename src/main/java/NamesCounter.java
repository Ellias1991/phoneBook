import java.util.HashMap;
public class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        // Введите свое решение ниже
        String value = "";
        value= value + name;
        String item[] = value.split(" ");
        for(String t : item){
            if(names.containsKey(t)){
                names.put(t, names.get(t)+1);
            }else{
                names.put(t,1);
            }

        }

    }


    public void showNamesOccurrences() {

        System.out.println(names);


    }
}


