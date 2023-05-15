package Composite;

import java.util.ArrayList;
import java.util.List;

public class Panel implements Component{
    private List<Component> components = new ArrayList<>();

    public void adaugaComponenta(Component component){
        components.add(component);
    }

    public void eliminaComponenta(Component component){
        components.remove(component);
    }
    @Override
    public void render() {
        System.out.println("Se afiseaza panoul");
        for(Component component: components){
            component.render();
        }
    }
}
