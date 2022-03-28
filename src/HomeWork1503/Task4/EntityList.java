package HomeWork1503.Task4;

import java.util.ArrayList;
import java.util.List;

public class EntityList {

    private List<Entity> list = new ArrayList<>();

    public List<Entity> getList() {
        return list;
    }

    public void setList(List<Entity> list) {
        this.list = list;
    }

    public void addIntity(Entity entity) {
        this.list.add(entity);
    }

    public List<Entity> getByName(String name) {
        List<Entity> result2 = new ArrayList();
        for (Entity entity : list) {
            if (entity.getName().equals(name)) {
                result2.add(entity);

            }

        }

        return result2;
    }


    public List<Entity> getByName() {
        return list;
    }
}
