package jjegbe01.assignment7.model;

/**
 * Created by Julian on 11/9/2015.
 */
public class Task {

    public String taskId;
    public String name;

    public Task(){
        this.taskId = "";
        this.name = "";
    }

    public void setTaskId(String taskId){
        this.taskId = taskId;
    }

    public String getTaskId(){
        return taskId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
