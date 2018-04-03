package lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class GroupController {

    @Autowired
    private GroupService groupService;

    @RequestMapping("/groups")
    public List<Group> getAllGroups(){
        return groupService.getAllGroups();
    }

    @RequestMapping("/groups/{name}")
    public Group getGroup(@PathVariable String name){
        return groupService.getGroup(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/groupsAdd")
    public void addGroup(@RequestBody Group group){
        groupService.addGroup(group);
    }

}
