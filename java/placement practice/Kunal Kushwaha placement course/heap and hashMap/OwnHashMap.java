import java.util.ArrayList;
import java.util.LinkedList;

public class OwnHashMap<K,V>{
    
    private class Entity{
        K key;
        V value;

        public Entity( K key, V value)
        {
            this.key=key;
            this.value=value;
        }


    }
    ArrayList<LinkedList<Entity>> list;
    OwnHashMap(){
        list=new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            list.add(new LinkedList<Entity>());
        }

    }

     public void put(K key, V value) {
    int hash = Math.abs(key.hashCode() % list.size());

    LinkedList<Entity> entities = list.get(hash);

    for (Entity entity : entities) {
      if(entity.key.equals(key)) {
        entity.value = value;
        return;
      }
    }

    
}