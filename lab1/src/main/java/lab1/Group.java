package lab1;

import java.awt.font.FontRenderContext;

public class Group {

    private String name;
    private String department;
    private String description;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Group(String name, String department, String description){
        super();
        this.name = name;
        this.department = department;
        this.description = description;
    }

    public Group(){}

}
