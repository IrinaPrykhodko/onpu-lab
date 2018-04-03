package lab1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GroupService {

    private List<Group> groups = new ArrayList<>(Arrays.asList(
                new Group("AI-141", "ICS", "1"),
                new Group("AI-142", "ICS", "2"),
                new Group("AI-143", "ICS", "3")
    ));

    public List<Group> getAllGroups(){
        return groups;
    }


    public Group getGroup(String name) {
        return groups.stream().filter(t -> t.getName().equals(name)).findFirst().get();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }
}
