package manager;

import tasks.Epic;
import tasks.Subtask;
import tasks.Task;

import java.util.ArrayList;

public interface TaskManager {

    public int createNewTask(Task task);

    public void updateTask(Task task);

    public ArrayList<Task> getTaskList();

    public void deleteAllTasks();

    public Task getTaskFromId(int id);

    public void deleteTaskFromId(int id);

    public int createNewEpic(Epic epic);

    public ArrayList<Epic> getEpicList();

    public Epic getEpicFromId(int id);

    public ArrayList<Subtask> getSubtasksFromEpicId (int id);

    public void deleteAllEpics();

    public void deleteEpicFromId(int id);

    public Integer createNewSubtask(Subtask subtask);


    public ArrayList<Subtask> getSubtaskList();

    public void deleteAllSubtasks();

    public void updateEpicStatus(Epic epic);

    public Subtask getSubtaskFromId(int id);
    public void deleteSubtaskFromId(int id);

    public void updateSubtask (Subtask subtask);
}
