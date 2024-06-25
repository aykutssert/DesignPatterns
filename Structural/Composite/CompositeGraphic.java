package Composite;
import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Component{

    private List<Component> components;

    public CompositeGraphic() {
        components = new ArrayList<Component>();
    }
    @Override
    public void draw() {
        for(Component component: components){
            component.draw();
        }
    }
    public void add(Component component){
        components.add(component);
    }
    public void remove(Component component){
        components.remove(component);
    }
   

}