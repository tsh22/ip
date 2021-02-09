import java.util.ArrayList;

/**
 * Provides class that supports methods to interact with the taskList
 */
public class TaskList {
    public ArrayList<Task> taskList;
    public static int taskListSize;

    /**
     * Initialises TaskList object.
     */
    public TaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    /**
     * Adds todo task to the current taskList and updates taskListSize.
     * @param task todo task to be added into taskList.
     * @return Todo task object of the added task.
     */
    public Task addTodoTask(Todo task) {
        taskList.add(task);
        taskListSize = taskList.size();
        return task;
    }

    /**
     * Adds deadline task to the current taskList and updates taskListSize.
     * @param task deadline task to be added into taskList.
     * @return Deadline task object of the added task.
     */
    public Task addDeadlineTask(Deadline task) {
        taskList.add(task);
        taskListSize = taskList.size();
        return task;
    }

    /**
     * Adds event task to the current taskList and updates taskListSize.
     * @param task event task to be added into taskList.
     * @return Event task object of the added task.
     */
    public Task addEventTask(Event task) {
        taskList.add(task);
        taskListSize = taskList.size();
        return task;
    }

    /**
     * Deletes task at specified index from the current taskList and updates taskListSize.
     * @param index the index of the task to be removed.
     * @return Task object that was deleted.
     */
    public Task deleteTask(int index) {
        Task task = taskList.get(index);
        taskList.remove(index);
        taskListSize = taskList.size();
        return task;
    }

    /**
     * Marks task as done at the specified index from the current taskList.
     * @param index the index of the task to be marked as done.
     * @return Task object that was marked as done.
     */
    public Task taskDone(int index) {
        Task task = taskList.get(index);
        task.markAsDone();
        return task;
    }

    /**
     * Returns the current taskList as an array list object.
     * @return Array list object of all current tasks in the task list.
     */
    public ArrayList<Task> getList() {
        return taskList;
    }
}
